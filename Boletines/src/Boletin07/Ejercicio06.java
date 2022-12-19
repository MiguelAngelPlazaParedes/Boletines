/*
 * (Sistema de Reserva de Vuelos).
 * Una peque�a compa��a a�rea acaba de comprar un ordenador
 * para su sistema de reserva de vuelos.
 * Escribir un programa que asigne asientos para cada
 * vuelo del �nico avi�n de la compa��a (capacidad: 20 asientos).
 * El programa debe contemplar zona de fumadores y no fumadores.
 * Los no fumadores ocuparan los asientos 1-15 y los fumadores el resto.
 * Utiliza un array de una dimensi�n para representar los asientos del avi�n.
 * Utiliza 0 para indicar asiento vac�o y 1 asiento ocupado.
 * El programa nunca debe hacer "overbooking", es decir,
 * reasignar un asiento que ya est� ocupado.
 * Si la secci�n de fumadores se llena,
 * el programa debe preguntar al pasajero si desea un asiento
 * en la zona de no fumadores, y viceversa.
 * Si acepta, entonces has de realizar la asignaci�n de asiento correspondiente.
 * Si no acepta, avise de la salida del pr�ximo vuelo.
 */

package Boletin07;

//Librerias
import java.util.Scanner;

/**
* @author MiguelAngelPlazaParedes
* @since 13/12/2022 */

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] asientos = new int[20];
    	int[] asientosCopia = new int[20];
		boolean continuar = true;
		boolean continuarSubMenu = true;
		int opcionUsuario = 0;
		int opcionUsuarioSubMenu = 0;
		boolean iguales;
	 
		//Pongo el array con todos los valores en 0
		for(int i=0; i<asientos.length; i++) {
			asientos[i] = 0;
		}
		
		//MENU
		while (continuar){
	    	System.out.println("Que desea hacer?");
	        System.out.println("1.\tCoger asiento en no fumadores");
	        System.out.println("2.\tCoger asiento en fumadores");
	        System.out.println("3.\tSalir");
	        
	        opcionUsuario = input.nextInt();
		    switch (opcionUsuario){
		        case 1:
		        	System.out.println("\nSeleccionaste resevar sitio no fumadores.");
		        	
		        	//copio el array asientos en asientosCopia
		        	System.arraycopy(asientos, 0, asientosCopia, 0, asientos.length);
		        	
		        	asientos = Poner1enArrayUnoDeLos15PrimerosValores(asientos);
		        	
		        	//los comparo
		        	iguales = CompararArrays(asientos, asientosCopia);
		        	//MostrarTodoElArray(asientosCopia);
		        	
		        	if(iguales==true) {
		        		System.out.println("Los asientos estan llenos.\n");
		        		while (continuarSubMenu){
		        			System.out.println("Quieres reservar en los fumadores?");
		        	        System.out.println("1.\tSi");
		        	        System.out.println("2.\tNo");
		        	        
		        	        opcionUsuarioSubMenu = input.nextInt();
		        	        switch (opcionUsuarioSubMenu){
			    		        case 1:
			    		        	System.out.println("\nSeleccionaste reservar en los fumadores\n");
			    		        	Poner1enArrayUnoDeLos5UltimosValores(asientos);
			    		        	continuarSubMenu = false;
			    		        	break;
			    		        case 2:
			    		        	System.out.println("\nSeleccionaste no reservar en los fumadores\n");
			    		        	continuarSubMenu = false;
			    		        	break;
			    		        default:
			    		            System.out.println("\nIntroduce una opcion correcta, 1, 2\n");
		        	        }
		        	    }
		        		continuarSubMenu = true;
		        	} else {
		        		System.out.println("Asiento reservado.\n");
		        	}
		            break;
		        case 2:
		        	System.out.println("\nSeleccionaste resevar sitio fumadores.");
		        	System.arraycopy(asientos, 0, asientosCopia, 0, asientos.length);
		        	asientos = Poner1enArrayUnoDeLos5UltimosValores(asientos);
		        	iguales = CompararArrays(asientos, asientosCopia);
		        	//MostrarTodoElArray(asientosCopia);
		        	
		        	if(iguales==true) {
		        		System.out.println("Los asientos estan llenos.\n");
		        		while (continuarSubMenu){
		        			System.out.println("Quieres reservar en los no fumadores?");
		        	        System.out.println("1.\tSi");
		        	        System.out.println("2.\tNo");
		        	        
		        	        opcionUsuarioSubMenu = input.nextInt();
		        	        switch (opcionUsuarioSubMenu){
			    		        case 1:
			    		        	System.out.println("\nSeleccionaste reservar en los no fumadores\n");
			    		        	Poner1enArrayUnoDeLos15PrimerosValores(asientos);
			    		        	continuarSubMenu = false;
			    		        	break;
			    		        case 2:
			    		        	System.out.println("\nSeleccionaste no reservar en los no fumadores\n");
			    		        	continuarSubMenu = false;
			    		        	break;
			    		        default:
			    		            System.out.println("\nIntroduce una opcion correcta, 1, 2\n");
		        	        }
		        	    }
		        	} else {
		        		System.out.println("Asiento reservado.\n");
		        	}
	        		continuarSubMenu = true;
		            break;
		        case 3:
		        	continuar = false;
		        	break;
		        default:
		            System.out.println("Introduce una opcion correcta, 1, 2 o 3");
		    }
	    }

	}
	
	/**
	 * Cambia el primer 0 que encuentre en un array por 1, al hacerlo se sale.
	 * Solo ve los 15 primeros elementos.
	 * Exige el array como entrada y salida del array modificado.
	 * @param array
	 * @return
	 */
	public static int[] Poner1enArrayUnoDeLos15PrimerosValores(int[] array) {
		boolean reservado = false;
		for(int i=0;i<15; i++){
			if (array[i] == 0 & reservado == false) {
				array[i] = 1;
				reservado = true;
				System.out.println("Asiento "+array[i]+" reservado.\n");
	        	//los muestro
	        	MostrarTodoElArray(array);
			}
		}
		
		return array;
	}
	
	/**
	 * Cambia el primer 0 que encuentre en un array por 1, al hacerlo se sale.
	 * Solo ve los 5 ultimos elementos.
	 * Exige el array como entrada y salida del array modificado.
	 * @param array
	 * @return
	 */
	public static int[] Poner1enArrayUnoDeLos5UltimosValores(int[] array) {
		boolean reservado = false;
		for(int i=array.length-5;i<20; i++){
			if (array[i] == 0 & reservado == false) {
				array[i] = 1;
				reservado = true;
				System.out.println("Asiento "+array[i]+" reservado.\n");
	        	MostrarTodoElArray(array);
			}
		}
		
		return array;
	}
	
	/**
	 * Motrar valores que pertenecen a un array.
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void MostrarTodoElArray(int[] array) {
		System.out.println("Ocupacion:");
		for(int i=0;i<array.length; i++){
		    System.out.println("Nota del alumno "+(i+1)+": "+array[i]);
		}
		System.out.println();
	}
	
	/**
	 * Compara los valores que pertenecen a cada array de uno en uno y si uno es distinto devuelve un boleano falso.
	 * Exige 2 arrays como entrada y un boleano de salida.
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean CompararArrays(int[] array1, int[] array2){
	      boolean iguales = true;
	      for (int i = 0; i < array1.length; i++) {
	            if (array1[i] != array2[i]) {
	            	iguales = false;
	            }
	        } 
	      return iguales;
	   }
}
