/* Implementa un método que genere un array de 20 elementos,
 * con números aleatorios comprendidos entre 100 y 300,
 * de forma que no se repita ningún elemento.*/

package Boletin07;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		int [] array =new int[20];//creamos un array con la longitud expecificada en el enunciado
		int minAleatorio = 100, maxAleatorio = 300;
		
		System.out.println("ARRAY:");
		DarValoresAleatoriosEntreMinYMax(array, minAleatorio, maxAleatorio);
		MostrarValoresArray(array);
		System.out.println("Tenemos un total de "+array.length+" valores.");
		
	}
	
	/**
	 * Otorgar valores entre 100 y 300 en toda la longitud del array,
	 * comprobando que este valor no se repita anteriormente.
	 * Exige el array como entrada, el numero max y min del num aleatorio.
	 * @param array
	 */
	public static void DarValoresAleatoriosEntreMinYMax(int[] array, int minAleatorio,int maxAleatorio) {
		for(int i=0;i<array.length; i++){
			int aleatorio = (int) (Math.random()*maxAleatorio+(minAleatorio-1));
			boolean repetido = false;
			for(int e=i-1;e>=0; e--){
				if (aleatorio == array[e])
					repetido = true;
			}
			
			if ( array[i]==0 && repetido == false) {
				array[i] = aleatorio;
			} else {
				i--;
			}
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
}
