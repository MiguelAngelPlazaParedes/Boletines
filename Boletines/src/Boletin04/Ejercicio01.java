/**Enunciado:
 * Escribe un programa que pida por teclado un día de la semana y que
 * imprima por pantalla qué asignatura toca a primera hora ese día.*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 04/10/2022 */

public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		String diaInput, dia;
		
		//Instrucciones del programa
		System.out.println("Que dia de la semana es? Ejem. Lunes, Martes..."); 
		diaInput = input.nextLine();
		dia = diaInput.toLowerCase();//Para que lo transforme en minusculas.
				
		//Condiciones
		if (dia.equals("lunes")){
			//Posible resultado
			System.out.println("Tienes Entorno de Desarrollo a primera.");
		} else if (dia.equals("martes")){
			//Posible resultado
			System.out.println("Tienes Programacion a primera.");
		} else if (dia.equals("miercoles")){
			//Posible resultado
			System.out.println("Tienes Programacion a primera.");
		} else if (dia.equals("jueves")){
			//Posible resultado
			System.out.println("No tienes clase.");
		} else if (dia.equals("viernes")){
			//Posible resultado
			System.out.println("No tienes clase.");
		} else {
			//Posible resultado si escribe cualquier otra cosa
			System.out.println("Eres pendejo?");
		};
		
	}

}