package exam07_5;

public class TestMain {

	public static void main(String[] args) {
		DBService service = new DBService();
		service.setDAO(new MySQLDAO());
		service.connect();
		
	}

}
