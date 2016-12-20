package projetoLoja;

public class Funcionario {
	private double salario = 880;//criar mais uma coluna pro salario total tendo como base o salario minimo

	Funcionario(String nome, String RG, String tipo){
		BD.insert(nome, RG, tipo);
	}
	public double getSalario() {
		return salario;
	}
}
