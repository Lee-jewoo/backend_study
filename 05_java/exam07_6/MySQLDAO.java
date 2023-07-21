package exam07_6;

public class MySQLDAO implements DBDAO{
	// MySQLDAO을 연동하는 메서드
	@Override
	public void connect() {
		System.out.println("MySQLDAO.connect_mysql");
	}

}
