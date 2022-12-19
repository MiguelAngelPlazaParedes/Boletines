/**Enunciado:
 * Escribe un programa que calcule la media de un
 * conjunto de n�meros positivos introducidos por teclado.
 * A priori, el programa no sabe cu�ntos n�meros se introducir�n.
 * El usuario indicar� que ha terminado de introducir
 * los datos cuando meta un n�mero negativo.*/
package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		int i=1;
		double numero, acumulado=0;
		
		boolean fin = false;
		
		//Mensaje inicial
		System.out.println("Un numero negativo finaliza el programa.");
		
	    //Condicion
	    do {
	    	System.out.print("Introduce el "+i+"� numero: ");
	    	numero = input.nextInt();
	    	
	    	
	    	if(numero>=0){//Si el input no es negativo, sigue acumulando.
		    	acumulado=numero+acumulado;
		    	i++;
	    	} else {//Si el input es negativo, finaliza.
	    		fin = true;
	    		i--;
	    	};
	    	
	    } while (fin==false);
	    
	    System.out.println("La media de los "+i+" numeros introducidos es: "+acumulado/i);
	  }

}