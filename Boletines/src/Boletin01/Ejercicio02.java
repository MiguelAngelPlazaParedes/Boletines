/**Enunciado:
 * Modifica el programa anterior para que además se muestre tu dirección y tu número de teléfono.
 * Asegúrate de que los datos se muestran en líneas separadas.*/
package Boletin01;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 24/08/2022 */

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner sc=new Scanner(System.in);
		String nombre;
		String direccion;
		int numero;
		
		
		//Instrucciones del programa
		System.out.println("Como te llamas?"); 
		nombre = sc.nextLine();
		System.out.println("Donde vives?");
		direccion = sc.nextLine();
		System.out.println("Cual es tu numero de telefono?");
		numero = sc.nextInt();
		
		//Resultado
		System.out.println("Tu nombre es "+nombre+", vives en "+direccion+" y tu telefono es "+numero+".");
	}

}