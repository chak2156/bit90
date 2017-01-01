package day14;

import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int f=11;
		System.out.println(c);
		//Calendar->date객체 얻기
		Date d =c.getTime();
		//Date의 시간정보를 이용하여 Calendar의 시간을 설정
		c.setTimeInMillis(d.getTime());
		f=4;
		
		System.out.println(f);
		c.set(Calendar.HOUR, f);
		f=c.get(Calendar.HOUR);
		System.out.println(f);
		c.set(2014,1,10);
		
		
		f=c.get(Calendar.MONTH);
		System.out.println(f);
		f=c.get(Calendar.YEAR);
		System.out.println(f);
		
		
		f=c.getActualMaximum(Calendar.DAY_OF_MONTH);//객체 안의 최대값 뽑기. 이번달의 날자가 어디까지인지
		
		System.out.println(f);
		c.set(Calendar.MONTH,9);
		f=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(f);
	}

}
