import java.util.Scanner;

public class main {
    public static void main(String[] args) { Implementacion game = new Implementacion(); Scanner scanner = new Scanner(System.in); String movimientoPersonaje= ""; while(!game.ganador() && !game.perdidaLlegada(movimientoPersonaje) && !game.perdidaSalida() ){ game.imprimirEstado(); System.out.print("\nEl observador transporta a: "); movimientoPersonaje = scanner.next(); game.movimientos(movimientoPersonaje); System.out.println(); } if(game.ganador()){ System.out.println(" =====  GANASTE ====="); } else if(game.perdidaSalida() || game.perdidaLlegada(movimientoPersonaje)){ System.out.println(" ===== PERDISTE ====="); } }
}
