/**Enunciado:
 * Visualiza por pantalla la suma de los n�meros pares
 * y la suma de los impares desde 1 hasta 100.*/
package Boletin05;

/**
 * @author Miguel�ngelPlazaParedes
 * @since 23/10/2022 */

public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaramos las variables
		int numeroPar=0, numeroImpar=0, calculo, i;

	    //Condicion
	    for(i=1;i<=100;i++){
	    	
	    	if(i%2==0) {
	    		calculo=numeroPar+i;
	    		System.out.println("Par\t"+numeroPar+" + "+i+" = "+calculo);
	    		numeroPar=numeroPar+i;
	    		calculo = 0;
	    	} else {
	    		calculo=numeroImpar+i;
	    		System.out.println("Impar\t"+numeroImpar+" + "+i+" = "+calculo);
	    		numeroImpar=numeroImpar+i;
	    		calculo = 0;
	    	}
	    	
	    	//Resultado
	    	
	    	
	    }
	    
	    
	    
	  }

}