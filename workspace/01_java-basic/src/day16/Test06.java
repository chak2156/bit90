package day16;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {
		FileWriter fos = null;
		
		try {
			fos = new FileWriter("data/a2.txt",true);//파일내용이 있는경우 덮어씌움 true 는 어펜드 옵션. 덮어쓰기가 아니라 문자열이 추가로 들어감

				fos.write('a');
				fos.write(97);
				fos.write('가');
				System.out.println("쓰기완료");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally
		{
			
			try {
				if(fos!=null)
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
