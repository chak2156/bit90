package day16;
//buffer를 활용한 파일 복붙
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		//Kalimba.mp3 : 약 40초 (8,414,449byte)
		//buffer 
		FileInputStream fis = null; // 배열로 주고받는데 리턴값은 버퍼에 담은 데이터의 크기만큼. -1이면 끝이라고 알림
		FileOutputStream fos = null;
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		
		
		try {
			fis = new FileInputStream("data/Kalimba.mp3");//1차 스트림 클래스. 처리하려는 곳에 직접 가있는 메서드
			fos = new FileOutputStream("data/Kalimba1.mp3");
			bis = new BufferedInputStream(fis);//2차 스트림 클래스. 필터개념의 클래스
			bos = new BufferedOutputStream(fos);//기본 버퍼 사이즈를 갖고 있으며 따로 인트형으로 매개변수를 줘서 정할수도 있다
			long s = System.currentTimeMillis();
			
			while(true){
				int ch = bis.read();
				if(ch==-1)break;
				bos.write(ch);
				
			}
			double time = (System.currentTimeMillis()-s)/1000d;
			System.out.println(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		finally{
			if(bis != null){
				try {
					bis.close();//2차 스트림부터 닫아줘야 한다
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	
			if(bos != null){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis != null){
				try {
					fis.close();//2차 스트림부터 닫아줘야 한다
					
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
