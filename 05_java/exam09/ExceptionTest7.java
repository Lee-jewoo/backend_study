package exam09;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
	public void c() throws RuntimeException{}
}
class Child extends Parent{
	public void a() {}
	public void b() throws ArithmeticException{}
//	public void c() throws Exception{}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		
	}

}
