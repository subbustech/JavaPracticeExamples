package classesandobjects;

public class ObjectExample2 {
	int a = 1;
	int b = 2;
	public void disp() {
		ObjectExample2 obj = new ObjectExample2();
		System.out.println("b value is "+ obj.b);
	}
	public static void main(String[] args) {
		ObjectExample2 ob = new ObjectExample2();
		System.out.println("a value is "+ob.a);
		ob.disp();
	}

}
