package day14.quiz;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
//현재 이전 다음 종료

public class Test001 {
	public static void main(String[] args) {
		Cal3 c2 = new Cal3();
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("1.현재 2.이전달 3.다음달 0.종료");
		int a=Integer.parseInt(sc.nextLine());
		switch(a)
		{
		case 1:c2.cal3(a);break;
		case 2:c2.cal3(a);break;
		case 3:c2.cal3(a);break;
		case 0:System.exit(0);break;
			
		}
		}
//		이전달 선택
//		달-
//		만약 달이 1월이면 12월로 바꾸고 년도-
//
//		다음달 선택
//		달+
//		만약 달이 12월이면 1월로 바꾸고 년도+
//		
	}
}
class Cal3{
	Calendar c = Calendar.getInstance();
	public void cal3(int pick){
		
		
		if(pick==1){
			this.c.setTime(new Date());
		}
		
		else if(pick==2){
			c.add(Calendar.MONTH,-1);

			}
		else if(pick==3){
			c.add(Calendar.MONTH,1);

			}
		
		System.out.printf("%d년 %2d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nlCnt = 0;
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);
		
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
