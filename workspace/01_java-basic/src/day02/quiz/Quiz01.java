package day02.quiz;

public class Quiz01 {
public static void main(String[] args) {
	//i변수에 값을 할당하는 것은 try블럭에서 해야 한다. 오류가 나지 않아야 한다
	int i=0;
	
	try
	{
		i= 100;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println(i);
	}
}
}
