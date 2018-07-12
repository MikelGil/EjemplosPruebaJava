package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		arr[0] = 5;
		arr[1] = 2;
		
		char[][] tablero = new char[8][8];
		tablero[0][0] = 'T';
		tablero[0][1] = 'C';
		tablero[0] = new char[]{'T','C','A','R','r','A','C','T'};
		tablero[7] = tablero[0];
		
		for (int fila = 1; fila <= 6; fila += 5) {
			for (int columna = 0; columna < 8; columna++) {
				tablero[fila][columna] = 'p';
			}
		}
		
		for (int fila = 0; fila < 8; fila++) {
			for (int columna = 0; columna < 8; columna++) {
				System.out.print(tablero[fila][columna]);
			}
			System.out.println();
		}
		
		
		int[] arr2 = {5,2};
		
		System.out.println(arr2[0]);
		
		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		System.out.println(diasSemana[1]);
		
		Punto[] puntos = new Punto[2];
		puntos[0] = new Punto(100,2);
		//puntos[0] = new Punto(10000,2);
		
		Punto[] puntosPorDefecto = {new Punto(1,1), new Punto(2,1)};
		
		System.out.println(puntosPorDefecto[1]);
		
		for (String d: diasSemana) {
			System.out.print(d + "  ");
		}
	}
	
	public static void mainPunto(String[] args) {
		
		Punto p = new Punto(10, 20);
		Punto p2 = new Punto(10, 20);
		
		System.out.println(p);							//System.out.println.toString());
		
		System.out.println(p == p2);					// Compara las direcciones en memoria de los objetos
		System.out.println(p.equals(p2));  				// Compara el contenido de los objetos
		
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
		Punto p3 = (Punto) p.clone();
		
		System.out.println(p3);
		
	}

}
