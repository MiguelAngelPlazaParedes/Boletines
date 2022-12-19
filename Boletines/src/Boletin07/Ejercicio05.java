/* Deseamos realizar un programa para el cÃ¡lculo de
 * ciertos valores con las notas de la clase.
 * Queremos calcular la nota media, la nota mÃ¡s alta,
 * la mÃ¡s baja, cuÃ¡ntos alumnos tienen una nota superior a la media
 * y cuÃ¡ntos tienen una nota inferior a la media.
 * El programa debe presentar un menÃº de opciones para que el
 * usuario elija lo que desee hacer y tambiÃ©n se presentarÃ¡n los resultados.
 * El array de notas se generarÃ¡ aleatoriamente con notas de 1 a 10.
 * Ejemplo del menÃº principal:
 * Â¿QuÃ© desea hacer?
 * 1.	Calcular nota media
 * 2.	Ver la nota mÃ¡s alta
 * 3.	Ver la nota mÃ¡s baja
 * 4.	NÃºmero de alumnos por encima de la media
 * 5.	NÃºmero de alumnos por debajo de la media
*/

package Boletin07;

//Librerias
import java.util.Scanner;

/**
* @author MiguelAngelPlazaParedes
* @since 13/12/2022 */

public class Ejercicio05 {
	public static void main(String[] args) {
		//Definimos las variables
		Scanner input=new Scanner(System.in);
		double[] notas =new double[21];//array para las notas con el numero de alumnos
		int opcionUsuario = 0;//para menu opcion seleccionada
		double notaMedia = 0;//guardar la nota media
		boolean continuar = true;//para menu, si pulsas 6 Ã³ lo que es lo mismo "salir" cambia
		
		//Llamada a metodo para asignar notas aleatorias en todo el array
		DarValoresAleatoriosEntre1y10(notas);
		
		//MENU
		while (continuar){
        	System.out.println("Que desea hacer?");
            System.out.println("1.\tCalcular nota media");
            System.out.println("2.\tVer la nota mas alta");
            System.out.println("3.\tVer la nota mas baja");
            System.out.println("4.\tNumero de alumnos por encima de la media");
            System.out.println("5.\tNumero de alumnos por debajo de la media");
            System.out.println("6.\tSalir");
            
			opcionUsuario = input.nextInt();
            switch (opcionUsuario){
                case 1:
                	notaMedia = CalcularMediaDeArray(notas);
                	System.out.println("La nota media es: "+notaMedia+"\n");
                    break;
                case 2:
                	System.out.println("La nota mas alta es: ");
                	MostrarNotaMasAlta(notas);
                	System.out.println();
                    break;
                case 3:
                	System.out.println("La nota mas baja es: ");
                	MostrarNotaMasBaja(notas);
                	System.out.println();
                    break;
                case 4:
                	if (notaMedia == 0)
                		notaMedia = CalcularMediaDeArray(notas);
                	EncimaDeMedia(notas, notaMedia);
                    break;
                case 5:
                	if (notaMedia == 0)
                		notaMedia = CalcularMediaDeArray(notas);
                	DebajoDeMedia(notas, notaMedia);
                    break;
                case 6:
                	continuar = false;
                	break;
                default:
                    System.out.println("Introduce una opcion correcta, entre 1 y 6");
            } 
        }
		
		//Mostrar el array
		MostrarTodoElArray(notas);
	}
	
	/**
	 * Otorgar valores entre 1 y 10 en toda la longitud del array
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void DarValoresAleatoriosEntre1y10(double[] array) {
		for(int i=0;i<array.length; i++){
		    array[i] = (double) (Math.random()*10)+1;
		    //Nose porque cabe la posibilidad de que un valor sea mayor que 10
		    //por lo que sea mayor que 10 se cambia a 10.
		    if (array[i] > 10) {
		    	array[i] = 10;
		    }  
		}
	}
	
	/**
	 * Motrar valores que pertenecen a un array.
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void MostrarTodoElArray(double[] array) {
		for(int i=0;i<array.length; i++){
		    System.out.println("Nota del alumno "+(i+1)+": "+array[i]);
		}
	}
	
	/**
	 * Devuelve la media de los valores que este contiene.
	 * Exige el array como entrada.
	 * @param array
	 * @return
	 */
	public static double CalcularMediaDeArray(double[] array) {
		double notaMedia = 0;
		for(int i=0;i<array.length; i++){
			notaMedia += array[i];
		}
		notaMedia /= array.length;
		return notaMedia;
	}
	
	/**
	 * Escribe el valor mas alto del array.
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void MostrarNotaMasAlta(double[] array) {
		double notaMasAlta=0;
		for(int i=0;i<array.length; i++){		
			if (array[i] > notaMasAlta) {
				notaMasAlta = array[i];
			}
		}
		System.out.println(notaMasAlta);
	}
	
	/**
	 * Escribe el valor mas bajo del array.
	 * Exige el array como entrada.
	 * @param array
	 */
	public static void MostrarNotaMasBaja(double[] array) {
		double notaMasBaja=10;
		for(int i=0;i<array.length; i++){		
			if (array[i] < notaMasBaja) {
				notaMasBaja = array[i];
			}
		}
		System.out.println(notaMasBaja);
	}
	
	/**
	 * Escribe el numero de valores encima de la media.
	 * @param array
	 * @param notaMedia
	 */
	public static void EncimaDeMedia(double[] array, double notaMedia) {
		int contador = 0;
		for(int i=0;i<array.length; i++){		
			if (array[i] > notaMedia) {
				contador++;
			}
		}
		System.out.println(contador+" notas estan encima de la media.\n");
	}
	
	
	/**
	 * Escribe el numero de valores debajo de la media.
	 * @param array
	 * @param notaMedia
	 */
	public static void DebajoDeMedia(double[] array, double notaMedia) {
		int contador = 0;
		for(int i=0;i<array.length; i++){		
			if (array[i] < notaMedia) {
				contador++;
			}
		}
		System.out.println(contador+" notas estan debajo de la media.\n");
	}
}