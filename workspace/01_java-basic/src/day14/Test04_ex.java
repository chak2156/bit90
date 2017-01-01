package day14;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class Test04_ex{
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년MM월");
		String timeStr = sdf.format(new Date());
		System.out.println(timeStr);
		int day = c.get(Calendar.MONTH);
		int[] daysOfThisMonth = new int[c.getActualMaximum(Calendar.DAY_OF_MONTH)];
		
		day=Calendar.DAY_OF_MONTH;
		
		System.out.println(day);
		System.out.println("일	월	화	수	목	금	토");
		for(int i=0;i<daysOfThisMonth.length;i++){
			daysOfThisMonth[i]=i+1;
			if(i!=0 && i%7==0){System.out.println("");}
			System.out.print(daysOfThisMonth[i]+"	");
		}
		
		//1~getMAXIMUM
		//1의 위치 잡기 = 데이오브위크
		//이전달~다음달 위치 넣기
		
	}

}
