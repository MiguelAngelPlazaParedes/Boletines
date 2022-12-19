/**Enunciado:
 * Desarrolla un programa que escriba en la pantalla cuánto le costará
 * comprar unas zapatillas deportivas cuyo PRECIO de catálogo es de 85€,
 * si se sabe que puede conseguir una rebaja del 15%.
 * */

package Boletin02;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio06 {

	public static void main(String[] args) {
		
		final int PRECIO;
		final double DESCUENTO;
		int pago;
		
		PRECIO = 85;
		DESCUENTO = 0.85;
		pago = (int) (PRECIO*DESCUENTO);
		
		System.out.println("El pago de las zapatillas debera de ser de "+pago+" euros.");
		
	}
}