/**
 * Realizar un método que tenga como parámetro
 * de entrada dos cadenas, y muestre por pantalla,
 * la concatenación de ambas cadenas.
 */

package Boletin06;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 15/11/2022
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		String palabra1 = "Miguel", palabra2 = "Angel", nombre;
		nombre=UnirNombre(palabra1, palabra2);
		System.out.print("Nombre: "+nombre);
	}
	
	public static String UnirNombre(String valor1, String valor2) {
        String juntar;
        juntar=valor1+" "+valor2;
        return juntar;
	}
}
