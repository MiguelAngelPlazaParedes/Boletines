/**Enunciado:
 * Realiza un programa que nos diga cu�ntos
 * d�gitos tiene un n�mero introducido por teclado.
 * Hacer uso de while o do-while.*/
package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio09 {

	public static void main(String[] args) {
		//Declaramos las variables
		int numero, numeroOriginal, i=1;
		
	    Scanner input=new Scanner(System.in);
	    
	    //Instruccion
	    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
	    numero = input.nextInt();
	    
	    //Cuanto numero	tiene valor ya podemos copiarlo
	    numeroOriginal = numero;
	    
	    //Condicion
	    while (numero >= 10) {
	      i++;
	      numero /= 10;
	      //Porque 100 entre 10 da 2 mas el 1 con el que empezamos,
	      //3, como los 3 digitos del 100.	      
	    }
	    
	    System.out.println("El numero "+numeroOriginal+" tiene "+i+" digito/s.");
	  }

}