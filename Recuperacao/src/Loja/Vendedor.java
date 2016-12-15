package Loja;

public class Vendedor extends Trabalhador{
	private int vendas = 0;
	Vendedor(String nome, int RG) {
		super(nome, RG);
	}
	public double calculaSalario(){
		return getSalario() +  (vendas * 0.05);
	}
	public void vendaRealizada(double venda){
		this.vendas+=venda;
	}
}
