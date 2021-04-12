package ListInterfacesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 3, 2, 1, 4, 5, 4, 3, 5, 4, 6, 7, 8, 8, 8, 6, 5, 4, 9, 0));

		LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>(ar);
		ArrayList<Integer> ar0 = new ArrayList<Integer>(LHS);
		System.out.println(ar0);

		ArrayList<Integer> Marks = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 2, 3, 2, 1, 4, 5, 4, 3, 5, 4, 6, 7, 8, 8, 8, 6, 5, 4, 9, 0));
		List<Integer> MarksList = Marks.stream().distinct().collect(Collectors.toList());
		System.out.println(MarksList);
	}
}
