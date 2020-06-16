package Principal;

import controlador.GestionvehiculosTerrestre;
import modelo.VehiculosTerrestre;

public class Vehiculos1 {

	public static void main (String[]args) {
		
		VehiculosTerrestre  vt = new VehiculosTerrestre();
		
		vt.setCamionesMilitares("Kynos Aljaba");
		vt.setCarrosdeCombate("AMX-30");
		vt.setCarrosBlindaos("Hunter TR-12");
		vt.setCarrosMultiproposito("Humvee");
			
		
		
		 GestionvehiculosTerrestre du = new GestionvehiculosTerrestre();
			du.crearVehiculosTerrestre(vt);	
		
	
	}
	
	
}
