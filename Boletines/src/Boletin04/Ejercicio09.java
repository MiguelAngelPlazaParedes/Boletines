/**Enunciado:
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo
 * como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un
 * menú elegir si el vértice de la pirámide está apuntando hacia arriba o
 * hacia abajo.
 * 
 * Pistas:
 * El programa: Como qué carácter quieres rellenar la pirámide?
 * El usuario contesta:
 * El programa: Hacia dónde quieres que apunte la pirámide:
 * 1. Hacia arriba
 * 2. Hacia abajo
 * Respuesta: (el usuario contestaría aquí con 1 o con 2)
 * Podeis usar un String para guardar un carácter. Si quereis usar el tipo de
 * dato char para guardar el carácter teneis que usar el siguiente método:
 * String s;
 * Char c = s.charAt(0); // con esto se obtiene el primer character de s.*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		//char i;
		int opcion;
		String i;
			//Primera 1
		System.out.println("Introduzca un caracter: ");
		//i = input.next().charAt(0);
		
		//Forma recogiendolo con char
		i = input.nextLine();
		//i.charAT(0);
				
			//Pregunta 2
		System.out.println("Elige la direccion: ");
		System.out.println("1. Hacia arriba\n2. Hacia abajo");
		opcion = input.nextInt();
		
		
		//Condiciones
		
		if (opcion == 1) {
			System.out.println("    "+i);
			System.out.println("   "+i+i+i);
			System.out.println("  "+i+i+i+i+i);
			System.out.println(" "+i+i+i+i+i+i+i);
			System.out.println(""+i+i+i+i+i+i+i+i+i);
		}
		if (opcion == 2) {
			System.out.println(""+i+i+i+i+i+i+i+i+i);
			System.out.println(" "+i+i+i+i+i+i+i);
			System.out.println("  "+i+i+i+i+i);
			System.out.println("   "+i+i+i);
			System.out.println("    "+i);
		}

	}
}