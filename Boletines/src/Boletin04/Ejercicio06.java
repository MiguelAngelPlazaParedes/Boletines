/**Enunciado:
 * Escribe un programa que nos diga el horóscopo a partir del día (número)
 * y el mes de nacimiento (String). Por ejemplo: Dime tu mes de nacimiento:
 * enero -> hay que trabajar en el programa con la cadena “enero”.*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio06 {

	public static void main(String[] args) {
		//Declaramos las variables
		Scanner inputUno=new Scanner(System.in);
		Scanner inputDos=new Scanner(System.in);
		int dia;
		String mes;
		
		//Instrucciones del programa
		System.out.println("Que dia naciste?"); 
		dia = inputUno.nextInt();
		System.out.println("Que mes naciste?");
		mes = inputDos.nextLine();
		
		//Para a minuscula el mes
		mes = mes.toLowerCase();
		
		//Para que no de los valores que quiera
		if (dia >= 1 && dia <= 31) {
			
			if (mes.equals("enero") || mes.equals("febrero") || mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo") || mes.equals("junio") || mes.equals("julio") || mes.equals("") ) {
			
				//Condiciones
				if (mes.equals("enero")) {
					
					if (dia >= 1 && dia <= 20) {
						System.out.println("Capricornio");
					} else if (dia >= 21 && dia <= 31) {
						System.out.println("Acuario");
					};
					
				} else if (mes.equals("febrero")){
					
					if (dia >= 1 && dia <= 19) {
						System.out.println("Acuario");
					} else if (dia >= 20 && dia <= 29) {
						System.out.println("Piscis");
					};
					
				} else if (mes.equals("marzo")){
					
					if (dia >= 1 && dia <= 20) {
						System.out.println("Piscis");
					} else if (dia >= 21 && dia <= 31) {
						System.out.println("Aries");
					};
					
				} else if (mes.equals("abril")){
					
					if (dia >= 1 && dia <= 20) {
						System.out.println("Aries");
					} else if (dia >= 21 && dia <= 30) {
						System.out.println("Tauro");
					};
					
				} else if (mes.equals("mayo")){
					
					if (dia >= 1 && dia <= 21) {
						System.out.println("Tauro");
					} else if (dia >= 22 && dia <= 31) {
						System.out.println("Geminis");
					};
					
				} else if (mes.equals("junio")){
					
					if (dia >= 1 && dia <= 21) {
						System.out.println("Geminis");
					} else if (dia >= 22 && dia <= 30) {
						System.out.println("Cancer");
					};
					
				} else if (mes.equals("julio")){
					
					if (dia >= 1 && dia <= 22) {
						System.out.println("Cancer");
					} else if (dia >= 23 && dia <= 31) {
						System.out.println("Leo");
					};
					
				} else if (mes.equals("agosto")){
					
					if (dia >= 1 && dia <= 22) {
						System.out.println("Leo");
					} else if (dia >= 23 && dia <= 31) {
						System.out.println("Virgo");
					};
					
				} else if (mes.equals("septiembre")){
					
					if (dia >= 1 && dia <= 22) {
						System.out.println("Virgo");
					} else if (dia >= 23 && dia <= 30) {
						System.out.println("Libra");
					};
					
				} else if (mes.equals("octubre")){
					
					if (dia >= 1 && dia <= 22) {
						System.out.println("Libra");
					} else if (dia >= 23 && dia <= 31) {
						System.out.println("Escorpio");
					};
					
				} else if (mes.equals("noviembre")){
					
					if (dia >= 1 && dia <= 22) {
						System.out.println("Escorpio");
					} else if (dia >= 23 && dia <= 30) {
						System.out.println("Sagitario");
					};
					
				} else if (mes.equals("diciembre")){
					
					if (dia >= 1 && dia <= 21) {
						System.out.println("Sagitario");
					} else if (dia >= 22 && dia <= 31) {
						System.out.println("Capricornio");
					};
					
				} else {
					System.out.println("Dia o mes MAL.");
					System.out.println("Ejemplo de mes: enero, febrero, marzo...");
				};
				
			}
			
		} else {
			System.out.println("El dia del mes debe estar entre el 1 y 31.");
		};
		
	}

}