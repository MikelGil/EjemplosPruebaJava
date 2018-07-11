package principal;

import clases.Piolin;
import clases.Ave;
import clases.Loro;

/* En esta clase se encuentra el programa principal en el cual se crea una
instancia de la clase Piolin y otro de la clase loro.
� Llamar al m�todo quienSoy de las dos instancias
� Llamar al m�todo altura con la instancia del Piol�n
� Invocar al m�todo deDondeEres con la instancia del Loro
� Modificar el tama�o del Piol�n y volver a invocar al m�todo altura
� Modificar la regi�n del Loro
� Mostrar el n�mero de Aves creadas.*/

public class Main {

	public static void main(String[] args) {
	

		Piolin piolin = new Piolin('M', 24, 100, 2);
		Loro loro = new Loro('H', 10, 'E', "Azul");
		
		System.out.println("Piolin quienSoy: ");
		piolin.quienSoy();
		System.out.println("Loro quienSoy: ");
		loro.quienSoy();
		
		System.out.println("Piolin Altura: ");
		piolin.altura();
		
		System.out.println("Loro deDondeEres: ");
		loro.deDondeEres();
		
		piolin.setTama�o(20);
		System.out.println("Piolin nueva Altura: ");
		piolin.altura();
		
		loro.setRegion('O');
		System.out.println("Loro nueva region: ");
		loro.deDondeEres();
		
		System.out.println("Aves creadas: ");
		Ave.getAvesCreadas();
	
	}
}
