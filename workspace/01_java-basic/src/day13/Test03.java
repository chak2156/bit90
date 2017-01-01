package day13;

public class Test03 {
	public static void main(String[] args) {
		try{
		System.out.println(1);
		System.out.println(1/0);//예외발생하면 나머지 구문은 무시하고 catch로 감
		System.out.println(2);
		String s= null;
		System.out.println(s.length());//nullpointception
		System.out.println(3);
		}
		catch(ArithmeticException  | NullPointerException npe){
			System.out.println(npe.getMessage());		
		}
//		catch(NullPointerException npe){
//			System.out.println(npe.getMessage());
//			System.out.println("npe");
//		}
		catch(RuntimeException re){}
		catch(Exception ex){}//모든 예외처리를 하므로 밑에 캐치문이 나오면 구문오류 뜸
		System.out.println(4);
		
//		try{
//			try{}//이런 중첩 try catch도 가능하지만 밑의 코드도 오류와 연관될 가능성이 높아 추천되지 않음
//			catch(){}
//		}
//		catch(){}
		
	}
}
