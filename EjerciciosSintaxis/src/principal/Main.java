package principal;

import clases.Operaciones;

public class Main {

	public static void main(String[] args) {
	

		
		System.out.println("Es primo: " + Operaciones.esPrimo(13));
		System.out.println("Factorial " + Operaciones.factorial(5));
		Operaciones.fibonacci(6);
		Operaciones.mostrarDivisores(30);
		Operaciones.mostrarDivisores(30,true);
		Operaciones.mostrarPrimos(10, 40);
		Operaciones.mostrarPrimos(80, 40);
		System.out.println("Potencia: " + Operaciones.potencia(2, 5));
	}

}
