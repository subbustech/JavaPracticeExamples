package pk5Methods;

public class Pr1TakeIntegerArgumentsAndReturnInteger {
	public int add(int a, int b) {
		int c = a+b;	
		return c;
	}
	public static void main(String[] args) {
	
		int a = 2;
		int b = 2;
		Pr1TakeIntegerArgumentsAndReturnInteger pk = new Pr1TakeIntegerArgumentsAndReturnInteger();
	
		System.out.println(pk.add(a,b));
	}
}
