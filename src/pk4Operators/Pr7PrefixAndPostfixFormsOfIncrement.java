package pk4Operators;

public class Pr7PrefixAndPostfixFormsOfIncrement {
	public static void main(String[] args) {
		int a = 1;
		int b;
		
		b = a++;
		
		System.out.println("b is "+b);
		System.out.println("a is "+a);
		
		int c = 1;
		int d;
		
		d = ++c;
		System.out.println("c is "+c);
		System.out.println("d is "+d);
			
	}
}
