package clases;

public class Operaciones {

	public static boolean esPrimo(int numero) {
		
		Boolean numeroPrimo = true;
		
		for (int x = 2; x < numero; x++) {
			if (numero % x == 0) {
				numeroPrimo = false;
				break;
			}
		}
		return numeroPrimo;
	}
	
	public static long factorial(int numero) {
		Integer resultadoFactorial = 1;
		String mostrarFactorial = "";
		
		if (numero > 0) {
			for (int x = 1; x <= numero; x++) {
				resultadoFactorial *= x;
				mostrarFactorial =  mostrarFactorial + " x " + x;
			}
		}
		else {
			resultadoFactorial = 0;
			mostrarFactorial = "0";
		}
		
		System.out.println("Formacion del factorial: " + mostrarFactorial.substring(3));
		
		return resultadoFactorial;
	}
	
	public static void fibonacci(int num_factores) {
		Integer resultadoFibonacci = 1;
		Integer anteriorFibonacci = 0;
		
		System.out.print("Fibonacci de " + num_factores + ": " + anteriorFibonacci + ", " + resultadoFibonacci);
		if (num_factores > 1) {
			for (int x = 2; x <= num_factores; x++) {
				resultadoFibonacci += anteriorFibonacci;
				anteriorFibonacci = resultadoFibonacci - anteriorFibonacci;
				System.out.print(", " + resultadoFibonacci);
			}
		}
		System.out.println();
	}
	
	public static void mostrarDivisores(int numero) {
		Boolean imprimirDivisor = true;
		System.out.print("Divisores del numero " + numero +": ");
		
		for (int x = 1; x <= numero; x++) {
			if (numero % x == 0) {
				for (int i = 2; i < x; i++) {
					if (x % i == 0) {
						imprimirDivisor = false;
						break;
					}
				}
				if (imprimirDivisor) {
					System.out.print(x +"  ");
				}else {
					imprimirDivisor = true;
				}
			}
		}
		System.out.println();
	}
	public static void mostrarDivisores(int numero, boolean primo) {
		System.out.print("Divisores del numero " + numero +": ");
		
		for (int x = 1; x <= numero; x++) {
			if (numero % x == 0) {
				if (esPrimo(x)) {
					System.out.print(x + "  ");
				}
			}
		}
		System.out.println("");
	}
	
	public static void mostrarPrimos(int num1, int num2) {
		if (num1 < num2) {
			System.out.print("Los numeros primos entre " + num1 + " y "+ num2 + " son: ");
			for (int i = num1; i <= num2; i++) {
				if (esPrimo(i)) {
					System.out.print(i + ", ");
				}
			}
		}else {
			System.out.print("Los numeros primos entre " + num1 + " y "+ num2 + " son: ");
			for (int i = num1; i > num2 ; i--) {
				if (esPrimo(i)) {
					System.out.print(i + ", ");
				}
			}
		}
		System.out.println("");
	}
	
	public static double potencia(int base, int potencia) {
		Double resultado = (double) base;
		for (int x = 0; x < potencia-1; x++) {
			resultado *= base;
		}
		return resultado;
	}
	
}
