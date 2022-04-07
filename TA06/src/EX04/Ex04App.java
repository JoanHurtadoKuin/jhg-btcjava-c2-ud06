/*@author Joan
 *@version 0.01*/
package EX04;

import java.util.Scanner;

public class Ex04App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int num;

		// Programa
		System.out.println("Introduce un numero:"); //31 como max, si no pasa el limite
		num = sc.nextInt();

		calcularFactorial(num);
		
		System.out.println(calcularFactorialRecursivo(num));

		sc.close();
	}

	private static void calcularFactorial(int num) {

		int total = 1; //Valor total
		int aux = num; //Utilizo un aux para poder restar el num 
						//y no me afecte en el for

		for (int i = 0; i < aux; i++) {
			total *= num;
			num--;
		}
		System.out.println(total); //Mostramos el total
	}

	//Metodo Recursivo para practicar
	private static int calcularFactorialRecursivo(int num) {

		//Mientras el numero no sea 0
		if (num == 0) {
			return 1;
		}else { //Vamos rellamando al metodo
			return num*calcularFactorialRecursivo(num-1);
		}
	}
}
