package JavaSE8Practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLetterAndWordsInAlphabeticallyInGroup {

    static void main() {
        List<String> list = List.of("java", "spring", "security", "boot", "hibernate", "api", "micro", "cloud");

        Map<Character, List<String>> map =
                list.stream().sorted().collect(Collectors.groupingBy(s->s.charAt(0)));

        map.forEach((k,v)->{
            System.out.println(k +"->"+ v);
        });
    }
}
