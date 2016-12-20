package projetoLoja;

public class Vendedor extends Funcionario{
	private int vendas = 0;
	Vendedor(String nome, String RG) {
		super(nome, RG, "Vendedor");
	}
	public double calculaSalario(){//insere no banco
		return getSalario() +  (vendas * 0.05);
	}
	public void vendaRealizada(double venda){
		this.vendas+=venda;
	}
}
