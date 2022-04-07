/*@author Joan
 *@version 0.01*/
package EX07;

import java.util.Scanner;

public class Ex07App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double euros;
		String moneda;

		// Programa
		System.out.println("Cantidad de euros");
		euros = sc.nextDouble();
		System.out.println("Moneda a pasar (libras - dolares - yenes)");
		moneda = sc.next();

		switch (moneda.toLowerCase()) {
		case "libras":
			eurosALibras(euros);
			break;
		case "dolares":
			eurosADolares(euros);
			break;
		case "yenes":
			eurosAYenes(euros);
			break;

		default:
			System.out.println("Opcion Incorrecta");
			break;
		}
		
		sc.close();
	}

	private static void eurosALibras(double euros) {

		double libras;

		libras = euros * 0.86;

		System.out.println(euros + "€ es equivalente a " + libras + " libras");
	}

	private static void eurosADolares(double euros) {

		double dolares;

		dolares = euros * 1.28;

		System.out.println(euros + "€ es equivalente a " + dolares + "$");
	}

	private static void eurosAYenes(double euros) {

		double yenes;

		yenes = euros * 129.85;

		System.out.println(euros + "€ es equivalente a " + yenes + " yenes");
	}

}
