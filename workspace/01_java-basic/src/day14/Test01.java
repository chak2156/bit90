package day14;

import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		Date d =new Date();
		System.out.println(d);//date클래스에서 오버라이딩된 투스트링이 자동적으로 적용됨. kst(한국표준시)로 나오는 이유는 운영채제 설치시에 설정한 값에 따른것
		
		File f = new File("data/a.txt");
		long time = f.lastModified();
		System.out.println(f.lastModified());
		
		Scanner sc = new Scanner(System.in);
		
		Date d2 = new Date(time);
		d2.setTime(0);
		System.out.println(d2);
		int year = d.getYear(); // Deprecated 된 객체
		System.out.println(year);
		long currTime = d.getTime();//d에 들어있는 시간정보 빼내기. 기본적으로 현재시간
		System.out.println(d);
		d2.setTime(currTime);//매개변수에 들어있는 시간으로 설정
		System.out.println(d2);
		
		
	}

}
