package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Oficiales;

public class gestionOficiales {
	Conexion cn;
	
	
	public String crearOficiales (Oficiales u) {
		String response="";
		
	String cadenaSQL = " insert into  oficiales (idoficial, nombreOficial, rangodeOficial, ramaMilitar)"
			+ " values  ('"+u.getIdoficial()+"','"+u.getNombreOficial()+"','"+u.getRangodeOficial()+"','"+u.getRamaMilitar()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarOficiales (Oficiales u) {
		String response="";
		
	String cadenaSQL = "update oficiales SET nombreOficial= '"+u.getNombreOficial()+"', rangodeOficial= '"+u.getRangodeOficial()+"', ramaMilitar= '"+u.getRamaMilitar()+"' WHERE idofical="+u.getIdoficial()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarOficiales (String idoficial) {
		String response="";
		
	String cadenaSQL = "delete  FROM  oficiales WHERE idoficial="+idoficial+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarOficial(String idoficial) {
	
	String response="";
	String cadenaSQL = "select * from oficiales WHERE idoficial="+idoficial+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idofical") + " " + rs.getString (" nombreOficial")+ " "+ rs.getString (" rangodeOficial")+ " "  + rs.getString ("ramaMilitar"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarOficiales () {
	
	String response="";
	String cadenaSQL = "select * from oficiales;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idofical") + " " + rs.getString (" nombreOficial")+ " "+ rs.getString (" rangodeOficial")+ " "  + rs.getString ("ramaMilitar"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
