package student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Kim = new Student("Kim", 100, 90, 95, 89);
		Student Lee = new Student("Lee", 60, 70, 99, 98);
		Student Park = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(Kim.getName()+" 평균: "+Kim.getAvg()+" 학점: "+Kim.getGrade());
		System.out.println(Lee.getName()+" 평균: "+Lee.getAvg()+" 학점: "+Lee.getGrade());
		System.out.println(Park.getName()+" 평균: "+Park.getAvg()+" 학점: "+Park.getGrade());
		

	}

}
