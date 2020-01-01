package enumerations;

public class EnumsInSwitchCase7 {

	enum season {
		WINTER, SUMMER, FALL, SPRING;
	}
	public static void main(String[] args) {
		season s = season.WINTER;
		
		switch(s) {
			case WINTER:
				System.out.println("It's Winter");
				break;
			case SUMMER:
				System.out.println("It's Summer");
				break;
			case FALL:
				System.out.println("It's Fall");
				break;
			case SPRING:
				System.out.println("It's Spring");
				break;	
		}
	}

}
