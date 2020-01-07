package pk5Methods;

public class Pr6PassingAndReturningAnObject {
	public int a;
	
	public Pr6PassingAndReturningAnObject setVariable(Pr6PassingAndReturningAnObject opc) {
		Pr6PassingAndReturningAnObject pr6 = new Pr6PassingAndReturningAnObject();
		pr6.a = opc.a * 10;
		return pr6;
	}

	public static void main(String[] args) {
	
		Pr6PassingAndReturningAnObject opc1 = new Pr6PassingAndReturningAnObject();
		opc1.a = 2;
	
		Pr6PassingAndReturningAnObject opc2 = new Pr6PassingAndReturningAnObject();
		opc2 = opc2.setVariable(opc1);
		System.out.println(opc2.a);
	}

}