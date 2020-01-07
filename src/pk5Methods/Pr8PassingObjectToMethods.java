package pk5Methods;

class Test 
{ 
	int x;
	Test() { 
		x = 0; 
	} 
	Test(int i) { 
		x = i; 
	} 
} 

public class Pr8PassingObjectToMethods
{ 
	public static void main(String[] args) 
	{ 
		// t is a reference 
		Test t = new Test(5); 
		
		// Reference is passed and a copy of reference 
		// is created in change() 
		change(t); 
		
		// Old value of t.x is printed 
		System.out.println(t.x); 
	} 
	public static void change(Test t) 
	{ 
		// We changed reference to refer some other location 
		// now any changes made to reference are not reflected 
		// back in main 
		//t = new Test(); 
		
		t.x = 10; 
	} 
} 
