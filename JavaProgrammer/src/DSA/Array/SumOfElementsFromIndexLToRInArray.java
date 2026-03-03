package DSA.Array;

public class SumOfElementsFromIndexLToRInArray {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8};
		int l = 1, r = 3;
		
		System.out.println(sumFromLToRIndex(arr,l,r));
		
		int[] prefix =buildPrefix(arr);
		System.out.println(rangeSum(prefix,l,r));
		
		
	}


	// Brute Force
	private static int sumFromLToRIndex(int[] arr, int l, int r) {
		int count = 0;
		for(int i=l;i<=r;i++) {
			count+=arr[i];
		}
		return count;
	}
	
	// Optimized version
	
	private static int rangeSum(int[] prefix, int l, int r) {
		if(l == 0) {
	        return prefix[r];
	    }
		return prefix[r]-prefix[l-1];
		
	}

	private static int[] buildPrefix(int[] arr) {
		int[ ] prefix = new int [arr.length];
		prefix[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		return prefix;
	}
	
	
}
