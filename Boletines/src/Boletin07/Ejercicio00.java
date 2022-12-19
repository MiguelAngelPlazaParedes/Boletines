/*Hacer un método que reciba una array de enteros como parámetro de entrada,
y que devuelva cuántos números pares contiene dicho array*/

package Boletin07;

public class Ejercicio00 {
	public static void main(String[] args) {
		
		int [] array = {5,7,8,3,12,45,95};
		int contarPares = 0;
		MostrarValoresArray(array);
		System.out.println("\nTenemos un total de "+array.length+" valores.");
		contarPares = ContarValoresParesArray(array, contarPares);
		System.out.println("Tenemos un total de "+contarPares+" numeros pares.");
	}
	
		/**
		 * Motrar valores que pertenecen a un array.
		 * Exige el array como entrada.
		 * @param array
		 */
		public static void MostrarValoresArray(int[] array) {
			for(int i=0;i<array.length; i++){
			    System.out.println("Valor "+i+": "+array[i]);
			}
		}
		
		/**
		 * Para contar cuantos valores pares tiene un array.
		 * Exige el array y una variable int de valor 0.
		 * @param array
		 * @param contarPares
		 * @return
		 */
		public static int ContarValoresParesArray(int[] array, int contarPares) {
			for(int i=0;i<array.length; i++){
				if (array[i] % 2 == 0) {
					contarPares++;
				}
			}
			return contarPares;
		}
			
}
