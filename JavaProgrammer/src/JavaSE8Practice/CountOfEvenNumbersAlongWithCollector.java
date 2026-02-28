package JavaSE8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfEvenNumbersAlongWithCollector {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		int [] arr = new int[] {1,2,3,4,5,6};
		
		long listCount = list.stream().filter(n->n%2==0).count();
		long arrCount = Arrays.stream(arr).filter(n->n%2==0).count();
		long collCount = list.stream().filter(n->n%2==0).collect(Collectors.counting());
		System.out.println(listCount+ " "+arrCount+ " "+collCount);
	}
}
