package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		
		Date d = new Date();
		System.out.println(d);
		
		// Date 타입을 문자열로 변환
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy");
		String result1 = s1.format(d);
		System.out.println(result1);
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String result2 = s2.format(d);
		System.out.println(result2);
		
		// 문자열을 Date 타입으로 변환
		String t = "2023년 7월 21일";
		SimpleDateFormat s3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date d2 = s3.parse(t);
		System.out.println(d2);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); // Date를 Calendar로 변환
		System.out.println(cal);

	}

}
