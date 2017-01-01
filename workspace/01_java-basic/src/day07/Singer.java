package day07;

/*
 * 멤버변수는 무조건 private로 선언해야 편함. 필요할때나 가끔 품
 * 멤버변수에 대한 값을 설정,추출하는
 * 메서드를 만들어서 활용
 */
public class Singer {
	// private 현재 자신의 클래스에서만 변경가능

	private String name;
	private int age;

	// 멤버변수에 대한 설정(setter)와 추출(getter)를 선언
	// setter선언
	// 접근제한자 반환타입 메소드명 매개변수
	// public void set변수명 변수에 들어갈 값의 타입
	
	
	//static =클래스 메소드라 this 사용불가
	public void setName(/*자기 클래스 타입의 this가 히든변수로 숨어있음*/String _name) {
		name = _name;
		this.name = name;//자기 요소중 하나에 접근가능

	}

	public void setAge(int _age) {
		age = _age;
	}

	// setter선언
	// 접근제한자 반환타입 메소드명 매개변수
	// public 변수의 타입 get변수명 없음
	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

}
