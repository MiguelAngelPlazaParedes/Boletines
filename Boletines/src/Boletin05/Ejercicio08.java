/**Enunciado:
 * Muestra la tabla de multiplicar de un 
 * n�mero introducido por teclado.
 * Formatea la salida de la siguiente manera:
 * 2 x 1 = 2
 * 2 x 2 = 4*/
package Boletin05;

// Librerias
import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int numero, resultado, i = 0;
		
		//Instruccion
		System.out.println("Dame la numero:"); 
		numero = input.nextInt();
		
		//Condicion	
		while(i<10){
			i++;
			resultado=i*numero;
			System.out.println(numero+" x "+i+" = "+ resultado);
		}
		
	}

}