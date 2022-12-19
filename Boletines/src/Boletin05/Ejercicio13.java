/**Enunciado:
 * Escribe un programa que lea una lista de diez n�meros
 * y determine cu�ntos son positivos, y cu�ntos son negativos.*/
package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio13 {

	public static void main(String[] args) {
		//Declaramos las variables
		int numero, numeroPositivo=0, numeroNegativo=0, i;
		
	    Scanner input=new Scanner(System.in);
	    
	    //Bucle para contrar 10 repeticiones
	    for(i=1;i<=10;i++) {
	    	//Instruccion
	    	System.out.print("Dime el "+i+"� numero: ");
	    	numero = input.nextInt();
	    	//Condicio para contar como positivo o negativo
		    if(numero>=0) {
		    	numeroPositivo++;
		    } else {
		    	numeroNegativo++;
		    }
	    }
	    
	    System.out.println("Han sido "+numeroPositivo+" numeros positivo y "+numeroNegativo+" negativos.");
	  }

}