/*@author Joan
 *@version 0.01*/
package EX03;

import java.util.Scanner;

public class Ex03App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int num;
		
		
		//Programa
		System.out.println("Introduce el numero");
		num = sc.nextInt();
		
		if(calcularNumeroPrimo(num)) { //Si es true
			System.out.println(num + " es un numero primo");
		}else { //Si es false
			System.out.println(num + " no es un numero primo");
		}

		sc.close();
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

}
