/**Enunciado:
 * Realiza un programa que pida 3 notas y calcule su media. El programa ha
 * de indicar la nota en formato boletín (insuficiente, suficiente, bien,
 * notable o sobresaliente).*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio05 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int controlUno, controlDos, controlTres, controlmedia;
		
		//Instrucciones del programa
		System.out.println("Nota del primer control?"); 
		controlUno = input.nextInt();
		System.out.println("Nota del segundo control?");
		controlDos = input.nextInt();
		System.out.println("Nota del tercer control?");
		controlTres = input.nextInt();
		
		controlmedia = (controlUno+controlDos+controlTres)/3;
		
		//Condiciones
		if (controlUno >= 0 && controlUno <= 10) {
			if (controlDos >= 0 && controlDos <= 10) {
				if (controlTres >= 0 && controlTres <= 10) {
					
					if (controlmedia >= 0 && controlmedia <5){
						//Posible resultado
						System.out.println("insuficiente");
					} else if (controlmedia == 5){
						//Posible resultado
						System.out.println("suficiente");
					} else if (controlmedia == 6){
						//Posible resultado
						System.out.println("bien");
					} else if (controlmedia == 7 || controlmedia == 8){
						//Posible resultado
						System.out.println("notable");
					} else if (controlmedia == 9 || controlmedia == 10){
						//Posible resultado
						System.out.println("sobresaliente");
					} else {
						System.out.println("Algo salio mal.");
					};
					
				} else {
					System.out.println("Pon una nota en entre 0 y 10 al control 3.");
				};
			} else {
				System.out.println("Pon una nota en entre 0 y 10 al control 2.");
			};
		} else {
			System.out.println("Pon una nota en entre 0 y 10 al control 1.");
		};
		
	}

}