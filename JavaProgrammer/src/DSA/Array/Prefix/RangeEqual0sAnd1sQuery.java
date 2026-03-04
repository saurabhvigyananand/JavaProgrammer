package DSA.Array.Prefix;

public class RangeEqual0sAnd1sQuery {

	// Range Equal 0s and 1s Query
	
	public static void main(String[] args) {
		int [] arr = {1, 0, 1, 1, 0, 0};
		int l = 0, r = 3;
		
		int [] prefixSum = rangeBalanceEqual(arr);
		int value =rangebalance(prefixSum,l,r);
		if(value==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	private static int rangebalance(int[] prefixSum, int l, int r) {
		if(l==0) {
			return prefixSum[r];
		}
		return prefixSum[r]- prefixSum[l-1];
	}

	private static int[] rangeBalanceEqual(int[] arr) {
		int [] prefix = new int [arr.length];
		prefix[0] = arr[0]==0? -1:1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==1) {
				prefix[i] = prefix[i-1]+1;
			}else {
				prefix[i] = prefix[i-1]-1;
			}
		}
		return prefix;
	}
}
