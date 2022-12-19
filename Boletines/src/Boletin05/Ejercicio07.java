/**Enunciado:
 * Realiza el control de acceso a una caja fuerte. 
 * La combinaci�n ser� un n�mero de 4 cifras que 
 * estar� guardado en una variable.
 * El programa nos pedir� la combinaci�n para abrirla.
 * Si no acertamos, se nos mostrar� el mensaje 
 * �Lo siento, esa no es la combinaci�n� y si acertamos
 * se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.*/
package Boletin05;

// Librerias
import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio07 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int contra = 1234;
		
		//Instrucciones del programa
		System.out.println("Dame la contrase�a para abrir la caja:"); 
		contra = input.nextInt();
		
		//Condicion para la instruccion		
		while(contra!=1234){
			if (contra!=1234) {
				System.out.println("Lo siento, esa no es la combinaci�n");
			};
			System.out.println("Dame una contrase�a de 4 cifras:"); 
			contra = input.nextInt();
		}
		
		System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
		
	}

}