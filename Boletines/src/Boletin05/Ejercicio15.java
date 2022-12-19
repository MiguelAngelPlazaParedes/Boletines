/**
 * Un ordenador se deprecia cada a�o un 40%
 * sobre el valor del a�o anterior.
 * Obtener un listado de la depreciaci�n
 * a lo largo de los a�os, suponiendo que
 * por debajo de 300 euros no se deprecia.
 * La salida podr�a ser:
 * PRECIO ADQUISICI�N 2000
 * A�OS VALOR_ORDENADOR
 * 1 1200
 * 2 720
 * 3 432
 * 4 259,2
 * El ordenador se depreci� en 4 a�os.*/

package Boletin05;

import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 25/10/2022 */

public class Ejercicio15 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		double valor; 
		int anio=2022, i=0;
		
		//Instruccion
		System.out.println("Introduce cuanto cuesta el ordenador:");
		Scanner input = new Scanner(System.in);
		valor= input.nextInt();
		//Condicion
		
		while (valor>=300) {
			i++;
			System.out.println("El a�o "+ ++anio +", tu ordenador valdra: "+(valor*=0.6)+"�");
		}
		
		System.out.println("El ordenador se depreci� en "+ i +" a�os.");
		
	}
}
