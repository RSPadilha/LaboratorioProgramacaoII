package E_CRUD;

import java.util.Scanner;

public class Principal {
	static informacoes crud;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int op;
		while(true){
			System.out.println("1 - Incluir \n"
					+ "2 - Ler \n"
					+ "3 - Atualizar \n"
					+ "4 - Deletar");
			op = scan.nextInt();
			switch(op){
			case 1:
				Incluir();
				break;
			case 2:
				Ler();
				break;
			case 3:
				Atualizar();
				break;
			case 4:
				Deletar();
				break;
			case 0:
				System.exit(0);
			}
		}
	}
	private static void Incluir(){
		System.out.println("Nome: ");
		String nome = scan.next();
		System.out.println("Data de nascimento: ");
		int nascimento = scan.nextInt();
		crud = new informacoes(nome, nascimento);
	}
	private static void Ler(){
		System.out.println(crud);
	}
	private static void Atualizar(){
		System.out.println("Nome: ");
		String nome = scan.next();
		System.out.println("Data de nascimento: ");
		int nascimento = scan.nextInt();
		crud.atualiza(nome, nascimento);
	}
	private static void Deletar(){
		crud = null;
	}

}
