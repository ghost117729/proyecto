package controlador;

import gestionBD.GestionDB;
import modelo.Ubicacion;

public class Gestionubicacion {
	
	private GestionDB db;
	private Ubicacion ubi;
	

	public boolean crearUbicacion(Ubicacion e) {
		boolean resp=false;
		String cadenaSQL = "insset into ubicacion (est, zom, rem) values ("+e.getEstado()+","+ e.getZonaMilitar()+","+ e.getRegionMilitar()+","+");";
		
		
		
		db = new GestionDB();
		resp = db.insertarRegisto(cadenaSQL);
		
		if(!resp) {
			System.out.println("Se presento un error en la creacion de ubicacion");
		 } else {
			 System.out.println("ubicacion registrado correctamente"); 
		 }
		return resp;
	}
}
