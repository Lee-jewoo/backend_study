package workshop07;

public class ListTest01 {

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		
		MakeList l = new MakeList();
		l.makeArrayList(size);
		
		for (Integer i : l.getList()) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(l.getAverage());
	}

}
