package Boletin06;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cuantas filas?");
		int altura = sc.nextInt();

		piramideMaligna(altura);

	}

	public static void piramideMaligna(int altura) {

		for (int externo = 1; externo <= altura; externo++) {

			asteriscosMalignos(altura, externo);

			for (int interno = 1; interno <= externo; interno++) {
				System.out.print(interno);
			}

			for (int interno = externo - 1; interno >= 1; interno--) {
				System.out.print(interno);
			}

			asteriscosMalignos(altura, externo);
			System.out.println();

		}

		for (int lcv = 0; lcv < (altura * 2) + 1; lcv++) {
			System.out.print("*");
		}

	}

	public static void asteriscosMalignos(int altura, int externo) {
		
		for (int interno = altura - externo + 1; interno > 0; interno--) {
			System.out.print("*");
		}

	}

}
