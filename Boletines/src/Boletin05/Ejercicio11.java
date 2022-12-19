/**Enunciado:
 * Escribe un programa que muestre en tres columnas,
 * el cuadrado y el cubo de los 5 siguientes n�meros
 * enteros a partir de uno que se introduce por teclado.
 * Ejemplo: numero 13
 * Numero Cuadrado Cubo
 * 13 26 39
 * 14 28 42*/
package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio11 {

	public static void main(String[] args) {
		//Declaramos las variables
		int numero, numeroCuadrado, numeroCubo, i;
		
	    Scanner input=new Scanner(System.in);
	    
	    //Instruccion
	    System.out.print("Introduzca el numero inicial: ");
	    numero = input.nextInt();
	    
	    //Primera linea
	    System.out.println("Numero\tCuadrado\tCubo");

	    //Condicion
	    for(i=0;i<=5;i++){
	    	
    		numeroCuadrado = numero;
    		numeroCubo = numero;
	    	numeroCuadrado *= 2;
	    	numeroCubo *= 3;
	    	
	    	//Resultado
	    	System.out.println(numero+"\t"+numeroCuadrado+"\t\t"+numeroCubo);
	    	
	    	//Preparar siguiente
	    	numero ++;
	    }
	    
	    
	    
	  }

}