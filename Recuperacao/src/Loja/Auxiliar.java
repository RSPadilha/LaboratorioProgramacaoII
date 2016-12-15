package Loja;

public class Auxiliar extends Trabalhador{
	Auxiliar(String nome, int RG) {
		super(nome, RG);
	}
	public double calculaSalario(){
		return getSalario();
	}
}
