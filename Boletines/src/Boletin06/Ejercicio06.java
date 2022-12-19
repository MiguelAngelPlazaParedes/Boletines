/**
 * Refactoriza el ejercicio 20 del tema 3,
 * boletín 5, utilizando el método
 * desarrollado en el ejercicio 5.
 */

package Boletin06;

import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 15/11/2022
 */

public class Ejercicio06 {
	/*
	 * Va a funcionar como un juego contra el bot.
	 */
	public static void main(String[] args) {
		
		int numMIN=1, numMAX=50, numAleartorio, intento = 1;
		boolean winJugador;
		// INTRODUCE NUMERO EL BOT
		numAleartorio = (int) (Math.random() * numMAX + numMIN);
		System.out.println("Num del bot "+numAleartorio);
		
		winJugador = TurnoJugador(numAleartorio, intento);
		
		if (winJugador == true) {
			System.out.println("Felicidades JUGADOR a ganado!!");
		} else {
			System.out.println("Vaya, el BOT a ganado!!");
		}
		
		
	}
	/** 
	 * INTRODUCE NUMERO JUGADOR B y BUCLE DE 5 VECES
	 */
	public static Boolean TurnoJugador(int numJugador, int i) {
		int numJugadorB = 0;
		boolean victoriaJugador = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" JUGADOR B: Adivina el numero del Jugador A: ");
		numJugadorB = sc.nextInt();

			if (numJugadorB == numJugador) { // COMPROBAMOS SI LOS NUMEROS SON IGUALES 
				victoriaJugador = true;
			} else if (numJugadorB < numJugador && i < 5) {// PERMITIMOS 5 INTENTOS 
				System.out.println("FALLO: El numero del jugador B es mayor a " + numJugadorB);
				i++;
				TurnoJugador(numJugador, i);
			} else if (numJugadorB > numJugador && i < 5){// PERMITIMOS 5 INTENTOS 
				System.out.println("FALLO: El numero  del jugador B es menor a " + numJugadorB);
				i++;
				TurnoJugador(numJugador, i);
			} else {
				System.out.println("FALLO: SUPERASTE LOS INTENTOS MAXIMOS: "+i);
			}
		
		return victoriaJugador;
	}

}
