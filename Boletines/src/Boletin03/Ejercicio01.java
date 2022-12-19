/**Enunciado:
 * Un alumno desea saber cu�l ser� su calificaci�n final en la materia de
 * Programaci�n.
 * Dicha calificaci�n se compone de los siguientes porcentajes:
 * � 55% del promedio de sus tres calificaciones parciales.
 * � 30% de la calificaci�n del examen final.
 * � 15% de la calificaci�n de un trabajo final.
 * Asigna las calificaciones que creas conveniente (entre 1 y 10)
 * e imprime los valores de todas las notas,
 * as� como la calificaci�n final.*/

package Boletin03;

//Librerias
import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//Defino constantes y variable.
		final double PRIMERPARCIAL, SEGUNDOPARCIAL, TERCERPARCIAL;
		final double EXAMENFINAL, TRABAJOFINAL;
		double notaFinal;
		
		//Defino valor.
		System.out.println("Nota del primer parcial? "); 
		PRIMERPARCIAL = input.nextDouble();
		System.out.println("Nota del sengundo parcial? "); 
		SEGUNDOPARCIAL = input.nextDouble();
		System.out.println("Nota del tercer parcial? "); 
		TERCERPARCIAL = input.nextDouble();
		System.out.println("Nota del examen final? "); 
		EXAMENFINAL = input.nextDouble();
		System.out.println("Nota del examen final? "); 
		TRABAJOFINAL = input.nextDouble();
			//Calculo porcentajes para nota final 
		notaFinal = ((PRIMERPARCIAL+SEGUNDOPARCIAL+TERCERPARCIAL)/3)*0.55;
		notaFinal += EXAMENFINAL*0.30;
		notaFinal += TRABAJOFINAL*0.15;
		
		//Muestro datos
		System.out.println("Los tres paciales:"+PRIMERPARCIAL+", "+SEGUNDOPARCIAL+" y "+TERCERPARCIAL);
		System.out.println("Examen y trabajos finales:"+EXAMENFINAL+" y "+TRABAJOFINAL);
		System.out.println("NOTA FINAL:"+notaFinal);
		
	}
}