package hansalgo;
//iostream 기본틀과 입출력
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class swap {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		int a,b,c;
		System.out.println("정수a입력");
		a=Integer.parseInt(read.readLine());
		System.out.println("정수b입력");
		b=Integer.parseInt(read.readLine());
		c=a;
		a=b;
		b=c;
		System.out.println("a:"+a+" b:"+b);
	}

}
