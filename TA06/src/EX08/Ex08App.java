/*@author Joan
 *@version 0.01*/
package EX08;

import java.util.Scanner;

public class Ex08App {

	public static void main(String[] args) {

		// Variables
		int array[] = new int[10];

		//Programa
		rellenarValoresArray(array);
		mostrarValoresArray(array);
	}



	private static void rellenarValoresArray(int[] array) {
		//Scanner (Solo lo utilizaremos en este metodo, asi que lo inicializamos aqui)
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valor de la posicion " + (i+1)); //i+1 para que no muestre posicion 0 y el usuario lo entienda mejor
			array[i] = sc.nextInt();
		}
		sc.close();
		
	}
	
	private static void mostrarValoresArray(int[] array) {
		
		//Bucle recorriendo el array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + (i+1) + " - Valor: " + array[i]);
		}		
	}

}
