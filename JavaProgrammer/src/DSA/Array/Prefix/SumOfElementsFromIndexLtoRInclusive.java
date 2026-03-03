package DSA.Array.Prefix;

public class SumOfElementsFromIndexLtoRInclusive {

    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 10};
        int l = 1, r = 3;

        System.out.println(prefixSumInclusive(arr));
    }

    private static boolean prefixSumInclusive(int[] arr) {
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        return  prefix[0] == arr[0];
    }
}
