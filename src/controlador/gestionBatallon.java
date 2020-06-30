package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Batallon;

public class gestionBatallon {
	Conexion cn;
	
	
	public String crearBatallon (Batallon u) {
		String response="";
		
	String cadenaSQL = " insert into batallon (idbatallon, nombredelBatallon, zonaMilitar, numerodeElementos, numerodeVehiculos, especialidad)"
			+ " values  ('"+u.getIdbatallon()+"','"+u.getNombredelBatallon()+"','"+u.getZonaMilitar()+"','"+u.getNumerodeElementos()+"','"+u.getNumerodeVehiculos()+"','"+u.getEspecialidad()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarBatallon (Batallon u) {
		String response="";
		
	String cadenaSQL = "update batallon SET nombredelBatallon= '"+u.getNombredelBatallon()+"', zonaMilitar= '"+u.getZonaMilitar()+"', numerodeElementos= '"+u.getNumerodeElementos()
	+"', numerodeVehiculos= '"+u.getNumerodeVehiculos()+"', especialidad= '"+u.getEspecialidad()+"' WHERE idbatallon="+u.getIdbatallon()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarBatallon (String idbatallon) {
		String response="";
		
	String cadenaSQL = "delete  FROM batallon WHERE idbatallon="+idbatallon+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarBatallon(String idbatallon) {
	
	String response="";
	String cadenaSQL = "select * from batallon WHERE idbatallon="+idbatallon+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idescuadron") + " " + rs.getString ("nombredelBatallon")+ " "+ rs.getString (" zonaMilitar")+ " " + rs.getInt ("numerodeElementos")+ " " + rs.getInt ("numerodeVehiculos")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarBatallones () {
	
	String response="";
	String cadenaSQL = "select * from batallon;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idescuadron") + " " + rs.getString ("nombredelBatallon")+ " "+ rs.getString (" zonaMilitar")+ " " + rs.getInt ("numerodeElementos")+ " " + rs.getInt ("numerodeVehiculos")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
