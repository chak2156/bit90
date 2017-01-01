package day12;
import java.util.Random;

class OverClass{
	public void test(){}
}

class SubClasee extends OverClass{
	public void test(){}
	
}


class MyRandom extends Random{
	public int nextInt(int max){
		return super.nextInt(max)+1;
	}
}
		
		
public class Test03 {
	public static void main(String[] args) {
		System.out.println("호오오옹이");
		Random r = new MyRandom();//묵시적 형변환
		int num = r.nextInt(10);
		System.out.println(num);
	}

}
