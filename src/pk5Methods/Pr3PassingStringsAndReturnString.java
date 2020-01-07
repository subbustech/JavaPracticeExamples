package pk5Methods;

public class Pr3PassingStringsAndReturnString {
	public String concatenate(String str1, String str2) {
		String str3 = str1+" "+str2;
		return str3;
	}
	public static void main(String[] args) {
		String str1 = "Subbu";
		String str2 = "Selenium";
		
		Pr3PassingStringsAndReturnString pk3 = new Pr3PassingStringsAndReturnString();
		String str3 = pk3.concatenate(str1, str2);
		System.out.println(str3);
	}
}
