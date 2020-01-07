package pk5Methods;

public class Pr5PassingAndReturningAnArrayOfStrings {
	public String[] concatenate(String[] str) {
		String[] str1 = str;
		str1[0] = str[0]+" tutorials";
		str1[1] = str[1]+" tutorials";
		return str1;
	}
	public static void main(String[] args) {
		String[] str = {"Subbu", "Selenium"};
	
		Pr5PassingAndReturningAnArrayOfStrings pr5 = new Pr5PassingAndReturningAnArrayOfStrings();
		String[] str1 = pr5.concatenate(str);
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
	}
}
