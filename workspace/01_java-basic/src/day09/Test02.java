package day09;

class Sub02{
	int i = 100;
	static int k = 100;
	static{//static 블럭 : 클래스 정보가 로딩될 때 같이 실행된다
		System.out.println("스태틱 블럭 실행됨");
		
	}
	Sub02(){
		System.out.println("생성자 호출됨");
	}
}


public class Test02 {
	public static void main(String[] args) {
		System.out.println(1);
		Sub02 s02 = new Sub02();
		
		System.out.println(2);
	}
	

}
