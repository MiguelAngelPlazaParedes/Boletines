/**Enunciado:
 * Un profesor desea saber el porcentaje de HOMBRES y el 
 * porcentaje de MUJERES hay en un grupo de estudiantes,
 * sabiendo que hay 3 MUJERES y 22 HOMBRES.
 * Imprime ambos porcentajes por pantalla.*/

package Boletin03;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Defino constantes y sus valores.
		final double MUJERES = 3;
		final double HOMBRES = 22;
		final int ALUMNOS = (int)(MUJERES+HOMBRES);
		final double PORCENTAJEMUJERES;
		final double PORCENTAJEHOMBRES;
		
		//Calculo porcentaje
		PORCENTAJEMUJERES= ((MUJERES/ALUMNOS)*100);
		PORCENTAJEHOMBRES= ((HOMBRES/ALUMNOS)*100);
		
		//Muestro datos
		System.out.println("El porcentaje de MUJERES: "+PORCENTAJEMUJERES+"%.");
		System.out.println("El porcentaje de HOMBRES: "+PORCENTAJEHOMBRES+"%.");
		
	}
}