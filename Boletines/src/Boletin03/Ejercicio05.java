/**Enunciado:
 * Desarrolla un programa que calcule el sueldo l�quido a percibir por un
 * vendedor sabiendo que el sueldo total incluye los siguientes conceptos:
 * � Sueldo fijo.
 * � Comisi�n: 5% sobre el importe de las ventas.
 * � kilometraje: 1 euro por Kil�metro.
 * � Dietas: 60 euros por d�a de desplazamiento.
 * 
 * A la suma de estos conceptos se le debe descontar:
 * � La retenci�n de la Seguridad social (150 euros).
 * 
 * Al sueldo fijo se le debe descontar:
 * � La retenci�n del IRPF: 18%.
 * 
 *Declara las variables necesarias y asigna los valores que consideres
 *convenientes (importe de ventas, n�mero de km realizados, d�as de desplazamiento).*/

package Boletin03;

//Librerias
import java.util.Scanner;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 02/10/2022 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//Defino variables y constantes.
		double sueldo, kilometraje, ventas, diaDesplazamiento;
		final double COMISION=0.05;
		final double RETENCIONIRPF=0.82;
		//Para mostrar otros datos por pantalla.
		final double RETENCIONES, sueldoGUARDADO;
		
		//Defino valores
		System.out.println("Cual es el sueldo fijo? "); 
		sueldo = input.nextDouble();
		System.out.println("Cuantos km a realizado? "); 
		kilometraje = input.nextDouble();
		System.out.println("Cual es el importe total de sus ventas? "); 
		ventas = input.nextDouble();
		System.out.println("Cuantos dias se ha desplazado? "); 
		diaDesplazamiento = input.nextDouble();
			
		System.out.println("Sueldo bruto: "+sueldo);
		//Calculo
		sueldoGUARDADO = sueldo;
		sueldo *= RETENCIONIRPF;
		RETENCIONES = sueldo;
		sueldo += ventas*COMISION;
		sueldo += kilometraje;
		sueldo += diaDesplazamiento*60;
		sueldo -= 150;
								
		//Muestro datos
		System.out.println("Retencion IRPF: "+(sueldoGUARDADO-RETENCIONES)+" euros.");
		System.out.println("Importe por ventas: "+ventas*COMISION+" euros.");
		System.out.println("Importe por desplazamiento: "+diaDesplazamiento*60+" euros.");
		System.out.println("SUELDO FINAL: "+sueldo+" euros.");
		
	}
}
