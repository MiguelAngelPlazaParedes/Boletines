/**Enunciado:
 * Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspondiente nombre del día de la semana.*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 05/10/2022 */

public class Ejercicio03 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int lado;
		
		//Instrucciones del programa
		System.out.println("De que lado a salido el dado? Ejem. 1, 2... hasta 7."); 
		lado = input.nextInt();
		
		//Condiciones
		if (lado == 1){
			//Posible resultado
			System.out.println("Corresponde a Lunes.");
		} else if (lado == 2){
			//Posible resultado
			System.out.println("Corresponde a Martes.");
		} else if (lado == 3){
			//Posible resultado
			System.out.println("Corresponde a Miercoles.");
		} else if (lado == 4){
			//Posible resultado
			System.out.println("Corresponde a Jueves.");
		} else if (lado == 5){
			//Posible resultado
			System.out.println("Corresponde a Viernes.");
		} else if (lado == 6){
			//Posible resultado
			System.out.println("Corresponde a Sabado.");
		} else if (lado == 7){
			//Posible resultado
			System.out.println("Corresponde a Domingo.");
		} else if (lado > 7 || lado < 1){
			//Posible resultado
			System.out.println("Illo k del 1 al 7 que no te enteras.");
		};
		
	}

}