package stu2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleAndSumMain {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(numbers.stream().collect(Collectors.summingInt(n -> n*2)));
		
	}
}
