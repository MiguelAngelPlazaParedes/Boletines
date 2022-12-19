/**Enunciado:
 * Muestra los n�meros m�ltiplos de 5 de 0 a 100
 * utilizando un bucle for.*/
package Boletin05;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaramos las variables
		int i;
		
		//Condiciones
		for(i = 0;i<=100;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
		
	}

}