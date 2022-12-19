/* Implementa un método que genere un array de 20 elementos,
 * con números aleatorios comprendidos entre 200 y 400,
 * de forma que no se repita ningún elemento.*/

package Boletin07;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		int [] array =new int[20];//creamos un array con la longitud expecificada en el enunciado
		int minAleatorio = 200, maxAleatorio = 400;
		
		System.out.println("ARRAY:");
		Ejercicio02.DarValoresAleatoriosEntreMinYMax(array, minAleatorio, maxAleatorio);
		Ejercicio02.MostrarValoresArray(array);
		System.out.println("Tenemos un total de "+array.length+" valores.");
		
	}
}
