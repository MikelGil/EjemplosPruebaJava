package clases;

/*La clase Piolin:
� Tiene como atributos el sexo (M/H), la edad (entero) y el n�mero de pel�culas
(entero).
� Su constructor inicializa todos los atributos con valores que le llegan como
par�metros. */

public class Piolin extends Canario{
	
	private Integer numeroPeliculas;

	public Piolin(char sexo, Integer edad, Integer tama�o, Integer numeroPeliculas) {
		super(sexo, edad, tama�o);
		this.numeroPeliculas = numeroPeliculas;
	}

}
