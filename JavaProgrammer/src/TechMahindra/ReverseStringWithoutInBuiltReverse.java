package TechMahindra;

public class ReverseStringWithoutInBuiltReverse {

    static void main() {
        String s = "saurabh";
        String reversed ="";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);
        System.out.println(new StringBuilder(reversed).reverse());
    }
}
