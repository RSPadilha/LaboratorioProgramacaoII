package projetoLoja;

public class Gerente extends Funcionario{
	Gerente(String nome, String RG){
		super(nome, RG, "Gerente");
	}
	public double calculaSalario(){
		return getSalario() * 5;
	}
}
