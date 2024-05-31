package functinalInterface;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		Integer[] arr = {2,4,6};
		List<Integer> asList = Arrays.asList(arr);
		System.out.println(asList);
		asList.stream().forEach(t->System.out.println(t));
	}
	
}
