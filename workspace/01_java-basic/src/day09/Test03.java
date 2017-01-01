package day09;
class Sub03{
	static int count = 0;
}


public class Test03 {
	int i = 100;
	static int k =100;
	
	public void call(){
		Sub03 sub = new Sub03();
		
		//논 스태틱 영역에서는 스테틱 영역의 변수 또는 메서드를 접근할 수 없다
		System.out.println(i);
		System.out.println(k);
		System.out.println(sub.count);//비효율적
		sub.count=100;
		System.out.println(Sub03.count);
		Sub03.count = 200;
		System.out.println(sub.count);
		
	}
public static void main(String[] args) {
//	System.out.println(i); 
// 스태틱 영역에서 넌스태틱 변수나 메소드를 직접 접근 할 수 없다 - 메인에는 스테틱 붙어있음
	Test03 t03 = new Test03();
// 인스턴스 영역의 변수 또는 매서드는 메모리를 생성한 후 접근해야 한다	
	t03.call();
	System.out.println(t03.i);
}
}
