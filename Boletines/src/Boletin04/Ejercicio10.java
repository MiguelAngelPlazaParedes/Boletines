/**Enunciado:
 * Realiza un programa que diga si un número introducido
 * por teclado espar y/o divisible entre 5.*/

package Boletin04;

import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int numero;
		
		//Pregunta
		System.out.println("Introduzca un numero: ");
		numero = input.nextInt();
				
		//Condiciones		
		if ((numero % 2) == 0) {//Que es par
			
			if ((numero % 5) == 0) {//Que es divisible entre 5
				System.out.println("El numero es par y divisible entre 5.");
			} else {//Que NO es divisible entre 5
				System.out.println("El numero es par y no es divisible entre 5.");
			}
			
		} else {//Que es impar
			
			if ((numero % 5) == 0) {
				System.out.println("El numero es impar y divisible entre 5.");
			} else {
				System.out.println("El numero es impar y no es divisible entre 5.");
			}
			
		}
				
	}
}