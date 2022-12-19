/**Enunciado:
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora.
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
 * Sólo se tienen en cuenta las horas, 
 * los minutos no se deben introducir por teclado.*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 05/10/2022 */

public class Ejercicio02 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int hora;
		
		//Instrucciones del programa
		System.out.println("Dime la hora actual, ejemplo: 1, 2... hasta 24."); 
		hora = input.nextInt();
		
		//Condiciones
		if (hora >= 6 && hora <= 12){
			//Posible resultado
			System.out.println("Buenos dias.");
		} else if (hora >= 13 && hora <= 20){
			//Posible resultado
			System.out.println("Buenas tardes.");
		} else if (hora >= 21 && hora <= 24 ||  hora >= 1 && hora <= 5){
			//Posible resultado
			System.out.println("Buenas noches.");
		} else if (hora > 24 || hora < 1 ){
			//Posible resultado
			System.out.println("Illo k entre 1 y 24.");
		};
		
	}

}