package workshop07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {

	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0; i<size; i++) {
			list.add((rand.nextInt(10)+1));
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for (int i=0; i<size; i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
		 
	}

}
