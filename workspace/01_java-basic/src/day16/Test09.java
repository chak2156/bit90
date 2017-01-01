package day16;
//buffer를 만들어 파일 복붙
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {
	public static void main(String[] args) {
		//Kalimba.mp3 : 약 40초 (8,414,449byte)
		//buffer 
		FileInputStream fis = null; // 배열로 주고받는데 리턴값은 버퍼에 담은 데이터의 크기만큼. -1이면 끝이라고 알림
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("data/Kalimba.mp3");
			fos = new FileOutputStream("data/Kalimba1.mp3");
			long s = System.currentTimeMillis();
			byte[] buffer = new byte[32 * 1024];
			while(true){
				int ch = fis.read(buffer);//버퍼를 사용하게 함
				if(ch==-1)break;
				fos.write(buffer,0,ch);//버퍼
				
			}
			double time = (System.currentTimeMillis()-s)/1000d;
			System.out.println(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
