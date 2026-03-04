package DSA.Array.Prefix;

public class RangeDivisibleByKQueries {
	
	// The number of elements in the range [L, R] that are divisible by K.
	
	public static void main(String[] args) {
		int [] arr = {2, 3, 4, 9, 12, 15, 18};
		int k = 3;
		int l = 0, r = 6;
		
		int[] prefixDivisibleCount = rangeDivisibleByKQueries(arr,k);
		
		System.out.println(countOfElementsDivisibleByKinRange(prefixDivisibleCount,l,r));
	}

	private static int countOfElementsDivisibleByKinRange(int[] prefixDivisibleCount, int l, int r) {
		if(l==0) {
			return prefixDivisibleCount[r];
		}
		return prefixDivisibleCount[r] - prefixDivisibleCount[l-1];
	}

	private static int[] rangeDivisibleByKQueries(int[] arr, int k) {
		int [] prefix = new int [arr.length];
		prefix[0] = arr[0] % k ==0 ? 1 : 0;
		
		for ( int i = 1; i<arr.length;i++) {
			if(arr[i] % k ==0) {
				prefix[i] = prefix[i-1]+ 1;
			} else {
				prefix[i] = prefix[i-1];
			}
		}
		return prefix;
	}

}
