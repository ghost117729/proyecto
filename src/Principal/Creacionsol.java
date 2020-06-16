package Principal;

import controlador.gestiondeSoldado;
import modelo.Soldado;


public class Creacionsol {
	
	public static void main (String[]args) {
	
	Soldado sol = new Soldado();
	
	
	sol.setNombre("jhon");
	sol.setApellidoP("carter");
	sol.setApellidoM("degurechaff");
	sol.setMatricula("ajsgfjnche");	
	sol.setBatallon("batallon 501");
	sol.setRamaMilitar("infantria");
	sol.setEspecialidad("fusilero");
	
	Soldado sol1 = new Soldado();
	
	
	sol1.setNombre("jhon");
	sol1.setApellidoP("carter");
	sol1.setApellidoM("degurechaff");
	sol1.setMatricula("ajsgfjnche");	
	sol1.setBatallon("batallon 501");
	sol1.setRamaMilitar("infantria");
	sol1.setEspecialidad("fusilero");
	
	
	
	
	
	gestiondeSoldado gu = new gestiondeSoldado();
	gu.crearSoldado(sol);
	gu.crearSoldado(sol1);
		
	}

	
	
}
