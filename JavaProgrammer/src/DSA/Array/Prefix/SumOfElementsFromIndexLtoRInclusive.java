package DSA.Array.Prefix;

public class SumOfElementsFromIndexLtoRInclusive {

    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 10};
        int l = 1, r = 3;

        int[] prefix = prefixSumInclusive(arr);
        System.out.println(SumFromLtoRinclusive(prefix,l,r));
        
    }

    private static int SumFromLtoRinclusive(int[] prefix, int l, int r) {
		if(l==0) {
			return prefix[r];
		}
		return prefix[r]- prefix[l-1];
	}

	private static int[] prefixSumInclusive(int[] arr) {
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int i=1;i<arr.length;i++) {
        	prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    
    
}
