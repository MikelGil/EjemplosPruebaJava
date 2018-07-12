package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		arr[0] = 5;
		arr[1] = 2;
		
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
