package controlador;

import gestionBD.GestionDB;
import modelo.Soldado;


public class gestiondeSoldado {

	private GestionDB db;
	private Soldado sol;
	
	
	public boolean crearSoldado(Soldado u) {
		boolean resp=false;
		String cadenaSQL = "insset into soldados (nom, app, apm, mtr) values ("+u.getNombre()+","+ u.getApellidoP()+","+ u.getApellidoM()+","
		+ u.getMatricula()+","+u.getBatallon()+","+u.getRamaMilitar()+u.getEspecialidad()+","+");";
		
		
		db = new GestionDB();
		resp = db.insertarRegisto(cadenaSQL);
		
		if(!resp) {
			System.out.println("Se presento un error en la creacion de soldado");
		 } else {
			 System.out.println("Soldado registrado correctamente"); 
		 }
		return resp;
	}
	

	
	
	
	
}
