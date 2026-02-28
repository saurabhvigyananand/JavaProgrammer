package JavaSE8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		int [] arr1 = new int[] {2,3,4,5,6,7};
		int [] arr2 = new int[] {1,2,3,4,5};
		
		List<Integer> list1 = Arrays.stream(arr1).boxed().toList();
		List<Integer> commonElements =
				Arrays
				.stream(arr2)
				.boxed()
				.filter(list1::contains).toList();
		System.out.println(commonElements);
	}
}
