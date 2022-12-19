/**Enunciado:
 * Realiza un minicuestionario con 3 preguntas tipo test sobre la asignatura
 * de programación. Cada pregunta tiene 3 respuestas, pero solo una válida.
 * Cada pregunta acertada sumará un punto. El programa mostrará al final la
 * calificación obtenida.
 * Ejemplo de pregunta tipo test.
 * Cúal de estas sentencias genera un error:
 * 1 – int i = “1”;
 * 2 – int i = -1;
 * 3 – int i = (int)2.2;
 * Respuesta: (el usuario tendría que responder aquí)*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio07 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int respuesta;
		
		//Pregunta 1
		System.out.println("Cual de estas sentencias genera un error:");
		System.out.println("1. int i = \"1\"");
		System.out.println("2. int i = -1");
		System.out.println("3. int i = (int)2.2");
		System.out.println("Respuesta: ");
		respuesta = input.nextInt();
		
		//Condiciones forma 1 de Pregunta 1
//		if (respuesta >= 1 && respuesta <= 3) {
//			if (respuesta == 1) {
//				System.out.println("TRUE");
//			} else {
//				System.out.println("FALSE");
//			}
//		} else {
//			System.out.println("Introducir 1, 2 o 3.");
//		};
		
		//Condiciones forma 1 de Pregunta 1
		switch (respuesta) {
			case 1:
				System.out.println("TRUE");
				break;
				
			case 2:
				System.out.println("FALSE");
				break;
				
			case 3:
				System.out.println("FALSE");
				break;
				
			default:
				System.out.println("Pon 1, 2 o 3.");
				System.exit(0);
		}
		
		//Pregunta 2
		System.out.println("Que sentencias es correcta:");
		System.out.println("1. final int I = \"1\"");
		System.out.println("2. final int i = -1");
		System.out.println("3. final int I = (int)2.2");
		System.out.println("Respuesta: ");
		respuesta = input.nextInt();
		
		//Condiciones de Pregunta 2
//		if (respuesta >= 1 && respuesta <= 3) {
//			if (respuesta == 3) {
//				System.out.println("TRUE");
//			} else {
//				System.out.println("FALSE");
//			}
//		} else {
//			System.out.println("Introducir 1, 2 o 3.");
//		};
		
		switch (respuesta) {
		case 1:
			System.out.println("FALSE");
			break;
			
		case 2:
			System.out.println("FALSE");
			break;
			
		case 3:
			System.out.println("TRUE");
			break;
			
		default:
			System.out.println("Pon 1, 2 o 3.");
			System.exit(0);
		}
		
		//Pregunta 3
		System.out.println("Que sentencias es correcta:");
		System.out.println("1. double i = \"1\"");
		System.out.println("2. double i = 2.2");
		System.out.println("3. double i = -1");
		System.out.println("Respuesta: ");
		respuesta = input.nextInt();
				
		//Condiciones de Pregunta 3
//		if (respuesta >= 1 && respuesta <= 3) {
//			if (respuesta == 2) {
//				System.out.println("TRUE");
//			} else {
//				System.out.println("FALSE");
//			}
//		} else {
//			System.out.println("Introducir 1, 2 o 3.");
//		};
		
		switch (respuesta) {
		case 1:
			System.out.println("FALSE");
			break;
			
		case 2:
			System.out.println("TRUE");
			break;
			
		case 3:
			System.out.println("FALSE");
			break;
			
		default:
			System.out.println("Pon 1, 2 o 3.");
			System.exit(0);
		}
		
	}

}