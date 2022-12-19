/**Enunciado:
 * Calcula el salario neto que percibirá un trabajador, teniendo en cuenta
 * que al salario bruto tenemos que descontarle las retenciones.
 * Éstas dependerán del número de hijos de acuerdo con la siguiente tabla:
 * _______________________________________
 * |    NÚMERO DE HIJOS   | RETENCIONES %|
 * |----------------------|--------------|
 * |       2 o menos      |      20      |
 * |Entre 3 e 5 (incluido)|      15      |
 * |Entre 5 e 7 (incluido)|      10      |
 * |Entre 7 e 9 (incluido)|       5      |
 * |       10 o más       |       0      |
 * ---------------------------------------
 * Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
 * Visualizar: salario bruto, descuento en euros y salario neto.
*/
package Boletin04;

// Librerias
import java.util.Scanner;

/**
 * @author MiguelÁngelPlazaParedes
 * @since 09/10/2022 */

public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		Scanner input=new Scanner(System.in);
		float salarioNeto = 0, salarioBruto, retencion;
		int hijos;
		
		//Pregunta 1
		System.out.println("Cuanto es el salario bruto?");
		salarioBruto = input.nextFloat();
		
		//Pregunta 2
		System.out.println("Cuantos hijos tienes?");
		hijos = input.nextInt();
		
		//Condiciones
		if (hijos <= 2) {
			retencion = 0.80f;
			salarioNeto = salarioBruto * retencion;
		} else if (hijos >= 3 && hijos <= 5){
			retencion = 0.85f;
			salarioNeto = salarioBruto * retencion;
		} else if (hijos > 5 && hijos <= 7){
			retencion = 0.90f;
			salarioNeto = salarioBruto * retencion;
		} else if (hijos > 7 && hijos <= 9){
			retencion = 0.95f;
			salarioNeto = salarioBruto * retencion;
		} else if (hijos >= 10){
			retencion = 1;
			salarioNeto = salarioBruto * retencion;
		};
		
		//Solucion
		System.out.println("Tu salario bruto es "+salarioBruto+" euro");
		System.out.println("Tu salario neto es "+salarioNeto+" euro");
		System.out.println("Es descuento por hijos es de "+(salarioBruto-salarioNeto)+" euro");
		
	}

}