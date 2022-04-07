/*@author Joan
 *@version 0.01*/
package EX02;

import java.util.Scanner;

public class Ex02App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		// Variables
		int cantidadNum;
		int min;
		int max;

		// Cantidad de numereos aleatorios, y 2 numeros min y max
		System.out.println("Cantidad de numeros aleatorios");
		cantidadNum = sc.nextInt();
		System.out.println("Numero minimo:");
		min = sc.nextInt();
		System.out.println("Numero maximo:");
		max = sc.nextInt();
		sc.close();
		generarNumerosAleatorios(cantidadNum, min, max);
	}

	private static void generarNumerosAleatorios(int cantidadNum, int min, int max) {

		//Hacemos el bucle segun la cantidad de numeros
		for (int i = 0; i < cantidadNum; i++) {
			//Utilizamos Math.floor para generar un numero entero
			//Utilizando esta formula con Math.random le indicamos el abanico de numeros
			int numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
			System.out.println(numeroAleatorio);
		}
	}
}
