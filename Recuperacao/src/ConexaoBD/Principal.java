package ConexaoBD;

import java.sql.*;

public class Principal {
	//Connection conn;
	Statement stm;
	ResultSet rs;
	
	public static void conectar(){
		try{
		Class.forName("org.postgresql.Driver");
		System.out.println("driver ok");
		String url = "jdbc:postgresql://localhost:5432/recu";
		String user= "postgres";
		String senha = "admin";
		
		try{
		Connection conn = DriverManager.getConnection(url, user, senha);
		System.out.println("conectou");
		}catch (SQLException sqle){
			System.out.println("nao conectou");
		}
		}catch (ClassNotFoundException e){
			System.out.println("n carregou driver");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		conectar();
		//conectou
	}

}
