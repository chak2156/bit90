package hansalgo;
//정수가 아닌 자연수 사용,printf 활용
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class triangle {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		float a=0.0f,b=0.0f,c=0.0f;
		System.out.println("자연수a입력");
		a=Float.parseFloat(read.readLine());
		System.out.println(a);
		System.out.println("자연수b입력");
		b=Float.parseFloat(read.readLine());
		System.out.println(b);
		
		c=a*b/2;
		System.out.printf("%.2f",c);
		

		}
}
