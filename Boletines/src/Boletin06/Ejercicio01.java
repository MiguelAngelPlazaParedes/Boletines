/**
 * Implementar en Java un método,
 * que reciba 3 números enteros como entrada,
 * y a continuación devuelva cuál es el mayor
 * de los 3 números con return. 
 */

package Boletin06;
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/11/2022
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		//Declaramos las variables
		Scanner input = new Scanner(System.in);
		int numeroUno, numeroDos, numeroTres, numeroMayor;
		//Instruccion de los 3 numeros
		System.out.print("Introduce un primer numero: ");
		numeroUno= input.nextInt();
				
		System.out.print("Introduce un segundo numero: ");
		numeroDos= input.nextInt();
				
		System.out.print("Introduce un tercer numero: ");
		numeroTres= input.nextInt();
		//Llamo al 
		numeroMayor=mostrarMayor(numeroUno, numeroDos, numeroTres);
		
		System.out.print(numeroMayor);
	}
	
	/**
	 *Metodo/funcion que compara los 3 numeros
	 *y devolvuelve el numero mayor.
	 */
	public static int mostrarMayor(int num1, int num2, int num3) {
		int numMax;
		if (num1 > num2) {
			numMax = num1;
		} else {
			numMax = num2;
		};
		if (numMax < num3) {
			numMax = num3;
		};
		return numMax;
	}
}
