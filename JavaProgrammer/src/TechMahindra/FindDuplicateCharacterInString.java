package TechMahindra;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacterInString {

    static void main() {
        String s = "Saurabh";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("Duplicate character "+c );
            }else  {
                set.add(c);
            }
        }

    }
}
