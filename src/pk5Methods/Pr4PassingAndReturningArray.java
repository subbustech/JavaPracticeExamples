package pk5Methods;

public class Pr4PassingAndReturningArray {
	public static int[] mth(int[] arr) {
		int[] arr1 = arr;
		for (int i=0; i<arr.length; i++) {
			arr1[i] = arr[i]*2;
		}
	
		return arr1;
	}
	public static void main(String[] args) {
	
		int[] arr1 = {3,4,5};
		int[] arr2 = mth(arr1);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);	
	}

}
