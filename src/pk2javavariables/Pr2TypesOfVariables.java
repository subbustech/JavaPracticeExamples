package pk2javavariables;

public class Pr2TypesOfVariables {
	static int c = 6; //Class Variable
	int d = 8;		//Instance Variable
	public static void main(String[] args) {
		int a = 5; //Local Variable
		int b = a * 5; //Local Variable
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
		Pr2TypesOfVariables tov = new Pr2TypesOfVariables();
		System.out.println("d value is "+tov.d);
		
		for(int i = 0; i<4; i++) {
			int j = 2; //Block Variable
			System.out.println(a*j);
		}
	}
}
