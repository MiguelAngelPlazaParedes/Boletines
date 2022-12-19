/** 
 * Programa que visualice todos los a�os bisiestos
 * comprendidos entre 2000 y 2100, ambos inclusive.
 * Un a�o es bisiesto si es divisible entre 4 y
 * no es divisible entre 100 o si es divisible entre 400.
 * Un n�mero es divisible por otro si el resto de la
 * divisi�n es 0.*/
package Boletin05;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 25/10/2022 */

public class Ejercicio16 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int anio;
		
		//Condicion
		for(anio=2000;anio<=2100;anio++) {
			
			if((anio % 4==0 && !(anio % 100==0)) || (anio % 400==0)) {
				System.out.println(anio);
			}
			
		}
		
	}
}