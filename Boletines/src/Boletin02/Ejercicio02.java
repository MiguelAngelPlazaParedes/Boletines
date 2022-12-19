/**Enunciado:
 * Desarrolla un programa que calcule la media de 3 números reales,
 * e imprima el resultado por pantalla.*/

package Boletin02;

import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 26/08/2022 */

public class Ejercicio02 {

	public static void main(String[] args) {
				
		System.out.println("Debes introducir numero enteros.");
		System.out.println("Introduce el primer numero");
		//Primera pregunta
		Scanner input=new Scanner(System.in);
		double n1 = input.nextInt();
		System.out.println("Introduce el segundo numero");
		//Segunda pregunta
		double n2 = input.nextInt();
		System.out.println("Introduce el tres numero");
		//Tercera pregunta
		double n3 = input.nextInt();
		//CALCULO RESULTADO
		double n4;
		n4 = (n1+n2+n3)/3;
		System.out.println("La media de "+n1+", "+n2+", "+n3+" es "+n4);
		
	}
}