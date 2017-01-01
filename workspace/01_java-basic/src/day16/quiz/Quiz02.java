package day16.quiz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Quiz02 {
	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = System.in;
			char c,d,e;
			while(true){
				System.out.println("문자 입력: ");
				c = (char) is.read();//문자열 받고 스트림에 /r /n이 남아있으니 이걸 비워줘야한다
				d = (char) is.read();
				e = (char) is.read();
				if(c=='q'||c=='Q'){
					System.out.println("종료합니다.");
					break;
					}
				System.out.println("받은 문자:"+c);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		/*
		 * 화면에서 문자를 입력받아 입력받은 문자를 출력 단, 문자는 한문자만 입력 받는다. 입력받은 문자가 'Q' 또는 'q' 일경우
		 * 화면에 "종료합니다" 메시지 출력
		 * 
		 * 실행결과 > 한문자를 입력하세요 : m 입력된 문자는 m 입니다. 한문자를 입력하세요 : q 종료합니다.
		 */

	}
}
