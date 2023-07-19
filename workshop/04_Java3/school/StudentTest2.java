package school;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		double sum_age = 0;
		double sum_height = 0;
		double sum_weight = 0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for (Student stu : studentArray) {
			System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getHeight()+"\t"+stu.getWeight());
			sum_age += stu.getAge();
			sum_height += stu.getHeight();
			sum_weight += stu.getWeight();
		}

		System.out.println();
		System.out.println("나이의 평균: "+String.format("%.2f", sum_age/studentArray.length));
		System.out.println("신장의 평균: "+String.format("%.2f", sum_height/studentArray.length));
		System.out.println("몸무게의 평균: "+String.format("%.2f", sum_weight/studentArray.length));
		
	}

}
