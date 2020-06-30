package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.VehiculosAereos;

public class gestionVehiculosAereos {
	Conexion cn;
	
	
	public String crearVehiculosAereos (VehiculosAereos u) {
		String response="";
		
	String cadenaSQL = " insert into vehiculosaereos (aviondeAtaque, aviondeBombardero, aviondeTransporte, aviondeReconocimiento, avionCaza,   idvehiculosaereos)"
			+ " values  ('"+u.getAviondeAtaque()+"','"+u.getAviondeBombardero()+"','"+u.getAviondeTransporte()+"','"+u.getAviondeReconocimiento()+"','"+u.getAvionCaza()+"','"+u.getIdvehiculosaereos()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarVehiculosAereos (VehiculosAereos u) {
		String response="";
		
	String cadenaSQL = "update vehiculosaereos SET aviondeAtaque= '"+u.getAviondeAtaque()+"', aviondeBombardero= '"+u.getAviondeBombardero()+"', aviondeTransporte= '"+u.getAviondeTransporte()
	+"', aviondeReconocimiento= '"+u.getAviondeReconocimiento()+"', avionCaza= '"+u.getAvionCaza()+"' WHERE idvehiculosaereos="+u.getIdvehiculosaereos()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarVehiculosAereos (String idescuadron) {
		String response="";
		
	String cadenaSQL = "delete  FROM vehiculosaereos WHERE idescuadron="+idescuadron+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarVehiculoAereo(String idescuadron) {
	
	String response="";
	String cadenaSQL = "select * from vehiculosaereos WHERE idescuadron="+idescuadron+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("aviondeAtaque") + " " + rs.getString ("aviondeBombardero")+ " "+ rs.getString ("aviondeTransporte")+ " " + rs.getString ("aviondeReconocimiento")+ " " + rs.getString ("avionCaza")+rs.getInt ("idvehiculosaereos"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarVehiculosAereos () {
	
	String response="";
	String cadenaSQL = "select * from vehiculosaereos;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("aviondeAtaque") + " " + rs.getString ("aviondeBombardero")+ " "+ rs.getString ("aviondeTransporte")+ " " + rs.getString ("aviondeReconocimiento")+ " " + rs.getString ("avionCaza")+rs.getInt ("idvehiculosaereos"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
