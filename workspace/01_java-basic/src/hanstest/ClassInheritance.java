package hanstest;
//상속이 아니라 오버로딩,오버라이딩 연습
//Animal의 자식클래스 dog를 만들어 생성자를 오버로딩 하여라
class Animal{
	int age;
	String name;
	
}
class Dog extends Animal{
	String species = "dog";
	Dog(){
		this(8,"qt");
	}
	Dog(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("age:%d,name:%s\n",age,name);
	}
}
public class ClassInheritance {
	public static void main(String[] args) {
	Dog dog = new Dog();	
		System.out.println(dog);
	}

}
