package JavaSE8Practice;

import java.util.List;

public class CheckAllNumsArePositiveInList {
	
	// To check all elements in list -> allMatch()

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		Boolean bool = list.stream().allMatch(n->n>0);
		System.out.println(bool);
 	}
}
