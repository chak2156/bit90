
//패키지>임포트>클래스 순서대로 선언되어야 한다.
package day03;
import java.util.Scanner;//java api참조
public class Test06 {
	public static void main(String[]args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("input your name:");
		String name = sc.nextLine();
		System.out.println("입력된 이름:"+name);
		System.out.print("input your age:");
		name = sc.nextLine();
		System.out.println("입력된 나이:"+name);
		int temp =Integer.parseInt(name)+10;//형변환
		System.out.println("입력된 나이+10:"+temp);
		
		sc.close();
	}

}
