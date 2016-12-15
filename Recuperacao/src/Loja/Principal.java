package Loja;
import javax.swing.*;//visuais

public class Principal {
	/*3 tipos funcionarios {gerentes, vendedores, auxiliares}
	 * registro nome e RG
	 * vendedores salario base + comissao 5%
	 * auxiliar salario base
	 * gerente salario * 5
	 */

	public static void main(String[] args) {
		//sqlconnect
		Gerente ger = new Gerente("Fulano", 511);
		System.out.println("Nome: "+ger.getNome());
		System.out.println("Salario: "+ger.calculaSalario());
		Vendedor vend = new Vendedor("Siclano", 4909);
		System.out.println("Nome: "+vend.getNome());
		System.out.println("Salario: "+vend.calculaSalario());
		Auxiliar aux = new Auxiliar("Jose", 999);
		System.out.println("Nome: "+aux.getNome());
		System.out.println("Salario: "+aux.calculaSalario());
	}
	
	
}
