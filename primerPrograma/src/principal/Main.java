package principal;

import java.util.Date;
import primerPrograma.Alumno;
import primerPrograma.Persona;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hola");
		
		Persona p = new Persona("Antxon");
		Persona p2 = new Persona("Antxon", "Urrutia", 188, new Date(2000-02-02), "12345678901234567890");
		p.saludar();
		p.andar(30);
		p2.saludar();
	
		Alumno a = new Alumno("Antxon", "Urrutia", 188, new Date(2000-02-02), "12345678901234567890", 7);
		System.out.println("Nota media: "+ a.notaMedia);
		System.out.println("Paga: "+ a.darPaga());
		
	}

}
