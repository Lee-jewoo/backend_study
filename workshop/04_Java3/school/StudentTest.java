package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i=0; i<studentArray.length; i++) {
			System.out.println(studentArray[i].getName()+"\t"+studentArray[i].getAge()+"\t"+studentArray[i].getHeight()+"\t"+studentArray[i].getWeight());	
		}
		double avg_age;
		double sum_age = 0;
		for (int i=0; i<studentArray.length; i++) {
			sum_age += studentArray[i].getAge();
		}
		avg_age = sum_age/studentArray.length;
		System.out.println("나이의 평균: "+String.format("%.2f", avg_age));
		
		double avg_height;
		double sum_height = 0;
		for (int i=0; i<studentArray.length; i++) {
			sum_height += studentArray[i].getHeight();
		}
		avg_height = sum_height/studentArray.length;
		System.out.println("신장의 평균: "+String.format("%.2f", avg_height));
		
		double avg_weight;
		double sum_weight = 0;
		for (int i=0; i<studentArray.length; i++) {
			sum_weight += studentArray[i].getWeight();
		}
		avg_weight = sum_weight/studentArray.length;
		System.out.println("몸무게의 평균: "+String.format("%.2f", avg_weight));
		
	}

}
