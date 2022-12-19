/**
 * Escribe un programa que diga si un n�mero
 * introducido por teclado es o no primo.
 * Un n�mero primo es aquel que s�lo es
 * divisible entre �l mismo y la unidad.
 * Por ejemplo el 7. Pues recorriendo
 * desde el 1 hasta el 7 veo que 7 solo es
 * divisible por 1 y por 7 -> es primo.
 **/

package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 25/10/2022 */

public class Ejercicio17 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input = new Scanner(System.in);
		int numero, i = 2;
		boolean primo = false;
		
		//Instruccion
		System.out.println("Introduce un numero: ");
		numero= input.nextInt();
		
		//Condicion
		while ((i < numero)&&(primo == false)) {
			if (numero % i == 0) {
				primo = true;
			}
			i++;
		}
		if (primo == false) {
			System.out.println(numero+" es primo.");
		} else {
			System.out.println(numero+" no es primo.");
		}
		
	}
}
