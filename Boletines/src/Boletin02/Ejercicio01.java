/**Enunciado:
 * Desarrolla un programa que calcule la media de 3 números enteros, e
 * imprima el resultado por pantalla. Ojo, los tres números iniciales son
 * enteros, pero el resultado puede no serlo.*/

package Boletin02;

import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 26/08/2022 */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		System.out.println("Debes introducir numero enteros.");
		//Primera pregunta
		System.out.println("Introduce el primer numero");
		Scanner input=new Scanner(System.in);
		int n1 = input.nextInt();
		//Segunda pregunta
		System.out.println("Introduce el segundo numero");
		int n2 = input.nextInt();
		//Tercera pregunta
		System.out.println("Introduce el tres numero");
		int n3 = input.nextInt();
		//CALCULO RESULTADO
		final int N4;
		N4 = (n1+n2+n3)/3;
		System.out.println("La media de "+n1+", "+n2+", "+n3+" es "+N4);
		
	}
}