public class Implementacion {
    public String[] personajes = {"C", "L", "U"};
    public String[] salida = {"C", "L", "U"};
    public String[] llegada = new String[3];
    public int posicion = 0; // Departure 0, llegada 1

    public void imprimirEstado(){
        System.out.println("\t ##### Problema del Lobo, la Caperucita Roja y las Uvas ##### ");
        System.out.println("\nPERSONAJES: ");
        System.out.println("\nL:Lobo, C:Caperucita, U:Uvas, N:Nada (No lleva Nada)");       
        System.out.print("\nPersonajes en Salida: ");
        imprimirPersonajes(salida);
        System.out.print("\nPersonajes en llegada: ");
        imprimirPersonajes(llegada);
        String estado = (posicion == 0) ? "Salida" : "Llegada";
        System.out.printf("\nOrilla actual: %s%n", estado);
    }

    private void imprimirPersonajes(String[] personajes){
        for (String personaje : personajes) {
            if (personaje != null) {
                System.out.print(personaje + " ");
            }
        }
        System.out.println();
    }

    public void movimientos(String movimientoPersonaje) {
        if (movimientoPersonaje.equals("N")){
            posicion = 1 - posicion;
            return;
        }
        int index = encontrarPersonaje(movimientoPersonaje, posicion == 0 ? salida : llegada);
        if (index == -1) {
            System.out.println("No se encuentra la abreviatura de ese Personaje");
            return;
        }
        if (posicion == 0) {
            salida[index] = null;
            for (int i = 0; i < llegada.length; i++) {
                if (llegada[i] == null) {
                    llegada[i] = movimientoPersonaje;
                    break;
                }
            }
        } else {
            llegada[index] = null;
            for (int i = 0; i < salida.length; i++) {
                if (salida[i] == null) {
                    salida[i] = movimientoPersonaje;
                    break;
                }
            }
        }
        posicion = 1 - posicion;
    }
    
}
