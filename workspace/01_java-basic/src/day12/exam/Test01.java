package day12.exam;

import java.util.Random;

abstract class Shape{
	public abstract void area();
	
}
class Rectangle extends Shape{
	protected int num1,num2;
	Rectangle(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void area(){
		System.out.println("직사각형:"+num1*num2);
	}
	
}
class Triangle extends Shape{
	private int num1,num2;
	Triangle(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void area(){
		System.out.println("삼각형:"+(num1*num2)/2);
	}
	
}
class Circle extends Shape{
	private int num1;
	Circle(int num1){
		this.num1=num1;
		
	}
	public void area(){
		System.out.println("원:"+(num1*num1)*Math.PI);
	}
	
}
class Square extends Rectangle{
	private int num1;
	Square(int num1){
		super(num1,num1);
		this.num1 = num1;
		
	}
	public void area(){
		System.out.println("정사각형:"+num1*num1);
	}
	
}
public class Test01 {
public static void main(String[] args) {
	Random r = new Random();
	Shape s= null;
	int shape=r.nextInt(4)+1;
		switch(shape){
		case 1: s = 
				new Square(r.nextInt(10)+1);
				s.area();
				break;
		case 2: s = new Rectangle(r.nextInt(10)+1,r.nextInt(10)+1);s.area();break;
		case 3: s = new Triangle(r.nextInt(10)+1,r.nextInt(10)+1);s.area();break;
		case 4: s = new Circle(r.nextInt(10)+1);s.area();break;
		}

	
}
}
