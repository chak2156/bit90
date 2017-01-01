package day11;
class Food{
	
}
class Tonkatsu extends Food{}
class Pizza extends Food{}
public class Test05 {
public static void main(String[] args) {
//	Tonkatsu ton = new Food(); //묵시적 형변환의 대상이 아니기 때문에 컴파일시 오류 발생
//	Tonkatsu ton = (Tonkatsu)new Food();//실행시 오류
	//올바른 명시적 형변환은 묵시적인 형변환이 이루어진 객체를 대상으로 한다. 묵시적 형변환된 클래스를 원래대로 돌릴때 사용
	
	Food f = new Tonkatsu();//돈까쓰 형식의 푸드
	Tonkatsu ton = (Tonkatsu)f;//f가 돈까스 형식이다. 뭘로 오버라이딩 됬나 알기 위해 명시하는듯
//	Pizza p =(Pizza)f;//실행시 오류
	
	
}
}
