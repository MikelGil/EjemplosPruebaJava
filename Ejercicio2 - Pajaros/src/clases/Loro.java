package clases;
/* La clase Loro:
� Tiene como atributos el sexo (M/H), la edad (entero), la regi�n (N/S/E/O) y el
color (String).
� Tiene un constructor que inicializa todos los atributos con par�metros que le
llegan.
� Tiene un m�todo deDondeEres que saca el mensaje �Norte�, �Sur�, �Este� u
�Oeste� dependiendo de la regi�n de donde sea el loro.*/

public class Loro extends Ave{
	
	private char region;
	private String color;
	
	public Loro(char sexo, Integer edad, char region, String color) {
		super(sexo, edad);
		setRegion(region);
		this.color = color;
	}
	
	public void deDondeEres() {
		String respuesta;
		
		switch (this.region){
			case 'N':
				respuesta = "Norte";
				break;
			case 'S':
				respuesta = "Sur";
				break;
			case 'E':
				respuesta = "Este";
				break;
			case 'O':
				respuesta = "Oeste";
				break;
			default:
				respuesta = "No es de una region conocida";
				break;
		}
		
		System.out.println(respuesta +"\n");
	}
	
	public void setRegion(char region) {
		if (Character.compare(region, 'N') != 0 || Character.compare(region, 'S') != 0 || Character.compare(region, 'E') != 0 || Character.compare(region, 'O') != 0) {
			this.region = 'O';
		}else {
			this.region = region;
		}
		
	}
}
