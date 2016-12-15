package Loja;

public class Trabalhador {
	private String Nome;
	private int RG;
	private double salario = 880;

	Trabalhador(String nome, int RG){
		this.Nome = nome;
		this.RG = RG;
	}
	public String getNome() {
		return Nome;
	}
	public int getRG() {
		return RG;
	}
	public double getSalario() {
		return salario;
	}
}
