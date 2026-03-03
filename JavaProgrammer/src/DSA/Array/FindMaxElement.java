package DSA.Array;

public class FindMaxElement {

	public static void main(String[] args) {
		int[] arr = {3, 7, 1, 9, 4};
		
		System.out.println(maxElement(arr));
	}

	private static int maxElement(int[] arr) {
		int max = arr[0];
		
		for(int i : arr) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}
}
