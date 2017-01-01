package day17;
import java.io.*;
import java.util.Arrays;

import javax.xml.transform.stax.StAXSource; 

public class Exam01 { 

    public static void dataCheck(String file1 , String file2) throws Exception{
        // 구현하세요~ ---------------------------------------------------
        // 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!

    	FileReader fr = new FileReader(file1);
    	FileReader fr2 = new FileReader(file2);
    	String sd = "";
    	String sd2 = "";
    	
		String[] sarr;
		String[] sarr2;
		while (true) {
			Character ch = (char)fr.read();
			sd=sd+ch.toString();
			sd.split("\n\r");
			if(ch==((char)-1))break;
		}
		sarr = sd.split("\n");
		while (true) {
			Character ch = (char)fr2.read();
			sd2=sd2+ch.toString();
			sd2.split("\n\r");
			if(ch==((char)-1))break;
		}
		sarr2 = sd2.split("\n");
		for(int i = 0 ;i<sarr.length;i++){

		if(sarr[i].equalsIgnoreCase(sarr2[i])){
			System.out.println("Line "+(i+1)+": Equal");
		}
		else{
			System.out.println("Line "+(i+1)+": Not Equal");
		}
		}
       	
    	
        // --------------------------------------------------------------
    }   
    
    // main 메서드는 수정하지 마세요.
    public static void main(String[] args) throws Exception {       
        try {
            dataCheck("data/data1.txt", "data/data2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}