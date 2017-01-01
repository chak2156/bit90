/*
 *   exam01.txt 파일의 내용을 읽어서
 *   exam01-result.txt 파일에 아래의 형식으로 저장하는 프로그램 작성
 *   
     89
	 19
	 77
	 90
	 총점 : ...
	 평균 : ...
	 최고점 : ...
	 최저점 : ...
 */
package day16.exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam01 {
	static int high=0;
	static int low=100;
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			
			fr = new FileReader("data/exam01.txt");
			fw = new FileWriter("data/exam-result.txt");
			int num=0;
			int sum=0;
			double ever=0;
			int temp=0;
			
			while(true){
				int ch  = fr.read();
				int ch2 = fr.read();
				int ch3 = fr.read();
				int ch4 = fr.read();

				if(ch==-1)break;
					num = ((ch-48)*10)+(ch2-48);
					sum +=num;
					ever = sum/4;
					if(num<low){
						low=num;
					}
					if(num>high){
						high=num;
					}
					System.out.println("ch :"+ch);
					System.out.println("ch2:"+ch2);
					System.out.println("ch3:"+ch3);
					System.out.println("ch4:"+ch4);
					
//					System.out.println("num:"+num);
				fw.write(ch );
				fw.write(ch2);				
				fw.write(ch3);
				fw.write(ch4);
				

			}

			fw.write( "\n총점 : " + sum );
			fw.write( "\n평균 : " + ever );
			fw.write( "\n최고점 : " + high );
			fw.write( "\n최저점 : " + low );
			
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally
		{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}











