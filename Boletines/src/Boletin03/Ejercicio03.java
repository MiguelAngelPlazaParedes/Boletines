/**Enunciado:
 * En un hospital existen tres �reas: Ginecolog�a, Pediatr�a y Traumatolog�a.
 * El presupuesto anual del hospital se reparte conforme a la siguiente tabla:
 * 
 * Ginecolog�a 40%
 * Traumatolog�a 30%
 * Pediatr�a 30%
 * 
 * Obtener la cantidad de dinero que recibir� cada �rea, teniendo
 * en cuenta que su presupuesto es de 120000 euros.
*/

package Boletin03;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Defino variables y sus valores.
		double ginecologia = 0.40;
		double traumatologia = 0.30;
		double pediatria = 0.30;
		int presupuesto = 120_000;
		
		//Calculo
		ginecologia = presupuesto*ginecologia;
		traumatologia = presupuesto*traumatologia;
		pediatria = presupuesto*pediatria;
				
		//Muestro datos
		System.out.println("Los presupuesto de dividen en:");
		System.out.println("Ginecolog�a: "+(int)(ginecologia)+"%\nTraumatolog�a: "+(int)(traumatologia)+"%\nPediatr�a: "+(int)(pediatria)+"%");
		
	}
}