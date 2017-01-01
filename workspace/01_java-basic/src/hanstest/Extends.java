package hanstest;
import java.util.Random;

abstract class Shape{
	abstract public void area();
}
class Rectangle extends Shape{
	Rectangle(int num1, int num2){}
	public void area(){}
}
class Square extends Shape{
	Square(int num1){}
	public void area(){}
}
class Triangle extends Shape{
	Triangle(int num1, int num2){}
	public void area(){}
}
class Circle extends Shape{
	Circle(int num1){}
	public void area(){}
}
public class Extends {
	public static void main(String[] args) {
		Random r = new Random();
		Shape s = null;
		int num=0;
		switch(r.nextInt(4)+1){
		case 1: s = new Square(r.nextInt(10)+1); s.area(); break;
		case 2: s = new Rectangle(r.nextInt(10)+1,r.nextInt(10)+1); s.area(); break; 
		case 3: s = new Triangle(r.nextInt(10)+1,r.nextInt(10)+1); s.area(); break;
		case 4: s = new Circle(r.nextInt(10)+1); s.area(); break;
		}
	}

}
