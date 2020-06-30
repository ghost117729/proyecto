package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/prueba";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";

	private Connection conectar() {

		Connection conexion = null;	
		try {

			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {

			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return conexion;
	}
	
	
	public String ejecutarQuery(String sentencia) {
		
		String resp="";
		
		Connection conn = conectar();
		
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sentencia);
			preparedStmt.execute();
			resp="Se ejecuto correctamente la sentecia SQL";
			System.out.println("Sentencia ejecutada correctamente");
					
		}catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("La sentencia: " + sentencia + "No se ejecuto");
			resp="Fallo";
		}
		System.out.println("Usuario creado correctamente");
		return resp;
	}
    
	
public ResultSet consultarRegistro(String sentencia) throws SQLException {
		
		Connection conn = conectar();
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery (sentencia);
		return rs;
	}
public ResultSet consultarRegistros(String sentencia) throws SQLException {
	
	Connection conn = conectar();
	Statement s = (Statement) conn.createStatement();
	ResultSet rs = s.executeQuery (sentencia);
	return rs;
}
	public static void main(String[] args) {			
		Conexion cn = new Conexion();
		cn.conectar();
	}
		
  
	
	

}

	
	
	
	
	

