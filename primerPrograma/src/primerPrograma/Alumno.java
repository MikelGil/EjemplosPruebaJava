package primerPrograma;

import java.util.Date;

//Persona -> Padre, Alumno -> Hijo
public class Alumno extends Persona{
	
	public Integer notaMedia = 10;
	
	public Alumno(String nombre, String apellido, Integer altura, Date fechaNacimiento, String numeroCuenta, Integer notaMedia) {
		super(nombre, apellido, altura, fechaNacimiento, numeroCuenta);
		this.notaMedia = notaMedia;
	}

	public Integer darPaga() {
		return 0;
	}
	
}
