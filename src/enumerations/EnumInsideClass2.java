package enumerations;

public class EnumInsideClass2 {

	public enum season{
		WINTER, SPRING, SUMMER, FALL;
	}
	public static void main(String[] args) {
		
		//Printing an enum constant
		season s = season.WINTER;
		System.out.println(s);
	}
}