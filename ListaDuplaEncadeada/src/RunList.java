
public class RunList {

	public static void main(String[] args){
		List<String> listString = new List<>();
		List<Integer> listInt = new List<>();
		listString.append("This is a test1");
		listString.append("This is a test2");
		listString.append("This is a test3");
		listString.append("This is a test4");
		listString.append("This is a test5");
		listString.append("This is a test6");
		listString.append("This is a test7");
		System.out.println(listString.mostraProx());
		listInt.append(20);
		
		System.out.println(listString);
		System.out.println(listInt);
	}

}
