package Boletin05;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		/*
		 * 
		 * Realiza un programa que pinte una pirámide por pantalla. La altura de la
		 * 
		 * pirámide se debe pedir por teclado. El carácter con el que se pinta la
		 * 
		 * pirámide también se debe pedir por teclado.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int altura;

		int espacios;

		int cars = 1;

		char c = '$';// TODO pedir por teclado cada caracter

		// pedir por escaner la altura

		System.out.println("Dame la altura de la piramide");

		altura = sc.nextInt();

		espacios = altura - 1;

		// Por cada linea(en cada altura)

		for (int i = 1; i <= altura; i++) {

			// Pintamos espacios

			for (int j = 0; j <= espacios; j++) {

				System.out.print(" ");

			}

			// Pintamos caracteres

			for (int j = 0; j < cars; j++) {

				System.out.print(c);

			}

			// Saltamos de linea

			System.out.println();

			// Aumentamos caracteres

			cars = cars + 2;

			// Reducimos espacios

			espacios = espacios - 1;

		}

	}
	
}