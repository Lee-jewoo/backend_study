package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	Random rand = new Random(11);
	ArrayList<Integer> list;	
	public MakeList() {}
	public void makeArrayList(int size) {
		list = new ArrayList<Integer>(size);
		for (int i=0; i<size; i++) {
			list.add((rand.nextInt(10)+10));
		}
	}
	
	public double getAverage() {
		int sum = 0;
		for (int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		double average = (double)sum/list.size();
		return average;
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}

}
