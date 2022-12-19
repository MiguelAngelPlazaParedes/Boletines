/**Enunciado:
 * Desarrolla un programa que transforme 86 grados FAHRENHEIT a CELSIUS
 * y 33 grados CELSIUS a FAHRENHEIT. Imprima el resultado por pantalla.
 * */

package Boletin02;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		final double  FAHRENHEIT, CELSIUS;
		double fahACel, celAFah;
		
		FAHRENHEIT = 86;
		CELSIUS = 33;
		fahACel = (((FAHRENHEIT-32)*5)/9);
		celAFah = (((CELSIUS*9)/5)+32);
		
		System.out.println("De "+FAHRENHEIT+" grados FAHRENHEIT a grados CELSIUS son "+fahACel+".");
		System.out.println("De "+CELSIUS+" grados CELSIUS a grados FAHRENHEIT son "+celAFah+".");
	}
}