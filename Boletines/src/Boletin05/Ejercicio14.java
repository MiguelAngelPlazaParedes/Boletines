/**Enunciado:
 * Haz una funci�n que dados 3 n�meros a, b y c 
 * introducidos por teclado devuelva cu�l es el mayor*/
package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
        
        //Instruccion
		System.out.print("Introduce el 1� numero: ");
		n1 = input.nextInt();
		System.out.print("Introduce el 2� numero: ");
		n2 = input.nextInt();
		System.out.print("Introduce el 3� numero: ");
		n3 = input.nextInt();
		
		//Condicion
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("El mayor es: " + n1);                                             
			} else {
				System.out.println("El mayor es: " + n3);     
			};
		} else if (n2 > n3) {
			System.out.println("El mayor es: " + n2);
		} else {
			System.out.println("El mayor es: " + n3);
		};
		
	}
}