package day11;

public class Student extends Person { //없는데 오류가 안나면 부모클래스에서 찾으면 됨
	String no;
	
	public Student(){
	
		// this(num)나 super() 형태의 호출이 없을 경우 super()코드가 자동으로 호출된다
		
	}
	public Student(String no, String name, int age){
		super(name,age);//this()와 비슷
		this.no = no;//this() 의 제약=생성자 안에서만 사용가능,생성자의 첫줄에서만 사용가능
		/*
		//부모에 선언된 변수에 접근해서 사용하게 된다.
		//주의사항.
		//접근제한자가 허용되는 범위 내에서만 사용이 가능하다. 접근제한자는 부모자식보다 강력하다
		this.name = name;
		this.age = age;
		*/
	}
	public String toString(){
		return String.format("no = %s, %s", no,super.toString());
	}
	
}
