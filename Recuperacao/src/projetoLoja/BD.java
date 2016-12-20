package projetoLoja;

import java.sql.*;

public class BD {
	static private Connection con;
	static private Statement stm;
	static private ResultSet rs;

	public static void conectar(){
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/recu", "postgres", "admin");
			stm = con.createStatement();
		} catch (Exception e) {
			System.out.println("Não conectou");
		}
	}
	public static void insert(String nome, String RG, String tipo){
		try {
			conectar();
			stm.executeUpdate("Insert into funcionarios values ('"+nome+"', '"+RG+"', '"+tipo+"')");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void update(String nomeOld, String nomeNew){
		try{
			conectar();
			stm.executeUpdate("Update funcionarios set nome = '"+nomeNew+"' where nome = '"+nomeOld+"'");
		}catch(SQLException e){
			
		}
	}
	public static void delete(String nome){
		try {
			conectar();
			stm.executeQuery("delete from funcionarios where nome = '"+nome+"'");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static ResultSet read(){
		try {
			conectar();
			rs = stm.executeQuery("select * from funcionarios");
			return rs;
		} catch (Exception e) {
			return null;
		}
	}
}
