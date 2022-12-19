/**Enunciado:
 * Escribe un programa que calcule el salario semanal de un trabajador
 * teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41,
 * se pagan a 16 euros la hora*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 08/10/2022 */

public class Ejercicio04 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int horas;
		final int PRIMERASHORAS = 480;
		
		//Instrucciones del programa
		System.out.println("Cuantos horas de trabajo?"); 
		horas = input.nextInt();
		
		//Condiciones
		if (horas > 0 && horas <= 168) {
			if (horas == 0){
				//Posible resultado
				System.out.println("Trabaja un poquito mi arma.");
			} else if (horas >= 1 && horas <= 40){
				//Posible resultado
				System.out.println("Cobras "+horas*12+" euros a 12 la hora.");
			} else if (horas >= 41){
				//Posible resultado
				System.out.println("Cobras "+((horas-40)*16+PRIMERASHORAS)+" euros a 16 la hora.");
				//System.out.println("Cobras "+((horas-40)*16)+PRIMERASHORAS+" euros a 16 la hora.");
			};
		} else {
			System.out.println("Pero hombre dime al menos algo posible. De 0 a 168.");
		}
		
		
	}

}