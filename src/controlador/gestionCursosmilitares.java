package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Cursosmilitares;

public class gestionCursosmilitares {
	Conexion cn;
	
	
	public String crearCursosmilitares (Cursosmilitares u) {
		String response="";
		
	String cadenaSQL = " insert into cursosmilitares (idCursos, nombredeCurso, duraciondelCurso)"
			+ " values  ('"+u.getIdCursos()+"','"+u.getNombredeCurso()+"','"+u.getDuraciondelCurso()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarCursosmilitares (Cursosmilitares u) {
		String response="";
		
	String cadenaSQL = "update cursosmilitares SET nombredeCurso= '"+u.getNombredeCurso()+"', duraciondelCurso= '"+u.getDuraciondelCurso()+"' WHERE idCursos="+u.getIdCursos()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarCursosmilitares (String idCursos) {
		String response="";
		
	String cadenaSQL = "delete  FROM cursosmilitares WHERE idCursos="+idCursos+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarCursomilitar(String idCursos) {
	
	String response="";
	String cadenaSQL = "select * from cursosmilitares WHERE idCursos="+idCursos+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idCursos") + " " + rs.getString ("nombredeCurso")+ " "+ rs.getString ("duraciondlCurso"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarCursosmilitares () {
	
	String response="";
	String cadenaSQL = "select * from cursosmilitares;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idCursos") + " " + rs.getString ("nombredeCurso")+ " "+ rs.getString ("duraciondlCurso"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
