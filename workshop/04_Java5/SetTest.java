package workshop07;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet<Character> input = new HashSet<Character>();
		for (int i=0; i<args[0].length(); i++) {
			input.add(args[0].charAt(i));
		}
		System.out.println(input);
	}

}
