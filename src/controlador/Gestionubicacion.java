package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Ubicacion;

public class gestionUbicacion {
	Conexion cn;
	
	
	public String crearUbicacion (Ubicacion u) {
		String response="";
		
	String cadenaSQL = " insert into ubicacion ( estado, zonaMilitar, regionMilitar, idubicacion)"
			+ " values  ('"+u.getEstado()+"','"+u.getZonaMilitar()+"','"+u.getRegionMilitar()+"','"+u.getIdubicacion()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarUbicacion (Ubicacion u) {
		String response="";
		
	String cadenaSQL = "update ubicacion SET estado= '"+u.getEstado()+"', zonaMilitar= '"+u.getZonaMilitar()+"', regionMilitar= '"+u.getRegionMilitar()+"' WHERE idubicacion="+u.getIdubicacion()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarUbicacion (String idubicacion) {
		String response="";
		
	String cadenaSQL = "delete  FROM ubicacion WHERE idubicacion="+idubicacion+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarUbicacion(String idubicacion) {
	
	String response="";
	String cadenaSQL = "select * from ubicacion WHERE idubicacion="+idubicacion+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("estado") + " " + rs.getString ("zonaMilitar")+ " "+ rs.getString ("regionMilitar")+ " "  + rs.getInt("idubicacion"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarUbicaciones() {
	
	String response="";
	String cadenaSQL = "select * from ubicacion;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("estado") + " " + rs.getString ("zonaMilitar")+ " "+ rs.getString ("regionMilitar")+ " "  + rs.getInt("idubicacion"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
