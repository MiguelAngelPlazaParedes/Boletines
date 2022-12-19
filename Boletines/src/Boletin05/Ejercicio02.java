/**Enunciado:
 * Muestra los n�meros m�ltiplos de 5 de 0
 * a 100 utilizando un bucle while.*/

package Boletin05;

/**@author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio02 {

	public static void main(String[] args) {
		//Declaramos las variables
		int i = 0;
		
		//Condiciones
		while(i<=100){
			i+=1;//i++;
			if(i%5==0){
				System.out.println(i);
			}
		}
		
	}

}