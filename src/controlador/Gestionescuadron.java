package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Escuadron;

public class gestionEscuadron {
	Conexion cn;
	
	
	public String crearEscuadron (Escuadron u) {
		String response="";
		
	String cadenaSQL = " insert into escuadron (nombredeEscuadron, sargento, fusilero, granadero, ametralladora,  rebastecedor, medico, idescuadron)"
			+ " values  ('"+u.getNombredeEscuadron()+"','"+u.getSargento()+"','"+u.getFusilero()+"','"+u.getGranadero()+"','"+u.getAmetralladora()+"','"+u.getRebastecedor()+"','"
			+u.getMedico()+"','"+u.getIdescuadron()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarEscuadron (Escuadron u) {
		String response="";
		
	String cadenaSQL = "update escuadron SET nombredeEscuadron= '"+u.getNombredeEscuadron()+"', sargento= '"+u.getSargento()+"', fusilero= '"+u.getFusilero()
	+"', granadero= '"+u.getGranadero()+"', ametralladora= '"+u.getAmetralladora()+"', rebastecedor= '"+u.getRebastecedor()+"', medico= '"+u.getMedico()+"' WHERE idescuadron="+u.getIdescuadron()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarEscuadron (String idescuadron) {
		String response="";
		
	String cadenaSQL = "delete  FROM escuadron WHERE idescuadron="+idescuadron+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarEscuadron(String idescuadron) {
	
	String response="";
	String cadenaSQL = "select * from escuadron WHERE idescuadron="+idescuadron+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombredeEscuadron") + " " + rs.getString ("sargento")+ " "+ rs.getString ("fusilero")+ " " + rs.getString ("granadero")+ " " + rs.getString ("ametralladora")+ " " + rs.getString (" rebastecedor")+ " " + rs.getString ("medico")+ " " +rs.getInt ("idescuadron"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarEscuadrones () {
	
	String response="";
	String cadenaSQL = "select * from escuadron;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("nombredeEscuadron") + " " + rs.getString ("sargento")+ " "+ rs.getString ("fusilero")+ " " + rs.getString ("granadero")+ " " + rs.getString ("ametralladora")+ " " + rs.getString (" rebastecedor")+ " " + rs.getString ("medico")+ " " +rs.getInt ("idescuadron"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
