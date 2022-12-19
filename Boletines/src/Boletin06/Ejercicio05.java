/**
 * Crear un método que reciba dos números
 * como parametros de entrada,
 * y devuelva un número aleatorio que se
 * encuentre entre ambos números.
 * Utilizar para ello el método Math.random() .
 */

package Boletin06;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 15/11/2022
 */

public class Ejercicio05 {
	public static void main(String[] args) {
		int numero1 = 3, numero2 = 1, numeroAleatorio;
		numeroAleatorio=DevolverNumero(numero1, numero2);
		System.out.print("El numero aleatorio es: "+numeroAleatorio);
	}
	
	public static int DevolverNumero(int valor1, int valor2) {
        return (int) (Math.random() * (valor2 - valor1) + valor1);
	}
}
