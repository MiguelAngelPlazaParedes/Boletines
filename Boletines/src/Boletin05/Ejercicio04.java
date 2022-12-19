/**Enunciado:
 * Muestra los números del 320 al 160,
 * contando de 20 en 20 hacia atrás
 * utilizando un bucle for.*/

package Boletin05;

/**@author MiguelÁngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio04 {

	public static void main(String[] args) {
		//Declaramos las variables
		int i;
		
		//Condiciones
		for(i=320;i>=160;i--){
			if(i%20==0){
				System.out.println(i);
			}
		}
		
	}

}