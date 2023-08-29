// 자바의 싱글톤 패턴
// UserService를 한 번만 생성하도록 구현
class UserService {
	// static 변수로 지정 -> getInstance 메서드 외부에서 사용해야 하기 때문
	private static UserService service;
	
	// 생성자를 private으로 지정
	private UserService() {
		
	}
	// 동일 메서드에서 생성
	public static UserService getInstance() {
		if (service==null) {
			service = new UserService();			
		}
		return service;
	}
	
}

public class TestMain {

	public static void main(String[] args) {

		UserService s1 = UserService.getInstance();
		UserService s2 = UserService.getInstance();
		
	}

}
