package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Conexion1 {
	
	Connection con;
	public Conexion1()  {
		try {
			
			Class.forName ("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			
		} catch (Exception e) {
			System.err.println("Error" +e);
			
		}
	}

	public static void main(String[] args) {
		
		Conexion1 cn=new Conexion1 ();
		Statement st;
		ResultSet rs;
		try {
		st=(Statement) cn.con.createStatement();
		rs=st.executeQuery("select * from login");
		while (rs.next()) {
			System.out.println(rs.getString("Nombre")+" "+rs.getInt("Contraseña"));
		}
		
		cn.con.close();
		
		
	
		} catch (Exception e) {
	
	}
	}

}
