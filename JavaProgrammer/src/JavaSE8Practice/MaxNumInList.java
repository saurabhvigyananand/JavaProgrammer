import java.util.List;

public class MaxNumInList {

    public static void main(String[] args) {
        
        List<Integer> list = List.of(5, 2, 9, 1, 7);
        int max = list.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);

        //better approach
        max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);
    }
}

// Max => use when have to return max of element and returns optional