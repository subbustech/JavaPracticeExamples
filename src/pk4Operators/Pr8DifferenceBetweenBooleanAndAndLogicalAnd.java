package pk4Operators;

public class Pr8DifferenceBetweenBooleanAndAndLogicalAnd {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 2;
		if(((a==b) & (a==c))) {
			System.out.println("equal values");
		}
		else {
			System.out.println("values are not equal");
		}		
	}
}
