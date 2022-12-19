package Boletin06;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Ejercicio 7: Realizar un método que solicite al usuario un día, un mes, y un
		// año, e indique si dicha fecha es válida.
		// Nota: Se debe tener en cuenta que no todos los meses tienen los mismos días,
		// y que los años bisiestos tienen más días .
		fecha();
	}

	private static void fecha() {
		int dia, mes, anio;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una fecha valida");

		dia = sc.nextInt();
		mes = sc.nextInt();
		anio = sc.nextInt();

		if (mes > 0 && mes < 13) {

			switch (mes) {

			case 1, 3, 5, 7, 8, 10, 12:

				if (dia >= 1 && dia <= 31) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Fecha incorrecta");
				}
				break;

			case 2:

				if (anio % 4 == 0 || anio % 100 == 0) {

					if (dia >= 1 && dia <= 29) {
						System.out.println("Fecha Correcta");
					} else {
						System.out.println("Fecha Incorrecta");
					}

				} else if (dia >= 1 && dia <= 28) {
					System.out.println("Fecha Correcta");
				} else {
					System.out.println("Fecha incorrecta");
				}

				break;

			case 4, 6, 9, 11:

				if (dia >= 1 && dia <= 30) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Fecha Incorrecta");
				}
				break;

			default:
				break;
			}

		} else {
			System.out.println("Fecha Incorrecta");
		}

	}

}