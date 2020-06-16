package controlador;

import gestionBD.GestionDB;
import modelo.VehiculosTerrestre;

public class GestionvehiculosTerrestre {
	private GestionDB db;
	private VehiculosTerrestre vt;
	
	
	public boolean crearVehiculosTerrestre(VehiculosTerrestre v) {
		boolean resp=false;
		String cadenaSQL = "inset into ubicacion (est, zom, rem) values ("+v.getCamionesMilitares()+","+v.getCarrosdeCombate()+","+v.getCarrosBlindaos()+","+v.getCarrosMultiproposito()+","+");";
		
		
		
		db = new GestionDB();
		resp = db.insertarRegisto(cadenaSQL);
		
		if(!resp) {
			System.out.println("Se presento un error en la creacion de vehiculo terrestre");
		 } else {
			 System.out.println("vehiculo terrestre registrado correctamente"); 
		 }
		return resp;
	}
	

}
