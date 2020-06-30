package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.PerrosMilitares;

public class gestionPerrosMilitares {
	Conexion cn;
	
	
	public String crearPerrosMilitares (PerrosMilitares u) {
		String response="";
		
	String cadenaSQL = " insert into perrosmilitares (idperros, nombredeperro, raza, especialidad)"
			+ " values  ('"+u.getIdperros()+"','"+u.getNombredeperro()+"','"+u.getRaza()+"','"+u.getEspecialidad()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarPerrosMilitares (PerrosMilitares u) {
		String response="";
		
	String cadenaSQL = "update perrosmilitares SET nombredeperro= '"+u.getNombredeperro()+"', raza= '"+u.getRaza()+"', especialidad= '"+u.getEspecialidad()+"' WHERE idcaballos="+u.getIdperros()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarPerrosMilitares (String idperros) {
		String response="";
		
	String cadenaSQL = "delete  FROM perrosmilitares WHERE idperros="+idperros+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarPerrosMilitar(String idperros) {
	
	String response="";
	String cadenaSQL = "select * from perrosmilitares WHERE idperros="+idperros+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idperros") + " " + rs.getString ("nombredeperro")+ " "+ rs.getString ("raza")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarPerrosMilitares () {
	
	String response="";
	String cadenaSQL = "select * from perrosmilitares;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idperros") + " " + rs.getString ("nombredeperro")+ " "+ rs.getString ("raza")+ " "  + rs.getString ("especialidad"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
