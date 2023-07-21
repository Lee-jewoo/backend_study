package exam07_6;

public class DBService {
	DBDAO dao;
	public void setDAO(DBDAO dao) { // 다형성
		this.dao = dao;
	}
	public void connect() {
		dao.connect();
	}

}
