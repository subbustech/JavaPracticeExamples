package pk1classesandobjects;

public class Pr2ObjectExample {
	int a = 1;
	int b = 2;
	public void disp() {
		Pr2ObjectExample obj = new Pr2ObjectExample();
		System.out.println("b value is "+ obj.b);
	}
	public static void main(String[] args) {
		Pr2ObjectExample ob = new Pr2ObjectExample();
		System.out.println("a value is "+ob.a);
		ob.disp();
	}

}
