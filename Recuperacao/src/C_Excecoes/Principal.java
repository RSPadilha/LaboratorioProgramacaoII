package C_Excecoes;

public class Principal {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		try {
			for(int i = 0; i < 10; i++){
				System.out.println("Valor de a: "+a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array fora");
		}
	}
}
