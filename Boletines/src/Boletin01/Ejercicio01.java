/**Enunciado:
 * Escribe un programa que muestre tu nombre por pantalla.*/
package Boletin01;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 24/08/2022 */

public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner sc=new Scanner(System.in);
		String nombre;
		
		//Instrucciones del programa
		System.out.println("Como te llamas? "); 
		nombre = sc.nextLine();
		
		//Resultado
		System.out.println("Tu nombre es " + nombre);
	}

}
