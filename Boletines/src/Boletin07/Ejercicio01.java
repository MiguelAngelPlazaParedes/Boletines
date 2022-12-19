/*Implementa un método que dado un array cargado aleatoriamente,
 *genere a partir de él otro array que contenga los elementos
 *pares que se encuentran en el primero.*/

package Boletin07;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		int longitudArray = (int) (Math.random()*10)+1;//+1 para que no empiece por 0, 10 es el max
		int [] array =new int[longitudArray];//creamos un array con la longitud que de el num aleatorio
		int contarPares = 0;//variable para almacenar el numero de valores pares de un array
		
		
		System.out.println("ARRAY ORIGINAL");
		DarValoresAleatoriosEntre1y20(array);
		MostrarValoresArray(array);
		System.out.println("Tenemos un total de "+array.length+" valores.");
		
		System.out.println("\nARRAY PARES");
		contarPares = ContarValoresParesArray(array, contarPares);
		
		int [] arrayPares =new int[contarPares];//Creo el array que almacenará los numero pares del array original
		AsignarValoresParesANuevoArray( array, arrayPares);
		
		System.out.println("Tenemos un total de "+contarPares+" numeros pares.");
		
	}
	/**
	 * Otorgar valores entre 1 y 20 en toda la longitud del array
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void DarValoresAleatoriosEntre1y20(int[] array) {
		for(int i=0;i<array.length; i++){
		    array[i] = (int) (Math.random()*20)+1;
		}
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
	 * Devuelve el numero de contar los valores pares del array, para asignar a una variable.
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
	/**
	 * Asigna los valores pares de un array original a un array en blanco con la longitud ya asignada.
	 * Exige el array original y el array donde se volcaran los valores.
	 * @param array
	 * @param arrayPares
	 */
	public static void AsignarValoresParesANuevoArray(int[] array, int[] arrayPares) {
		int e = 0;//Contador para doble buble y diferenciar entre array y arrayPares
		
		for(int i=0;i<arrayPares.length; i++) {
			while (arrayPares[i] == 0) {
				if (array[e] % 2 == 0) {
					arrayPares[i] = array[e];
					System.out.println("Valor "+i+": "+arrayPares[i]);
				}
				e++;
			}
		}
		
	}
}
