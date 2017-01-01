package hansalgo;
//형변환,printf활용2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class average {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		int a=0,b=0,c=0,d=0;
		float e=0f;
		a=Integer.parseInt(read.readLine());
		b=Integer.parseInt(read.readLine());
		c=Integer.parseInt(read.readLine());
		d=Integer.parseInt(read.readLine());

		System.out.printf("입력 \n%d %d %d %d \n",a,b,c,d);
		e=(float)(a+b+c+d)/4;//cast연산자는 원래 값에 영향을 끼치지 않는다.
		System.out.printf("출력 \n%.2f",e);
		
		}
}
