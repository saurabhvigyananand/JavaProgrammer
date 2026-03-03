package TechMahindra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacterInString {

    static void main() {
        String s="saurabah";
        Map<String, Long> map =
                Arrays.stream(s.split(""))
                        .collect(Collectors.groupingBy(c ->c, TreeMap::new,Collectors.counting()));
        System.out.println(map);
    }
}
