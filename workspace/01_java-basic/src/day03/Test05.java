package day03;



public class Test05 {
	public static void main(String[]args){
		
		int a=10;
		final int A=10;
		switch(a){
		case 1:{
			System.out.println("case1:a+92"+(a+92));
			break;//이거 안쓰면 밑에거까지 쭉 실행함
		}
		case A:{
			System.out.println("CaseA:a=A");
			break;
		}
		default:{//else와 비슷한 기능
			System.out.println("ㅌㅌ");
			break;
			
		}
		}

		
		
	}
		
	

}
