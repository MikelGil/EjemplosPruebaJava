package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		
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
