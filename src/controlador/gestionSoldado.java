package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Soldado;

public class gestionSoldado {
	Conexion cn;
	
	
	public String crearSoldado (Soldado u) {
		String response="";
		
	String cadenaSQL = " insert into soldado (nombre, apellidoP, apellidoM, matricula, batallon, ramaMilitar, especialidad, idsoldado)"
			+ " values  ('"+u.getNombre()+"','"+u.getApellidoP()+"','"+u.getApellidoM()+"','"+u.getMatricula()+"','"+u.getBatallon()+"','"+u.getRamaMilitar()+"','"
			+u.getEspecialidad()+"','"+u.getIdsoldado()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarSoldado (Soldado u) {
		String response="";
		
	String cadenaSQL = "update soldado SET nombre= '"+u.getNombre()+"', apellidoP= '"+u.getApellidoP()+"', apellidoM= '"+u.getApellidoM()
	+"', matricula= '"+u.getMatricula()+"', batallon= '"+u.getBatallon()+"', especialidad= '"+u.getEspecialidad()+"' WHERE idsoldado="+u.getIdsoldado()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarSoldado (String idsoldado) {
		String response="";
		
	String cadenaSQL = "delete  FROM soldado WHERE idsoldado="+idsoldado+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarSoldado(String idsoldado) {
	
	String response="";
	String cadenaSQL = "select * from soldado WHERE idsoldado="+idsoldado+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombre") + " " + rs.getString ("apellidoP")+ " "+ rs.getString ("apellidoM")+ " " + rs.getString ("matricula")+ " " + rs.getString ("batallon")+ " " + rs.getString ("ramaMilitar")+ " " + rs.getString ("especialidad")+ " " +rs.getInt ("idsoldado"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarSoldados () {
	
	String response="";
	String cadenaSQL = "select * from soldado;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombre") + " " + rs.getString ("apellidoP")+ " "+ rs.getString ("apellidoM")+ " " + rs.getString ("matricula")+ " " + rs.getString ("batallon")+ " " + rs.getString ("ramaMilitar")+ " " + rs.getString ("especialidad")+ " " +rs.getInt ("idsoldado"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
