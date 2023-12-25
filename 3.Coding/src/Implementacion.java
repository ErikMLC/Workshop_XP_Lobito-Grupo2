import java.util.Arrays;
public class Implementacion {
    public String[] personajes = {"C", "L", "U"}, salida = {"C", "L", "U"}, llegada = new String[3];
    public int posicion = 0; // Departure 0, llegada 1
    public void imprimirEstado() {
        System.out.println("\t ##### Problema del Lobo, la Caperucita Roja y las Uvas ##### \n");
        System.out.println("\nPERSONAJES: \n");
        System.out.println("\nL:Lobo, C:Caperucita, U:Uvas, N:Nada (No lleva Nada)\n");
        System.out.print("Personajes en Salida: ");
        imprimirPersonajes(salida);
        System.out.print("Personajes en llegada: ");
        imprimirPersonajes(llegada);
        String estado = (posicion == 0) ? "Salida" : "Llegada";
        System.out.printf("\nOrilla actual: %s%n", estado);
    }
    private void imprimirPersonajes(String[] personajes) {
        Arrays.stream(personajes)
                .filter(personaje -> personaje != null)
                .forEach(personaje -> System.out.print(personaje + " "));
        System.out.println();
    }
    public void movimientos(String movimientoPersonaje) {
        if (movimientoPersonaje.equals("N")) {
            posicion = 1 - posicion;
            return;
        }

        String[] origen = (posicion == 0) ? salida : llegada;
        String[] destino = (posicion == 0) ? llegada : salida;

        int index = encontrarPersonaje(movimientoPersonaje, origen);
        if (index == -1 || origen[index] == null) {
            System.out.println("No se encuentra la abreviatura de ese Personaje");
            return;
        }
        origen[index] = null;
        for (int i = 0; i < destino.length; i++) {
            if (destino[i] == null) {
                destino[i] = movimientoPersonaje;
                break;
            }
        }

        posicion = 1 - posicion;
    }
    private int encontrarPersonaje(String personaje, String[] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            if (personaje.equals(personajes[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean ganador() {
        return Arrays.stream(salida).allMatch(personaje -> personaje == null);
    }

    public boolean perdidaSalida() {
        if (posicion == 0) {
            return Arrays.stream(salida).allMatch(personaje -> personaje == null);
        } else {
            return (encontrarPersonaje("C", salida) != -1 && encontrarPersonaje("L", salida) != -1)
                    || (encontrarPersonaje("C", salida) != -1 && encontrarPersonaje("U", salida) != -1);
        }
    }
    public boolean perdidaLlegada(String movimientoPersonaje) {
        if (movimientoPersonaje.equals("N")) {
            return (encontrarPersonaje("C", llegada) != -1 && encontrarPersonaje("L", llegada) != -1)
                    || (encontrarPersonaje("C", llegada) != -1 && encontrarPersonaje("U", llegada) != -1);
        }
        return false;
    }
}
