/*@author Joan
 *@version 0.01*/
package EX09;

import java.util.Scanner;

public class Ex09App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int tamañoArray;
		int array[];

		// Programa
		System.out.println("Introduce el tamaño de la array");
		tamañoArray = sc.nextInt();
		array = new int[tamañoArray];

		rellenarValoresArray(array);
		mostrarValoresArray(array);
		
		sc.close();
	}


	private static void rellenarValoresArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * (9 - 0 + 1) + 0); // Numero aleatorio en 0 y 9
		}
	}

	private static void mostrarValoresArray(int[] array) {

		int total = 0;
		// Bucle recorriendo el array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + (i + 1) + " - Valor: " + array[i]);
			total += array[i]; //Vamos sumando al total
		}
		System.out.println("Total del array: " + total);
	}
}
