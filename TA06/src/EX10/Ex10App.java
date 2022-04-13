/*@author Joan
 *@version 0.01*/
package EX10;

import java.util.Scanner;

public class Ex10App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int arrayNumeros[];
		int tamaño;
		int min;
		int max;
		int numero;
		boolean salir;
		
		//Programa
		System.out.println("Introduce el tamaño de la array");
		tamaño = sc.nextInt();
		
		arrayNumeros = new int[tamaño];
		
		//Introduce el rango de numeros
		System.out.println("Minimo:");
		min = sc.nextInt();
		System.out.println("Maximo:");
		max = sc.nextInt();
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			do {
				salir = false;
				numero = numeroAleatorio(min, max);
				if(calcularNumeroPrimo(numero)) {
					arrayNumeros[i] = numero;
					salir = true;
					System.out.println(arrayNumeros[i]);
				}
			} while (!salir);
		
		}
	}
	
	private static boolean calcularNumeroPrimo(int num) {
		
		//Bucle inicializado a 2, porque el 1 sera siempre divisible
		//Hasta num-1, porque nuestro numero sera siempre divisible entre el mismo
		for (int i = 2; i < num; i++) {
			if(num % i == 0) { //Si un numero es divisor, retornamos false
				return false;
			}
		}
		
		//Si acaba el bucle sin encontrar ningun divisor, retornamos true
		return true;
	}

	private static int numeroAleatorio(int min, int max) {
		int numeroAleatorio;
		
		//Utilizando esta formula con Math.random le indicamos el abanico de numeros
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
				
		return numeroAleatorio;
	}
}
