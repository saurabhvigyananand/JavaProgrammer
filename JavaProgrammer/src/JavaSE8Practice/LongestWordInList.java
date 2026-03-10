import java.util.Comparator;
import java.util.List;

public class LongestWordInList {

    public static void main(String[] args) {

        List<String> list = List.of("java", "spring", "boot", "api");
        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longest);

        // other solution

        int maxLen =
        list.stream()
            .mapToInt(String::length)
            .max()
            .orElse(0);
        System.out.println(maxLen);
    }
}
