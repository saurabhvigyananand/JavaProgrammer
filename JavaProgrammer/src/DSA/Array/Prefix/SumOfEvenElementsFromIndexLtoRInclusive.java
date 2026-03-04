package DSA.Array.Prefix;

public class SumOfEvenElementsFromIndexLtoRInclusive {

	public static void main(String[] args) {
		int [] arr = {2, 3, 4, 7, 8, 10};
		int l= 0,r =5;
		
		int [] prefix = evenPrefixSum(arr);
		System.out.println(sumOfEvenElement(prefix,l,r));
	}

	private static int sumOfEvenElement(int[] prefix, int l, int r) {
		if(l==0) {
			return prefix[r];
		}
		return prefix[r]-prefix[l-1];
	}

	private static int[] evenPrefixSum(int[] arr) {
		int [] prefix = new int [arr.length];
		prefix[0] = (arr[0] % 2) == 0? 1 : 0 ;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%2==0) {
				prefix[i]= prefix[i-1]+ 1;
			} else {
	            prefix[i] = prefix[i - 1];
	        }
		}
		return prefix;
	}
}
