package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test06 {
	public static void main(String[] args) {
		try{
		a();
		}
		catch(Exception e){
			System.out.println("호출한 메서드가 받아서 확인");
		}
	}

	private static void a() throws FileNotFoundException{
		try{
		FileReader fr =new FileReader("a.txt");
		}
		catch(FileNotFoundException fnfe)
		{
		System.out.println("오류가 난 메소드에서 자체적으로 처리");
		throw fnfe;
		//예외의 강제 발생. 호출한 메소드에게 던질 예외
		}
	}

}
