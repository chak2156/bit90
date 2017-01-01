package hansalgo;
//iostream 기본틀
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class m2s {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(br);
		
		/*
 프로그램 명: m2s
제한시간: 1 초
분을 입력으로 받아 초로 변환하는 프로그램을 작성하시오.

입력

분 m 이 자연수로 주어진다. ( 1 <= m <= 60)
출력

변환 된 초를 출력 예의 형식으로 출력한다. 출력을 간단히 하기 위해 1 분도 1 minutes 로 쓰기로 한다.
입출력 예

입력

2

출력

2 minutes is 120 seconds.
		  */
		
		int m=0;
		int s=0;
		m=Integer.parseInt(read.readLine());
		if(1<=m&&m<=60){
			s=m*60;
		System.out.printf("%d minutes is %d seconds",m,s);
		
		}
		else{
			System.out.println("1~60이내의 값을 입력");
		}
	}

}
