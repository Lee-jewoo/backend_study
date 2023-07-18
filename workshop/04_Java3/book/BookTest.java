package book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("Java 2.0", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름"+"\t"+"\t"+"가격"+"\t"+"할인율"+"\t"+"할인후금액");
		System.out.println("-----------------------------------------");
		System.out.println(b1.getBookName()+"\t"+b1.getBookPrice()+"원 \t"+b1.getBookDiscountRate()+"% \t"+b1.getDiscountBookPrice()+"원");
		System.out.println(b2.getBookName()+"\t"+b2.getBookPrice()+"원 \t"+b2.getBookDiscountRate()+"% \t"+b2.getDiscountBookPrice()+"원");
		System.out.println(b3.getBookName()+"\t"+b3.getBookPrice()+"원 \t"+b3.getBookDiscountRate()+"% \t"+b3.getDiscountBookPrice()+"원");

	}

}
