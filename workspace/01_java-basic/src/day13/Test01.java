package day13;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {//예외를 다른 클래스로 넘겨버림
		//System.out.println(1/0);//ArithmeticException
		FileReader fr = new FileReader("a.txt");
		//컴파일시점에서 발견되므로 런타임 예외를 상속받지 않는다
		Scanner sc = new Scanner(new File("a.txt"));
		
		
	}

}
