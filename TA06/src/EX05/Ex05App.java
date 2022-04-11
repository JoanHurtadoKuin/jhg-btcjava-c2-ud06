/*@author Joan
 *@version 0.01*/
package EX05;

import java.util.Scanner;

public class Ex05App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable
		int num;
		String binario;

		// Programa
		System.out.println("Introduce un numero");
		num = sc.nextInt();

		binario = decimalABinario(num);
		
		for (int i = binario.length()-1; i >= 0; i--) { //length -1 para evitar salirse del index
			System.out.print(binario.charAt(i)); 
		}
		sc.close();
	}

	private static String decimalABinario(int num) {

		String binario = "";
		
		while(num>0) {
			binario += num%2;
			num /= 2;
		}
		
		return binario;
		
	}

}
