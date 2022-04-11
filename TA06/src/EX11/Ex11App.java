package EX11;

import java.util.Scanner;

public class Ex11App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int array1[];
		int array2[];
		int array3[];
		int tamaño;
		
		//Programa
		System.out.println("Introduce el tamaño de la array");
		tamaño = sc.nextInt();
		
		array1 = new int[tamaño];
		array2 = array1;
		
		array1 = rellenarArrayAleatorio(array1);
		array2 = rellenarArrayAleatorio(array2); //Aunque se cambie el array2, esta apuntando a la 1 y tendran los mismos valores
		
		array3 = multiplicarArrays(array1,array2);
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println("Array1: " + array1[i] + " * Array2: " + array2[i] + " = Array3: " + array3[i] );
		}
			
		sc.close();
	}

	private static int[] multiplicarArrays(int[] array1, int[] array2) {

		int arrayNueva[] = new int[array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			arrayNueva[i] = array1[i]*array2[i];
		}
		
		return arrayNueva;
		
	}

	private static int[] rellenarArrayAleatorio(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] =  (int)(Math.random()*10);
		}
		
		return array;
	}


	
	

}
