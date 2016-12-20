package projetoLoja;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		menu();//UI
		/*3 tipos funcionarios {gerentes, vendedores, auxiliares}
		 * registro nome e RG
		 * vendedores salario base + comissao 5%
		 * auxiliar salario base
		 * gerente salario * 5
		 */
	}

	private static Object menu(){
		String[] opcoes = {"Create", "Read", "Update", "Delete"};
		int escolha;
		escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Menu", 0, 3, null, opcoes, 0);	
		switch(escolha){
		case -1:
			System.exit(0);
			break;
		case 0:
			create();
			break;
		case 1:
			read();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		}
		return menu();
	}

	private static void create(){
		String nome, RG;
		String[] tiposFuncionarios = {"Auxiliar", "Vendedor", "Gerente"};
		int tipoFuncionario;
		nome = JOptionPane.showInputDialog("Nome");
		RG = JOptionPane.showInputDialog("RG");
		tipoFuncionario = JOptionPane.showOptionDialog(null, "Escolha o tipo de funcionario", "Funcionario", 0, 3, null, tiposFuncionarios, null);
		Funcionario funcionario;
		switch(tipoFuncionario){//fazer polimorfismo
		case 0:
			funcionario = new Auxiliar(nome, RG);
			break;
		case 1:
			funcionario = new Vendedor(nome, RG);
			break;
		case 2:
			funcionario = new Gerente(nome, RG);
			break;
		}
	}
	private static void read(){
		ResultSet rs =  BD.read();
		try {
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	//JOptionPane.showOptionDialog(null, "Escolha", "Funcionarios", 0, 1, null, op, 0);//buscar lista no bd
	}
	private static void update(){
		String nomeOld, nomeNew;
		nomeOld = JOptionPane.showInputDialog(null, "Quem você quer alterar?");
		nomeNew = JOptionPane.showInputDialog(null, "Qual o novo nome?");
		BD.update(nomeOld, nomeNew);//passar tarefa para funcionario
	}
	private static void delete(){
		String nome;
		nome = JOptionPane.showInputDialog(null, "Nome de quem deseja deletar");
		BD.delete(nome);//mudar para funcionario.delete()
	}


}
