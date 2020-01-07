package pk5Methods;

public class Pr7PassingPrimitiveValuesToMethods {
	public static void main(String[] args) 
	{ 
		int x = 5; 
		change(x); 
		System.out.println(x); 
	} 
	//Primitive values are passed to methods by value
	public static void change(int x) 
	{ 
		x = 10; 
	}

}