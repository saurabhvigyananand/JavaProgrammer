import java.util.List;

public class TotalLenOfAllWords {

    public static void main(String[] args) {

        List<String> list = List.of(
                "java",
                "spring",
                "boot",
                "api",
                "micro");

        long len = list.stream().mapToInt(String::length).sum();
        System.out.println(len);
    }
}
