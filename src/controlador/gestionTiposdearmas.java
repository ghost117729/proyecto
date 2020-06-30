package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBD.Conexion;
import modelo.Tiposdearmas;

public class gestionTiposdearmas {
	Conexion cn;
	
	
	public String crearTiposdearmas (Tiposdearmas u) {
		String response="";
		
	String cadenaSQL = " insert into tiposdearmas (tipodeModelo, tipodeMunicion, tipodeAlcance, tipodeCalibre, idarmas)"
			+ " values  ('"+u.getTipodeModelo()+"','"+u.getTipodeMunicion()+"','"+u.getTipodeAlcance()+"','"+u.getTipodeCalibre()+"','"+u.getIdarmas()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarTiposdearmas (Tiposdearmas u) {
		String response="";
		
	String cadenaSQL = "update tiposdearmas SET tipodeModelo= '"+u.getTipodeModelo()+"', tipodeMunicion= '"+u.getTipodeMunicion()+"', tipodeAlcance= '"+u.getTipodeAlcance()
	+"',  tipodeCalibre= '"+u.getTipodeCalibre()+"' WHERE idarmas="+u.getIdarmas()+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarTiposdearmas (String idescuadron) {
		String response="";
		
	String cadenaSQL = "delete  FROM tiposdearmas WHERE idescuadron="+idescuadron+";";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);

	return response;
	}

public String consultarTiposdearma(String idescuadron) {
	
	String response="";
	String cadenaSQL = "select * from tiposdearmas WHERE idescuadron="+idescuadron+";";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistro(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("tipodeModelo") + "tipodeMunicion" + rs.getString ("tipodeAlcance")+ " "+ rs.getString ("tipodeCalibre")+ " " +rs.getInt ("idarmas"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}

public String consultarTiposdearmas () {
	
	String response="";
	String cadenaSQL = "select * from tiposdearmas;";
	cn = new Conexion();

try {
	ResultSet rs = cn.consultarRegistros(cadenaSQL);
	
	while (rs.next()) {
		
		System.out.println (rs.getString("tipodeModelo") + "tipodeMunicion" + rs.getString ("tipodeAlcance")+ " "+ rs.getString ("tipodeCalibre")+ " " +rs.getInt ("idarmas"));
	}
		
} catch (SQLException e) {
	e.printStackTrace();
}
return response;
}
}
