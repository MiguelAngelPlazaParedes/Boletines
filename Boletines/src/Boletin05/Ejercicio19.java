package Boletin05;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0, incremento = 0, suma = 0;

		do {

			System.out.println("Introduce un numero");

			numero = sc.nextInt();

			System.out.println("Introduce un factor de incremento");

			incremento = sc.nextInt();

		}

		while (numero <= 0 || incremento <= 0);

		for (int i = 0; i <= 3; i++) {

			System.out.print(numero + ", ");

			suma += numero;

			numero += incremento;

		}

		System.out.println(numero);

		System.out.println("\nSUMA DE LOS NUMEROS");

		System.out.println(suma);

	}

}