package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test05 {
	private static void a() throws FileNotFoundException{
		FileReader fr = new FileReader("a.txt");
	}
	private static void b() throws ArithmeticException{//자동으로 할당됨에도 굳이 선언하는 이유는 여기서 무슨 오류가 날지 개발자에게 알리기 위함
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		try{
		a();
		b();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("1");
		}
		catch(Exception e)
		{
			
		}
	}

}
