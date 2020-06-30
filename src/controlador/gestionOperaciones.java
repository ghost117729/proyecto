package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Operaciones;

public class gestionOperaciones {
	Conexion cn;
	
	
	public String crearOperaciones (Operaciones u) {
		String response="";
		
	String cadenaSQL = " insert into operaciones (nombredeOperacion, ubicacion, duracionoperacion, tipodeElementos, cantidaddeElementos, idoperaciones)"
			+ " values  ('"+u.getNombredeOperacion()+"','"+u.getUbicacion()+"','"+u.getDuracionoperacion()+"','"+u.getTipodeElementos()+"','"+u.getCantidaddeElementos()+"','"
			+u.getIdoperaciones()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarOperaciones (Operaciones u) {
		String response="";
		
	String cadenaSQL = "update operaciones SET nombredeOperacion= '"+u.getNombredeOperacion()+"', ubicacion= '"+u.getUbicacion()+"',  duracionoperacion= '"+u.getDuracionoperacion()
	+"',  tipodeElementos= '"+u.getTipodeElementos()+"', cantidaddeElementos= '"+u.getCantidaddeElementos()+"' WHERE idoperaciones="+u.getIdoperaciones()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarOperaciones (String idoperaciones) {
		String response="";
		
	String cadenaSQL = "delete  FROM operaciones WHERE idoperaciones="+idoperaciones+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarOperacion(String idoperaciones) {
	
	String response="";
	String cadenaSQL = "select * from operciones WHERE idoperaciones="+idoperaciones+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombredeOperacion") + " " + rs.getString ("ubicacion")+ " "+ rs.getString ("duracionoperacion")+ " " + rs.getString ("tipodeElementos")+ " " + rs.getString ("cantidaddeElementos")+  " " +rs.getInt ("idoperaciones"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarOperaciones () {
	
	String response="";
	String cadenaSQL = "select * from operaciones;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombredeOperacion") + " " + rs.getString ("ubicacion")+ " "+ rs.getString ("duracionoperacion")+ " " + rs.getString ("tipodeElementos")+ " " + rs.getString ("cantidaddeElementos")+  " " +rs.getInt ("idoperaciones"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
