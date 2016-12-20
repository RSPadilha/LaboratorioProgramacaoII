package projetoLoja;

public class Auxiliar extends Funcionario{
	Auxiliar(String nome, String RG) {
		super(nome, RG, "Auxiliar");
	}
	public double calculaSalario(){
		return getSalario();
	}
}
