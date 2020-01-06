package pk1classesandobjects.houseplanexample;

public class House {
	public static void main(String[] args) {
		HousePlan a = new HousePlan();
		a.bedrooms = 2;
		a.bathrooms = 1;
		
		HousePlan b = new HousePlan();
		b.bedrooms = 3;
		b.bathrooms = 2;
		
		System.out.println("Bedrooms in House a "+a.bedrooms);
		System.out.println("Bedrooms in House b "+b.bedrooms);
		
		System.out.println("Bathrooms in House a "+a.bathrooms);
		System.out.println("Bathrooms in House b "+b.bathrooms);
		
	}


}
