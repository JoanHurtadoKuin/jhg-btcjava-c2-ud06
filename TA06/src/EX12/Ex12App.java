package EX12;

import java.util.Scanner;

public class Ex12App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int array1[];
		int array2[];
		int tamaño;
		int digito;

		// Programa
		System.out.println("Introduce el tamaño de la array");
		tamaño = sc.nextInt();

		array1 = new int[tamaño];
		rellenarArrayAleatorio(array1);

		System.out.println("Introduce el ultimo digito");
		digito = sc.nextInt();

		array2 = ultimoDigito(array1, digito);

		System.out.println("Array Completa");
		mostrarArray(array1);

		
		System.out.println("\nArray con los numeros acabados en " + digito);
		mostrarArray(array2);

		sc.close();
	}

	private static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " - ");
			}
		}

	}

	private static int[] ultimoDigito(int[] array, int digito) {

		int arrayAux[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == digito) {
				arrayAux[i] = array[i];
			}
		}

		return arrayAux;
	}

	private static int[] rellenarArrayAleatorio(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 300);
		}

		return array;
	}

}
