package exam08_1;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		java.util.GregorianCalendar
//		[time=1689922009798,
//		areFieldsSet=true,
//		areAllFieldsSet=true,
//		lenient=true,
//		zone=sun.util.calendar.ZoneInfo
//		[id="Asia/Seoul",
//		offset=32400000,
//		dstSavings=0,
//		useDaylight=false,
//		transitions=30,
//		lastRule=null],
//		firstDayOfWeek=1,
//		minimalDaysInFirstWeek=1,
//		ERA=1,
//		YEAR=2023,
//		MONTH=6,
//		WEEK_OF_YEAR=29,
//		WEEK_OF_MONTH=4,
//		DAY_OF_MONTH=21,
//		DAY_OF_YEAR=202,
//		DAY_OF_WEEK=6,
//		DAY_OF_WEEK_IN_MONTH=3,
//		AM_PM=1,
//		HOUR=3,
//		HOUR_OF_DAY=15,
//		MINUTE=46,
//		SECOND=49,
//		MILLISECOND=798,
//		ZONE_OFFSET=32400000,
//		DST_OFFSET=0]
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println(month+1+"월");
		System.out.println(day+"일");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1993, 7, 1);
		System.out.println(cal2.get(Calendar.YEAR)+"년");
		System.out.println(cal2.get(Calendar.MONTH)+1+"월");
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH)+"일");
		
	}

}
