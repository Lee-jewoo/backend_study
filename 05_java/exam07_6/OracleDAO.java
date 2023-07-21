package exam07_6;

public class OracleDAO implements DBDAO{
	// Oracle을 연동하는 메서드
	@Override
	public void connect() {
		System.out.println("OracleDAO.connect_oracle");
	}

}
