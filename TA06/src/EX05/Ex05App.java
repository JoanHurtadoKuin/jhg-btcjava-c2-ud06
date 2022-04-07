/*@author Joan
 *@version 0.01*/
package EX05;

import java.util.Scanner;

public class Ex05App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * 
		 * ACABAR!!!
		 * 
		 * 
		 * */
		//Variable
		int num;
		
		//Programa
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		decimalABinario(num);
	}

	private static void decimalABinario(int num) {
		
		int division;
		String resto ="";
		boolean sePuedeDividir = true;
		
		do {
			if(num/2 != 0) {
				division = num/2;
				resto += num%2;
				System.out.println(resto);
			}else {
				sePuedeDividir = false;
			}
			
			
		} while (!sePuedeDividir);
		
	}

}
