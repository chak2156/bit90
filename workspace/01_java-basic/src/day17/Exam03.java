package day17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam03 {
	public static void main(String[] args) {
		try {
			searchEmployeeInfo("data/employee.txt", "김");
			searchEmployeeInfo("data/employee.txt", "다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param readFileName
	 *            : 읽을 파일명
	 * @param lastName
	 *            : 찾을 성씨
	 * @throws Exception
	 */
	public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception {
    	BufferedReader br = new BufferedReader(new FileReader(readFileName));
    	int cnt=0;
    	String[] sarr;
		while (true) {
			String s = br.readLine();
			if(s == null)break;
			sarr=s.split(":");
			if(sarr[0].startsWith(lastName)){
//				System.out.println(s);
				cnt++;
				System.out.printf("이름 : %s 나이: %s 부서: %s 월급: %s \n",sarr[0],sarr[1],sarr[2],sarr[3]);
			}
			
			
		}
		System.out.println(lastName+"씨 성을 가진 회원은 총 "+cnt+"명 입니다.");

//		for (int i = 0; i < sarr.length; i++) {
//
//			if (sarr[i].contains(lastName)) {
//				System.out.println(sarr[i]);
//			}
//		}
	}
}