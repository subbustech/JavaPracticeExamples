package pk5Methods;

public class Pr2TakeIntegerArgumentsAndReturnNothing {
	public void add(int a, int b) {
		int c = a+b;	
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		int a = 2;
		int b = 2;
		Pr2TakeIntegerArgumentsAndReturnNothing pk2 = new Pr2TakeIntegerArgumentsAndReturnNothing();
	
		pk2.add(a,b);
	}

}