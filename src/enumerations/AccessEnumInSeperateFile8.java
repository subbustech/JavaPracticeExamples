package enumerations;

public class AccessEnumInSeperateFile8 {

	public static void main(String[] args) {
		EnumInSeperateFile8 s = EnumInSeperateFile8.WINTER;
		
		System.out.println(s+" "+s.value);
		
		for(EnumInSeperateFile8 s1:EnumInSeperateFile8.values()) {
			System.out.println(s1+" "+s1.value);
		}
		
	}

}
