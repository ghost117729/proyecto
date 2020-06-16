package Principal;

import controlador.Gestionubicacion;
import modelo.Ubicacion;

public class Ubicacion1 {

	public static void main (String[]args) {
		
		 Ubicacion ubi = new Ubicacion();
			
			ubi.setEstado("Morelos");
			ubi.setZonaMilitar("24");
			ubi.setRegionMilitar("RegionVII");
		
		
			Gestionubicacion du = new Gestionubicacion();
			du.crearUbicacion(ubi);	
		
		
		
	}
}
