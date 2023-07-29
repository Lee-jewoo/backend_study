package workshop07;

public class ListTest02 {

	public static void main(String[] args) {

		ConvertList con = new ConvertList();
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		for (int i=0; i<array.length; i++) {
			System.out.println(con.convertList(array).get(i));
		}

	}

}
