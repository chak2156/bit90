package day06;
import java.util.Scanner;
import day06.MyTest01;
class Test01Sub{
	int val;
	String msg;
}


public class Test01 {
	
	public static void main(String[] args) {
		
		Test01Sub sub = new Test01Sub();
		Test01Sub sub2 = new Test01Sub();
		Test01Sub sub3 = new Test01Sub();
		MyTest01 mt = new MyTest01();
		System.out.println(sub.msg+" "+sub.val);
		
		System.out.println(sub2.msg+" "+sub2.val);
		sub3 = sub2;//내용이 아니라 주소값을 대입하는것 (중요)
		sub2.msg = "dsfd22";
		sub3.val = 100;
		System.out.println(sub3.msg+" "+sub2.val);
		
		
		
		
		
		mt.main(args);
		
	}

}
