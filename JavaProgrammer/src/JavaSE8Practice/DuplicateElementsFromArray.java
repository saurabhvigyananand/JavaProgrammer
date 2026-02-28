package JavaSE8Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		int [] arr = new int [] {2,3,4,6,3,5,6,3};
		
		Set<Integer> seen = new HashSet<>();
		
		Set<Integer> duplicates = Arrays.stream(arr)
										.filter(n-> !seen.add(n))
										.boxed()
										.collect(Collectors.toSet());
		System.out.println(duplicates);
		
	}
}
