package day11;
class Parent /*상속을 받지 않은 경우 extends java.lang.object 가 숨겨져있음*/{
	
	
	Parent(String name){//이런 매개변수가 있는 생성자가 있는 경우 매개변수 없는 기본생성자를 명시적으로 생성해주면 발생될 오류 방지에 도움이 된다
		
	}
}

class Child2 extends Parent{
	Child2(){
		super("");
	}
}


class Child extends Parent{
	
	Child(){
		super("df");
		//super();//안쓰면 자동 추가
		System.out.println("C-1");
		
	}

	Child(String name){
		super(name);
		
		System.out.println("C-2");
		
	}
}
public class test02 {

}
