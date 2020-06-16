package Principal;

import controlador.Gestionescuadron;
import modelo.Escuadron;
import Principal.Creacionsol;
public class Escuadron1 {


	public static void main (String[]args) {
		
		 Escuadron esc = new Escuadron();
			
			esc.setNombredeEscuadron("201");
			esc.setSargento("marcos");
			esc.setFusilero("jorge");
			esc.setGranadero("carlos");
			esc.setAmetralladora("jovany");
			esc.setRebastecedor("luis");
			esc.setMedico("ismael");
		
		
			Gestionescuadron du = new Gestionescuadron();
			du.crearEscuadron(esc);	
		
	
	}
	
}
