package enumerations;

public class LoopingThroughEnum3 {

	public enum season{
		WINTER, SPRING, SUMMER, FALL;
	}
	public static void main(String[] args) {
		
		//Iterating over an enum
		for(season s1:season.values()) {
			System.out.println(s1);
		}
	}
}