package Boletin05;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*
		 * Programa que permita el siguiente juego: Un primer jugador teclea un numero
		 * entre 1 y 50 (debe comprobarse que sea correcto). El segundo jugador
		 * intentara� adivinarlo. Para ello tendra como maximo 5 intentos y el programa
		 * ira� sacando mensajes indicando si el numero a adivinar es mayor o menor al
		 * numero introducido por el jugador 2. Al final se indicara� si el jugador ganó
		 * o perdia. Si se adivina el numero antes de que finalicen los 5 intentos el
		 * programa finaliza.
		 */

		int numJugadorA;
		int numJugadorB = 0;

		Scanner sc = new Scanner(System.in);

		// INTRODUCE NUMERO JUGADOR A
		do {
			System.out.print(" JUGADOR A: introduce un numero del 1 al 50: ");
			numJugadorA = sc.nextInt();
		} while (numJugadorA < 1 || numJugadorA > 50); // COMPROBAMOS QUE EL NUMERO ES CORRECTO

		// INTRODUCE NUMERO JUGADOR B
		for (int i = 1; i <= 5 && numJugadorA != numJugadorB; i++) { // PERMITIMOS 5 INTENTOS 
			System.out.print(" JUGADOR B: Adivina el numero del Jugador A: ");
			numJugadorB = sc.nextInt();

			if (numJugadorB == numJugadorA) { // COMPROBAMOS SI LOS NUMEROS SON IGUALES 
				System.out.println("Felicidades JUGADOR B a ganado!!");

			} else if (numJugadorB < numJugadorA) {
				System.out.println("FALLO: El numero del jugador B es mayor a " + numJugadorB);
			} else {
				System.out.println("FALLO: El numero  del jugador B es menor a " + numJugadorB);
			}
		}

		if (numJugadorA != numJugadorB)
			System.out.println("Felicidades JUGADOR A a ganado!!");

	}

}
