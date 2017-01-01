package day09.quiz;

public class DogMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d2 = new Dog("쫑");
		Dog d3 = new Dog(3);
		Dog d4 = new Dog("메리", 2);
		d .info();
		d2.info();
		d3.info();
		d4.info();
	}

}

class Dog{
	private int age;
	private String name;
	public Dog(){
	 	this("이름모름",0);
	}
	public Dog(String name){
		this(name,0);
	}
	public Dog(int age){
		this("이름모름",age);
	}
	public Dog(String name,int age){
		this.name=name;
		this.age=age;
	}
	void info(){
		System.out.printf("강아지의 이름은 %s 이고 나이는 %d 입니다.\n",name,age);
	};
	
}