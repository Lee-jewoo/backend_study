import java.sql.Date;

public class DogTest3 {

	public static void main(String[] args) {
		
		// 서로 다른 패키지의 동명의 클래스에 접근
		Date d = new Date(10); // sql의 Date
		java.util.Date e = new java.util.Date(); // util의 Date
		
	}

}
