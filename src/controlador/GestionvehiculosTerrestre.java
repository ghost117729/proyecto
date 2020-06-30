package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.VehiculosTerrestre ;

public class gestionVehiculosTerrestre {
	Conexion cn;
	
	
	public String crearVehiculosTerrestre  (VehiculosTerrestre  u) {
		String response="";
		
	String cadenaSQL = " insert into vehiculosterrestre (camionesMilitares, carrosdeCombate, carrosBlindaos, carrosMultiproposito,  idvehiculosterrestre)"
			+ " values  ('"+u.getCamionesMilitares()+"','"+u.getCarrosdeCombate()+"','"+u.getCarrosBlindaos()+"','"+u.getCarrosMultiproposito()+"','"+u.getIdvehiculosterrestre()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarVehiculosTerrestre  (VehiculosTerrestre  u) {
		String response="";
		
	String cadenaSQL = "update vehiculosterrestre SET camionesMilitares= '"+u.getCamionesMilitares()+"', carrosdeCombate= '"+u.getCarrosdeCombate()+"', carrosBlindaos= '"+u.getCarrosBlindaos()
	+"', carrosMultiproposito= '"+u.getCarrosMultiproposito()+"' WHERE  idvehiculosterrestre="+u.getIdvehiculosterrestre()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarVehiculosTerrestre  (String  idvehiculosterrestre) {
		String response="";
		
	String cadenaSQL = "delete  FROM vehiculosterrestre WHERE  idvehiculosterrestre="+ idvehiculosterrestre+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarVehiculoTerrestre (String  idvehiculosterrestre) {
	
	String response="";
	String cadenaSQL = "select * from vehiculosterrestre WHERE  idvehiculosterrestre="+ idvehiculosterrestre+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("camionesMilitares") + " " + rs.getString ("carrosdeCombate")+ " "+ rs.getString ("carrosBlindaos")+ " " + rs.getString ("carrosMultiproposito")+ " " +rs.getInt (" idvehiculosterrestre"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarVehiculosTerrestre  () {
	
	String response="";
	String cadenaSQL = "select * from vehiculosterrestre;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println  (rs.getString("camionesMilitares") + " " + rs.getString ("carrosdeCombate")+ " "+ rs.getString ("carrosBlindaos")+ " " + rs.getString ("carrosMultiproposito")+ " " +rs.getInt (" idvehiculosterrestre"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
