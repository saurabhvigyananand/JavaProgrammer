package TechMahindra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumberInList {

    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        Integer lNum= list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        System.out.println(lNum);
    }
}
