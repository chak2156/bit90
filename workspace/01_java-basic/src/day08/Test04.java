package day08;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("data/day08/test04.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){//다음 읽을 내용이 있는지 찾아 트루펄스 반환
		System.out.println(sc.nextLine());//내용 한줄 읽어 반환
		}
		
	}

}
