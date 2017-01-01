package day03;
//조건문
public class Test04 {
public static void main(String[]args){
	
	
	//if문
	
	/*
	int a=10;
	
	if (a>5){//if문에 블럭 안치면 줄단위로만 실행함
		System.out.println("a>5");
		System.out.println("a:"+a);
	}

	//a가 짝수일 경우 짝수입니다 를 화면에 출력
	
	if(a%2==0){
		System.out.println("짝수입니다");
	}
	*/
	/*
	//a가 짝수일 경우 짝수,홀수면 홀수 출력
	int a=10;
	if(a%2==0){
		System.out.println("짝수");
	}else{System.out.println("홀수");}//상황이 두가지라면..아까 and의 경우처럼.. 인 경우 사용
	*/
	int a = 10;
	//a는 5보다 크다,a는5이다,a는 5보다 작다
	if (a>5){
		System.out.println("a는5보다 크다");
		}
	else if (a==5){
		System.out.println("a는 5이다");
		}
	else{
		System.out.println("a는5보다 작다");
		}
	
}
}
