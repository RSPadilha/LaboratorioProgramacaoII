package Loja;

public class Gerente extends Trabalhador{
	Gerente(String nome, int RG){
		super(nome, RG);
	}
	public double calculaSalario(){
		return getSalario() * 5;
	}
}
