package programowanie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		String [] a = {"cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"};
		List<String> animals = Arrays.asList(a);
		
//		for (String animal : animals) {
//			System.out.println(animal + "; ");
//		}
		
		animals.forEach((animal) -> System.out.println(animal + "; "));
		
		animals.forEach(System.out::println);
		
		
		
	}
		
	

}
