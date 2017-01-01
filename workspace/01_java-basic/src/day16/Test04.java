package day16;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test04 {
	public static void main(String[] args) {
		
	
		InputStream in = System.in;//바이트형으로 받음
		InputStreamReader isr = new InputStreamReader(in);//문자단위로 입력받음
		System.out.print("입력 : ");
		try {
//			int ch =in.read();//scanner의 nextline과 비슷하지만 더 단순. 입력한 문자를 아스키 코드값으로 반환
//			abc 입력하면 abc\r\n 이 스트림에 입력됨. 다 입력되면 다시 스트림을 받음
			while(true){
				int cc = isr.read();//문자단위로 입력받음
				System.out.print((char)cc);//받은 문자형 데이터를 캐릭터로 변환.
//				int ch = in.read();//바이트형으로 받음
//				System.out.print((char)ch);//받은 바이트형 데이터를 캐릭터로 변환.
			}
		/*	
			System.out.println(ch);
			in.read();
			System.out.println(ch);
			in.read();
			System.out.println(ch);
			in.read();
			System.out.println(ch);
			in.read();
			System.out.println(ch);
			*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
