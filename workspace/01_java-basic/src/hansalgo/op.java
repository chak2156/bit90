package hansalgo;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class op {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		int a=0,b=0;
		System.out.println("정수a입력");
		a=Integer.parseInt(read.readLine());
		System.out.println("정수b입력");
		b=Integer.parseInt(read.readLine());

		System.out.printf(" %d + %d = %d \n %d - %d = %d \n %d * %d = %d \n %d / %d = %d \n %d %% %d = %d \n ",a,b,a+b,a,b,a-b,a,b,a*b,a,b,a/b,a,b,a%b);
	}
}
