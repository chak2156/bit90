package day02;

public class ParseIntTest {
	public static void main(String[]args){//args:명령형 매개변수. 주는법은 맨 밑에
		int a0 = Integer.parseInt(args[0]);
		int a1 = Integer.parseInt(args[1]);
		System.out.println(args[0]+args[1]);
		System.out.println(a0+a1);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		// 두 수의 합 : 300
		System.out.println("두 수의 합: "+Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println("두 수의 합: "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println("두 수의 합: "+(a0+a1));
		//100+200=300
		System.out.println(a0+"+"+a1+"="+(a0+a1));
	}
}

























//Run 탭의 런 컨피규레이션 