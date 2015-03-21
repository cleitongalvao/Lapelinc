package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	 public Connection conectar(){
		   
		    String url = "jdbc:mysql://localhost/teste";
		    String usuario = "root";
		    String senha = "Segur@nc@69";

		    try{
		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		      Connection conn = DriverManager.getConnection(url, usuario, senha);
		      return conn;
		    } 
		    catch(SQLException ex){
		      System.out.println("SQLException: " + ex.getMessage());
		      System.out.println("SQLState: " + ex.getSQLState());
		      System.out.println("VendorError: " + ex.getErrorCode());
		      return null;
		    }
		    catch(Exception e){
		      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
		      return null; 
		    }
		  }	

}
