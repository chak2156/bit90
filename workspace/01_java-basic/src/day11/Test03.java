package day11;
import java.util.ArrayList;
import java.util.Random;
class Dog{
	String name;
	int age;
	
	Dog(){
		this("이름없음",-1);
	}
	Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){//값이 어떻게 들어가 있는지 확인할 때 자주 쓴다
		return String.format("Dog[name=%s, age=%d]",name, age);
	}
}


public class Test03 {
public static void main(String[] args) {
	Dog d = new Dog();
	Dog d2 = new Dog("dhdn",3);
	System.out.println(d.toString()); //Object.toString();
	//toString() 메서드는 객체 자체를 어떤 식에 대입할 때 자동 호출됨
	//대표 케이스
	System.out.println(d);//d.toString() 와 같다.
	
	int[] arr = {1,2,3};
	System.out.println(arr);//클래스 패키지 @ 16진수 해시코드 
	// getClass().getName()+'@'+Integer.toHexString(hashCode())
	//이런 골벵이 붙은 코드는 투스트링이 준다고 보면 됨
	//대괄호 숫자에 따라 배열의 차원수, I는 int의 약자
	
	 Random r = new Random();
	 System.out.println(r);
	 ArrayList list = new ArrayList<>();
	 System.out.println(list.toString());
	 System.out.println(list);
	 
	 String str ="fff";
	 System.out.println(str.toString());
	 System.out.println(str);
	
}
}
