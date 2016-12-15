package B_Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Conta até 10");
		conta(0);
	}

	private static int conta(int a){
		if (a <= 10) {
			System.out.println(a);
			return conta(a+1);
		} else {
			return 0;
		}
	}
}
