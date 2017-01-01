package hanstest;

public class ArrayPra {
public static void main(String[] args) {
	
	
	Object[] gogo = new Object[9];
	// 4번째 배열에 있는 ㅇㅇ 를 2번째로 옮겨라
	gogo[4]="ㅇㅇ";
	gogo[2]=gogo[4];
	gogo[4]=4;
	// 2번째 배열에 있는 ㅇㅇ를 스트링으로 형변환
	String sd = (String)gogo[2];
	int fdf =(int)gogo[4];
	String sad = String.format("%s", gogo[4]);
	System.out.printf("sd,sad : %s,%s fdf: %d \n",sd,sad,fdf);
	
	
}
}
