package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Caballosmilitares;

public class gestionCaballosmilitares {
	Conexion cn;
	
	
	public String crearCaballosmilitares (Caballosmilitares u) {
		String response="";
		
	String cadenaSQL = " insert into caballosmilitares (idcaballos, nombredecaballo, raza, especialidad)"
			+ " values  ('"+u.getIdcaballos()+"','"+u.getNombredecaballo()+"','"+u.getRaza()+"','"+u.getEspecialidad()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarCaballosmilitares (Caballosmilitares u) {
		String response="";
		
	String cadenaSQL = "update cabalosmilitares SET nombredecaballo= '"+u.getNombredecaballo()+"', raza= '"+u.getRaza()+"', especialidad= '"+u.getEspecialidad()+"' WHERE idcaballos="+u.getIdcaballos()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarCaballosmilitares (String idcaballos) {
		String response="";
		
	String cadenaSQL = "delete  FROM caballosmilitares WHERE idcaballos="+idcaballos+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarCaballomilitar(String idcaballos) {
	
	String response="";
	String cadenaSQL = "select * from caballosmilitares WHERE idcaballos="+idcaballos+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idcaballos") + " " + rs.getString ("nombredecaballo")+ " "+ rs.getString ("raza")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarCaballosmilitares () {
	
	String response="";
	String cadenaSQL = "select * from caballosmilitares;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idcaballos") + " " + rs.getString ("nombredecaballo")+ " "+ rs.getString ("raza")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
