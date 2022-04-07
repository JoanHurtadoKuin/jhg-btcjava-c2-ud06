/*@author Joan
 *@version 0.01*/
package EX01;

import java.util.Scanner;

public class Ex01App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double radioCirculo;
		double baseTriangulo;
		double alturaTriangulo;
		double ladoCuadrado;
		int opcion;

		// Programa
		System.out.println("**Selecciona una opción**");
		System.out.println("1- Calcular área Circulo");
		System.out.println("2- Calcular área Triangulo");
		System.out.println("3- Calcular área Cuadrado");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1: // Area circulo
			System.out.println("Introduce el radio del Circulo:");
			radioCirculo = sc.nextDouble();
			calcularAreaCirculo(radioCirculo);

			break;
		case 2: // Area Triangulo
			System.out.println("Introduce la base del Triangulo:");
			baseTriangulo = sc.nextDouble();
			System.out.println("Introduce la altura del Triangulo:");
			alturaTriangulo = sc.nextDouble();
			calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

			break;
		case 3: // Area Cuadrado
				System.out.println("Introduce el lado del Cuadrado:");
				ladoCuadrado = sc.nextDouble();
				calcularAreaCuadrado(ladoCuadrado);
			break;

		default:
			System.out.println("Opción Incorrecta");
			break;
		}
		
		sc.close();

	}

	private static void calcularAreaCirculo(double radio) {

		double resultado;

		resultado = Math.pow(radio, 2) * Math.PI;

		System.out.println("El área del circulo es: " + resultado);
	}

	private static void calcularAreaTriangulo(double baseTriangulo, double alturaTriangulo) {

		double resultado;

		resultado = (baseTriangulo * alturaTriangulo) / 2;

		System.out.println("El área del triangulo es: " + resultado);
	}

	private static void calcularAreaCuadrado(double ladoCuadrado) {

		double resultado;

		resultado = ladoCuadrado * ladoCuadrado;

		System.out.println("El área del cuadrado es: " + resultado);
	}

}
