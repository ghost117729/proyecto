package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.EquipoMilitar;

public class gestionEquipoMilitar {
	Conexion cn;
	
	
	public String crearEquipoMilitar (EquipoMilitar u) {
		String response="";
		
	String cadenaSQL = " insert into equipomilitar (idequipomilitar, tipodeCasco, tipodeChaleco, tipodeBotas, tipodeUniforme)"
			+ " values  ('"+u.getIdequipomilitar()+"','"+u.getTipodeCasco()+"','"+u.getTipodeChaleco()+"','"+u.getTipodeBotas()+"','"+u.getTipodeUniforme()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarEquipoMilitar (EquipoMilitar u) {
		String response="";
		
	String cadenaSQL = "update equipomilitar SET tipodeCasco= '"+u.getTipodeCasco()+"', tipodeChaleco = '"+u.getTipodeChaleco()+"',  tipodeBotas = '"+u.getTipodeBotas()+"',   tipodeUniforme = '"+u.getTipodeUniforme()+"' WHERE idequipomilitar"+u.getIdequipomilitar()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarEquipoMilitar (String idequipomilitar) {
		String response="";
		
	String cadenaSQL = "delete  FROM equipomilitar WHERE idequipomilitar="+idequipomilitar+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarEquipoMilitar(String idequipomilitar) {
	
	String response="";
	String cadenaSQL = "select * from equipomilitar WHERE idequipomilitar="+idequipomilitar+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idequipomilitar") + " " + rs.getString ("tipodeCasco")+ " "+ rs.getString ("tipodeChaleco")+ " "  + rs.getString ("tipodeBotas")+ " "  + rs.getString ("tipodeUniforme "));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarEquipoMilitares () {
	
	String response="";
	String cadenaSQL = "select * from equipomilitar;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getInt("idequipomilitar") + " " + rs.getString ("tipodeCasco")+ " "+ rs.getString ("tipodeChaleco")+ " "  + rs.getString ("tipodeBotas")+ " "  + rs.getString ("tipodeUniforme "));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
