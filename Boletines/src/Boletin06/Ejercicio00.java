/**
 * 
 * Implementa en Java el método escribir, el cual recibe muestra por pantalla “Hola”.
 */

package Boletin06;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/11/2022
 */

public class Ejercicio00 {
	public static void main(String[] args) {
		String saludo; //Declaramos las variables
		saludo = mensaje();
		System.out.println(saludo);
	}
	
	/**
	 *Metodo/funcion que nos permite
	 *devolver un saludo al llamarlo.
	 */
	public static String mensaje() {
		String palabra;
		palabra="Hola";
		return palabra;
	}
}
