package controlador;

import gestionBD.GestionDB;
import modelo.Escuadron;
import modelo.Ubicacion;

public class Gestionescuadron {
	
	
	private GestionDB db;
	private Escuadron es;
	

	public boolean crearEscuadron(Escuadron e) {
		boolean resp=false;
		String cadenaSQL = "inset into ubicacion (noe, sar, fus, gra, ame, reb, med) values ("+e.getNombredeEscuadron()+","+ e.getSargento()+","+ e.getFusilero()+e.getGranadero()+","+e.getAmetralladora()+","+e.getRebastecedor()+","+e.getMedico()+","+");";
		
		
		
		db = new GestionDB();
		resp = db.insertarRegisto(cadenaSQL);
		
		if(!resp) {
			System.out.println("Se presento un error en la creacion de escuadron");
		 } else {
			 System.out.println("escuadron registrado correctamente"); 
		 }
		return resp;
	}
	
	
	
	
	
	

}
