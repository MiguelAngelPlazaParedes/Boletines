package Boletin06;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		double respuesta;
		int numIntento;
		int intentos=4;
		
		System.out.println("Bienvenido a El Numero Justo 2, el juego en el que debes adivinar un numero aleatorio entre 1 y 50\nporque las IAs han dominado el mundo");
		respuesta=random(1, 50);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ahora el jugador debe adivinar el numero. Buena suerte!\nIntroduce un numero:");
		numIntento=sc.nextInt();

		while(numIntento!=respuesta && intentos>=1) {
			
			if(numIntento>respuesta) {
				System.out.println("El numero correcto es menor. Te queda/n "+(--intentos)+" intentos");
				numIntento=sc.nextInt();
			}

			if(numIntento<respuesta) {
				System.out.println("El numero correcto es mayor. Te queda/n "+(--intentos)+" intentos");
				numIntento=sc.nextInt();
			}

		}

		if(intentos==0) {
			System.out.println("Has perdido. Suerte la proxima vez");
		}

		if(numIntento==respuesta) {
			System.out.println("Enhorabuena! Has acertado, la respuesta era "+respuesta);
		}

		sc.close();

	}

	/**
	 * Escoge un numero entero aleatorio entre los dos introducidos
	 * @param num1
	 * @param num2
	 * @return
	 */

	public static double random(int num1, int num2) {
		double randomNum=Math.floor(Math.random()*(num2-num1+1)+num1);
		return randomNum;

	}

}
