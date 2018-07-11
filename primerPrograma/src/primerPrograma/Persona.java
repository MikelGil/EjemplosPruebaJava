package primerPrograma;

//IMPORTS
import java.util.Date;

public class Persona {

	//ATRIBUTOS - VARIABLES
	//acceso modificadores(static/final) tipoDato nombre [=valorInicial]
	public String nombre;
	public String apellido;
	public Integer altura;
	protected Date fechaNacimiento;
	
	private String numeroCuenta;
	
	//CONSTRUCTORES
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, String apellido, Integer altura, Date fechaNacimiento, String numeroCuenta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.fechaNacimiento = fechaNacimiento;
		//this.numeroCuenta = numeroCuenta;
		setNumeroCuenta(numeroCuenta);
	}

	//COMPORTAMIENTOS - METODOS
	public void saludar() {
		System.out.println("Hola desde persona");
	}

	public void andar(Integer pasos) {
		System.out.println("He andado " + pasos + " pasos");
	}
	
	public Integer darPaga() {
		return 20;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta.substring(numeroCuenta.length()-4);
	}

	public void setNumeroCuenta(String nCuenta) {
		if (nCuenta.length() != 20) {
			System.out.println("EL NUMERO DE CUENTA TIENE QUE TENER 20 DIGITOS");
		}
		else {
			numeroCuenta = nCuenta;
		}
	}
	
}
