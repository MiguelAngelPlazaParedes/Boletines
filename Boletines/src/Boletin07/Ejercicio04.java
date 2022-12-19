/* Implementa un método que reciba como parámetro de entrada,
 * un array, y devuelva otro array (return),
 * con los elementos del primer array al revés (orden inverso)*/

package Boletin07;

public class Ejercicio04 {
	public static void main(String[] args) {
		//Definimos las variables
		int [] arrayOriginal = {5,7,8,3,4,24};
		int [] arrayInvertido = new int[arrayOriginal.length];
		
		//Mostrar el array original
		System.out.println("ARRAY ORIGINAL:");
		Ejercicio02.MostrarValoresArray(arrayOriginal);
		EscribirNumeroDeValoresDeUnArray(arrayOriginal);
		
		//Llamada a metodo para invertir array
		arrayInvertido = InvertirValoresArray(arrayOriginal, arrayInvertido);
		
		//Mostrar el array invertido
		System.out.println("\nARRAY INVERTIDO:");
		Ejercicio02.MostrarValoresArray(arrayInvertido);
		EscribirNumeroDeValoresDeUnArray(arrayInvertido);

	}
	
	/**
	 * Invierte el orden de un array.
	 * Exige el array original y una variable array de la misma longitud donde volcar los valores.
	 * Devuelve un array para asignarlo en el main.
	 * @param arrayOriginal
	 * @param arrayInvertido
	 * @return
	 */
	public static int [] InvertirValoresArray(int[] arrayOriginal, int[] arrayInvertido) {
		for(int i=0;i<arrayOriginal.length; i++){
			int cuentaAtras = arrayOriginal.length-i-1;
			for(int e=cuentaAtras;e>=0; e--){
				arrayInvertido[e] = arrayOriginal[i];
				
			}
		}
		return arrayInvertido;
	}
	
	/**
	 * Devuelve una frase diciendo la longitud del array.
	 * Exige el array del que comprobar la longitud.
	 * @param array
	 */
	public static void EscribirNumeroDeValoresDeUnArray(int [] array) {
		System.out.println("Tenemos un total de "+array.length+" valores.");
	}	
}
