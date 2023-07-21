package exam07_5;

public class DBService {
	MySQLDAO dao;
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	public void connect() {
		dao.connect_mysql();
	}

}
