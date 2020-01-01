package enumerations;

public class InitializingValuesToEnumConstants6 {

	enum season{
		WINTER(5), SPRING(10), SUMMER(20), FALL(30);
		
		private int value1;
		private season(int value1) {
			this.value1 = value1;
		}
	}
	
	public static void main(String[] args) {
		for(season s:season.values()) {
			System.out.println(s+" "+s.value1);
		}

	}

}
