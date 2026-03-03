package DSA.Array;

public class NumberOfElementsGreaterThanX {

	public static void main(String[] args) {
		int [] arr = {3, 7, 1, 9, 4};
		int x =4;
		
		System.out.println(numberOfElementsGreaterThanX(arr,x));
	}

	private static int numberOfElementsGreaterThanX(int[] arr, int x) {
		int count=0;
		for(int i:arr) {
			if(i>x) {
				count++;
			}
		}
		return count;
	}
}
