/**Enunciado:
 * Muestra los n�meros del 320 al 160,
 * contando de 20 en 20 utilizando un
 * bucle do-while.*/

package Boletin05;

/**@author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio06 {

	public static void main(String[] args) {
		//Declaramos las variables
		int i = 320;
		
		//Condiciones
		do{
			if(i%20==0){
				System.out.println(i);
			}
			i--;//i-=1;
		} while(i>=160);
		
	}

}