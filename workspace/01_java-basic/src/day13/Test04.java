package day13;

import java.io.FileReader;

public class Test04 {
	public static void main(String[] args) {
		
		try{
			System.out.println("1");
		FileReader fr = new FileReader("data/a.txt");
		fr.read();
		System.out.println("2");
		}
		catch(Exception e){
			System.out.println("3");
			return;
		}
		finally{//return보다 강력하다. 캐치 밑에 리턴 있어도 발동. system.exit(0)은 그냥 프로그램 종료라 발동안됨
			System.out.println("4");
			
		}
		System.out.println("5");
	}
}
