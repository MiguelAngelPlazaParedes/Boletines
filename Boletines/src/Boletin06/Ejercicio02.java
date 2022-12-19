/**
 * Crear un programa, para el cual,
 * dado el radio de una circunferencia
 * calcule según lo que elija el usuario,
 * la longitud de la misma,
 * el área y el volumen de la esfera que determina.
 */

package Boletin06;

import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 12/11/2022
 */

public class Ejercicio02 {
	public static void main(String[] args) {
        int r = 5;	// Radio de la esfera
		System.out.println("El radio establecido es de "+r+".");
		System.out.println("Elige que quieres calcular:");
		Menu(r);
	}
	
	/**
	 * 
	 * Menu principal para la selecion de la formula a usar
	 */
	public static void Menu(int r) {
		Scanner input = new Scanner(System.in);
		String opcion = null;
		String opcion1 = "longitud", opcion2 = "area", opcion3 = "volumen", opcion4 = "salir";
		double form;
			 
            System.out.println("1. Longitud");
            System.out.println("2. Area");
            System.out.println("3. Volumen");
            System.out.println("4. Salir");
 
            System.out.println("Escribe una de las opciones anteriormente descritas.");
            opcion = input.nextLine().toLowerCase();
 
            if (opcion.equals(opcion1)) {
            	form=FormLongitud(opcion, r);
            	Frase(opcion, form, r);
            	Menu(r);
            } else if (opcion.equals(opcion2)){
            	form=FormArea(opcion, r);
            	Frase(opcion, form, r);
            	Menu(r);
            } else if (opcion.equals(opcion3)){
            	form=FormVolumen(opcion, r);
            	Frase(opcion, form, r);
            	Menu(r);
            }else if (opcion.equals(opcion4)){
            	System.out.println("Adios.");
            }else {
            	System.out.println("No has escrito ninguno de los valores anteriores.\n");
            	Menu(r);
            }        
	}
	
	public static double FormLongitud(String opcion, int r) {
		double l;
		l = 2 * r * Math.PI;
		return l;
	}
	
	public static double FormArea(String opcion, int r) {
		double a;
		a = Math.PI * Math.pow(r, 2);
		return a;
	}
	
	public static double FormVolumen(String opcion, int r) {
		double v;
		v = (4/3) * Math.PI * Math.pow(r, 3);
		return v;
	}
	
	public static void Frase(String opcion, double form, int r) {
		System.out.println("El "+opcion+" es "+form+" sabiendo que el radio es "+r+".\n");
	}
}
