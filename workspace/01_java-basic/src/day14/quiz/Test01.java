package day14.quiz;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	Cal ca = new Cal();
	Cal2 ca2 = new Cal2();
	Scanner sc = new Scanner(System.in);
	//특정년도 날짜보기 특정월 날짜보기 종료
	while(true)
	{
		System.out.println("1.특정년도 날짜보기 2.특정월 날짜보기 3.종료");
		
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a)
		{
		case 1:{
			System.out.println("조회할 연도 입력: ");
			int b=Integer.parseInt(sc.nextLine());
			ca.cal(b);
			break;}
		case 2:{
			System.out.println("조회할 월 입력: ");
			int b=Integer.parseInt(sc.nextLine());
			ca2.cal(b);
			break;}
		case 3:System.exit(0);break;
		}
	}
	
	}
}
class Cal{
	public void cal(int pick){
		Calendar c = Calendar.getInstance();
		
		for(int j=0;j<=11;j++)
		{
		c.set(Calendar.YEAR,pick);
		c.set(Calendar.MONTH,j);
		System.out.printf("%d년 %2d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nlCnt = 0;
		c.set(Calendar.DAY_OF_MONTH, 1);
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);
		
		c.add(Calendar.MONTH, -1);
		int prevLastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int viewDay = prevLastDate - dayWeek + 2;
		
		for (int i = 1; i < dayWeek; i++) {
			System.out.print("\t");
			viewDay++;
			nlCnt++;
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.print(i + ((++nlCnt % 7 == 0) ? "\n" : "\t"));
		}
		
		for (int i = 1; ++nlCnt <= 42; i++) {
			System.out.print(((nlCnt % 7 == 0) ? "\n" : "\t"));
			
		}
	}
	}
}

class Cal2{
	public void cal(int pick){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH,--pick);
		System.out.printf("%d년 %2d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nlCnt = 0;
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);
		
		c.add(Calendar.MONTH, -1);
		int prevLastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int viewDay = prevLastDate - dayWeek + 2;
		
		for (int i = 1; i < dayWeek; i++) {
			System.out.print(viewDay++ + "\t");
			nlCnt++;
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.print(i + ((++nlCnt % 7 == 0) ? "\n" : "\t"));
		}
		
		for (int i = 1; ++nlCnt <= 42; i++) {
			System.out.print(i + ((nlCnt % 7 == 0) ? "\n" : "\t"));
			
		}
	}
}