package clases;

/*La clase Canario:
� Tiene como atributos el sexo (M/H), la edad (entero) y el tama�o (real).
� La clase canario tiene dos constructores, uno inicializa el sexo y la edad seg�n
dos par�metros que le llegan y otro tambi�n inicializa el tama�o.
� Tiene un m�todo altura que dependiendo del tama�o del canario saca un
mensaje por pantalla (�Alto� si tama�o > 30, �Mediano� si tama�o [15..30] y
�Bajo� si tama�o < 15) */

public class Canario extends Ave{
	
	private Integer tamanyo;

	public Canario(char sexo, Integer edad) {
		super(sexo, edad);
	}
	
	public Canario(char sexo, Integer edad, Integer tamanyo) {
		super(sexo, edad);
		this.tamanyo = tamanyo;
	}
	
	public void altura() {
		String respuesta;
		
		if (this.tamanyo != null) {
			if (this.tamanyo < 15){
				respuesta = "Bajo";
			}else if (this.tamanyo > 30) {
				respuesta = "Alto";
			}else {
				respuesta = "Mediano";
			}
		}else {
			respuesta = "No tiene tama�o";
		}
		     
       	System.out.println(respuesta + "\n");  
	}

	public void setTama�o(Integer tamanyo) {
		this.tamanyo = tamanyo;
	}
	
}
