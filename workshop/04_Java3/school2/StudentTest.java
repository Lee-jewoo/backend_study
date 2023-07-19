package school2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i=0; i<studentArray.length; i++) {
			studentArray[i].studentInfo();
		}
		System.out.println();
		
		double sum_age = 0;
		double sum_height = 0;
		double sum_weight = 0;
		for (int i=0; i<studentArray.length; i++) {
			sum_age += studentArray[i].getAge();
			sum_height += studentArray[i].getHeight();
			sum_weight += studentArray[i].getWeight();
		}

		System.out.println("나이의 평균: "+String.format("%.2f", sum_age/studentArray.length));
		System.out.println("신장의 평균: "+String.format("%.2f", sum_height/studentArray.length));
		System.out.println("몸무게의 평균: "+String.format("%.2f", sum_weight/studentArray.length));
		System.out.println();
		
		int max_age = studentArray[0].getAge();
		int max_age_i = 0;
		int min_age = studentArray[0].getAge();
		int min_age_i = 0;
		int max_height = studentArray[0].getHeight();
		int max_height_i = 0;
		int min_height = studentArray[0].getHeight();
		int min_height_i = 0;
		int max_weight = studentArray[0].getWeight();
		int max_weight_i = 0;
		int min_weight = studentArray[0].getWeight();
		int min_weight_i = 0;
		for (int i=0; i<studentArray.length; i++) {
			if (max_age<studentArray[i].getAge()) {
				max_age = studentArray[i].getAge();
				max_age_i = i;
			}
			if (min_age>studentArray[i].getAge()) {
				min_age = studentArray[i].getAge();
				min_age_i = i;
			}
			if (max_height<studentArray[i].getHeight()) {
				max_height = studentArray[i].getHeight();
				max_height_i = i;
			}
			if (min_height>studentArray[i].getHeight()) {
				min_height = studentArray[i].getHeight();
				min_height_i = i;
			}
			if (max_weight<studentArray[i].getWeight()) {
				max_weight = studentArray[i].getWeight();
				max_weight_i = i;
			}
			if (min_weight>studentArray[i].getWeight()) {
				min_weight = studentArray[i].getWeight();
				min_weight_i = i;
			}
		}
		System.out.println("나이가 가장 많은 학생: "+studentArray[max_age_i].getName());
		System.out.println("나이가 가장 어린 학생: "+studentArray[min_age_i].getName());
		System.out.println("키가 가장 큰 학생: "+studentArray[max_height_i].getName());
		System.out.println("키가 가장 작은 학생: "+studentArray[min_height_i].getName());
		System.out.println("몸무게가 가장 큰 학생: "+studentArray[max_weight_i].getName());
		System.out.println("몸무게가 가장 작은 학생: "+studentArray[min_weight_i].getName());
		
	}

}
