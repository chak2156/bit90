/*
 *   exam02.txt
 *   ------------------------------
 *   김기수:98:66:78
 *   이지수:88:56:88
 *   박수리:78:86:58
 *   ------------------------------
 * 
 *   파일의 내용을 읽어서 아래와 같은 형식으로 출력
 *   파일형식 : 이름:자바:SQL:Jdbc
 *   수료 기준 
 *   - 자바 : 70점 이상
 *   - SQL  : 80점 이상
 *   - Jdbc : 80점 이상
 *   단, 출력결과는 exam02-result.txt에 출력
 *   
 *   실행시의 결과 출력 형식
 *   
 *   김기수 : 자바(수료), SQL(미수료), Jdbc(미수료)
 *   이기수 : 자바(수료), SQL(미수료), Jdbc(수료)
 *   박수리 : 자바(수료), SQL(수료), Jdbc(미수료)
 */
package day16.exam;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("data/exam02.txt");
			fw = new FileWriter("data/exam02-result.txt");
			String sd = "";
			while (true) {
				Character ch = (char)fr.read();
				sd=sd+ch.toString();
				String[] sarr = sd.split("\n\r");
//				System.out.println(ch);
				System.out.println(Arrays.toString(sarr));
				if(ch==((char)-1))break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.getStackTrace();
				}

			}
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.getStackTrace();
				}

			}
		}

	}
}
