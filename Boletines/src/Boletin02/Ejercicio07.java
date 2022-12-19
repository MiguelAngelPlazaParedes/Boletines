/**Enunciado:
 * Desarrolla un programa que calcula como aumentaría el valor de una
 * inversión de 10000 euros a un 10% el primer año, pierde un valor de 500
 * euros durante el segundo y aumenta un 12% durante el tercero.
 * Utiliza operadores de asignación ampliada para realizar los cálculos.
 * */

package Boletin02;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int Inversion = 10_000;
		final double PRIMERANIO = 1.10;
		final int SEGUNDOANIO = 500;
		final double TERCERANIO = 1.12;
		
		Inversion*=PRIMERANIO;
		Inversion-=SEGUNDOANIO;
		Inversion*=TERCERANIO;
		
		System.out.println("Al final del tercer anio tendras "+Inversion+" euros.");
		
	}
}