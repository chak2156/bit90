package day09.quiz;

class TestQuiz{
	public static TestQuiz instance = new TestQuiz(); 
	private TestQuiz(){
		
	}
	public void msg(){
		System.out.println("성공");
		
	}
	public static TestQuiz getInstance(){
		if (instance==null){
			instance = new TestQuiz();
		}return instance;
		
	}
		
		
	
}
/*
 * 위에 코드 변경 없이 Test01클래스에서 객체 변수를 얻을 수 있게 작성한다
 * 단,코드를 추가하되 생성자 추가는 금지
 */


public class Test01 {
	public static void main(String[] args) {
		TestQuiz tq = TestQuiz.getInstance();
		
		 tq.msg();
	}

}
