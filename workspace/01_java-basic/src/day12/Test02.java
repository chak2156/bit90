package day12;
interface InterA{
	public void a();
}
interface InterB extends InterA{//인터페이스가 인터페이스를 상속받을 때는 확장하는 개념으로 상속
	public void b();
}

interface InterSuper{
	//인터페이스에 선언되는 모든 변수에는 public static final 키워드가 삽입된다.
	int PORT = 8000;// = public static final int PORT = 8000;
	//인터페이스 안에 있는 메서드는 자동적으로 public abstract 라는 접근제한자와 키워드가 추가된다
	void call();
	void print();
	default void test(){//구현되지 않으면 기본적으로 나올 사항을 정할때 사용. 1.8버전부터 가능
		System.out.println("default");
		
	}
	
}
class InterSub implements InterSuper,InterB{//클래스가 인터페이스를 상속받을 때에는 인터페이스는 다중상속 가능
	public void call(){}//오버라이딩
	public void print(){}
	public void b(){}
	public void a(){}//InterB가 InterA도 상속받았으므로 거기 있는 메소드도 구현한다
}
interface InterFfd{}
abstract class FfdSuper implements InterFfd{
	abstract void ffdm();
	
}
class FfdSub extends FfdSuper{
	public void ffdm(){}
	
}

public class Test02 {
	public static void main(String [] args){
		InterSuper iSuper = new InterSub();
		InterB ib = new InterSub();
		InterB ia = new InterSub();
		//부모는 자식을 받을 수 있다.
		System.out.println(InterSuper.PORT);// static일때만 클래스.변수 형태로 변수 호출이 가능하다
		System.err.println(iSuper.PORT);
		//InterSuper.PORT = 9000; final이 붙으면 값 변경 불가
		InterFfd fd = new FfdSub();
	}
	
}
