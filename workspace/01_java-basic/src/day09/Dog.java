package day09;

public class Dog {
	
	private String name;
	private int age;
	public Dog(){
		
		this("unknown",0);
//		this.name="unknown";
//	this.age= 0;
		
	}
	
	public Dog(String name){
		this(name,1);//이 클래스에 있는 다른 생성자를 호출
	}
	
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	};
	

}


