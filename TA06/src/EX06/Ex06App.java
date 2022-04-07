package EX06;

import java.util.Scanner;

public class Ex06App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int num;
		
		//Programa
		do {
			System.out.println("Introduce un numero positivo");
			num = sc.nextInt();
		} while (num < 0); //Comprovamos que el numero introducido sea correcto
		
		numeroDeCifras(num);
		sc.close();
	}

	private static void numeroDeCifras(int num) {
		
		int contadorCifras = 0;
		
		//Vamos dividiendo entre 10 para ir sacando las cifras, cuando el numero sea mas pequeño a 0 se sale del bucle
		do {
			if(num > 0) {
			num = num/10;
			contadorCifras++;
			}	
		} while (num > 0);
		System.out.println(contadorCifras);
	}

}
