package day12;

import java.text.Format;

abstract class AbsSuper{
	//추상메서드:구현되지 않은 메서드
	public abstract void ho();//추상메서드가 있으면 클래스는 무조건 추상이어야 한다
	
	public void call(){
		System.out.println("메서드 바디");
	}
	public String toString(){
		return "AbsSuper :";
	}
}
class AbsSub extends AbsSuper{//어떤 클래스가 추상 클래스를 상속받게 되면 추상클래스 안에 구현되지 않은 추상메소드를 오버라이딩 하거나 ~ 해야한다
	public void ho(){
		System.out.println("재정의된 메서드");
	};
	
	
}
public class Test01 {	
	public static void main(String[] args) {
		AbsSuper abssuper = new AbsSub();//객체생성을 직접 하지 못하므로 자식클래스로 상속받아서 사용하라
		abssuper.call();
		abssuper.ho();
		System.out.println(abssuper.toString());
		
		
	}
	
}
