package E_CRUD;

public class informacoes {
	String Nome;
	int Nascimento;
	informacoes(String nome, int nascimento){
		Nome = nome;
		Nascimento = nascimento;
		
	}
	
	public void atualiza(String nome, int nasc){
		Nome = nome;
		Nascimento = nasc;
		
	}
	@Override
	public String toString() {
		return "Nome: " + Nome + ", Nascimento: " + Nascimento;
	}
}
