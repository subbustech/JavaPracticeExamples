package enumerations;

public class ValuesAndIndex4 {

	public enum season{
		WINTER, SPRING, SUMMER, FALL;
	}
	public static void main(String[] args) {
		
		//Printing the values
		System.out.println(season.valueOf("WINTER"));
		System.out.println(season.valueOf("SPRING"));
		System.out.println(season.valueOf("SUMMER"));
		
		//Printing the index
		System.out.println(season.valueOf("WINTER").ordinal());
		System.out.println(season.valueOf("SPRING").ordinal());
		System.out.println(season.valueOf("SUMMER").ordinal());
	}
}