/**Enunciado:
 * Suponiendo que ingresamos 5000 euros en un banco
 * que nos paga el 6% de INTERESes, calcula el dinero
 * que tendremos después de un año.
 * Imprima el resultado por pantalla.
 * */

package Boletin02;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio04 {

	public static void main(String[] args) {
		
		final int INGRESO;
		final double INTERES;
		int resultado;
		
		INGRESO = 5000;
		INTERES = 1.06;
		resultado = (int) (INGRESO*INTERES);
		
		System.out.println("Al finalizar el primer anio se te devolvera "+resultado+" euros.");
		
	}
}