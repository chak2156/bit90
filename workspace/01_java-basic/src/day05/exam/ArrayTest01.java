package day05.exam;
import java.util.Scanner;
public class ArrayTest01 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	String arr[]={"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
	System.out.println("년도 입력:");
	int age = sc.nextInt();
	System.out.printf("%d 년에 태어난 당신은 %s띠 입니다",age,arr[age%arr.length]);
	sc.close();
	
	}
}
