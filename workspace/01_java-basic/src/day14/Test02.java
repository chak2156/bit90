package day14;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR); //

		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(year);
		System.out.println(month);
		
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.println(hour);
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		String[] dow= {"일","월","화","수","목","금","토"};
		/*
		switch(dayofweek){
		case 1:dow="일요일";break;
		case 2:dow="월요일";break;
		case 3:dow="화요일";break;
		case 4:dow="수요일";break;
		case 5:dow="목요일";break;
		case 6:dow="금요일";break;
		case 7:dow="토요일";break;
			}
			*/
		
		System.out.printf("오늘은 %s요일 입니다.\n",dow[dayofweek-1]);
		
		

	}

}
