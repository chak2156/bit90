package hansalgo;
//역시 형변환과 printf의 이용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CtoF {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		int a=0;
		float e=0f;
		a=Integer.parseInt(read.readLine());

		System.out.printf("입력 \n%d \n",a);
		e=(((float)9/5*a)+32);//자동형변환
		System.out.printf("출력 \n%.1f",e);
		
		}
}
