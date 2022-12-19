/**Enunciado:
 * El due�o de una tienda compra un art�culo a un precio determinado.
 * Obtener el precio a que lo debe vender para obtener una ganancia del
 * 30%. Asigna el precio que creas conveniente, e intenta realizarlo
 * utilizando operadores con asignaci�n (*=, +=, -=...)
*/

package Boletin03;

//Librerias
import java.util.Scanner;
/**
 * @author Miguel�ngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//Defino variables y constantes.
		double articulo;
		final double GANANCIAS = 1.30;
		double redondeo;
		
		//Defino valores
		System.out.println("Cuanto cuesta el articulo? "); 
		articulo = input.nextDouble();
		
		//Calculo
		articulo *= GANANCIAS;
		
		//Redondear a dos decimales.
		redondeo = Math.round(articulo * 100) / 100d;
		
		//Muestro datos
		System.out.println("El articulo estar al precio de "+redondeo+" euros.");
		System.out.println("Sin redondear decimales serian "+articulo+" euros.");
		
	}
}