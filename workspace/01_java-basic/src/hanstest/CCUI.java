package hanstest;

import java.util.Scanner;
public class CCUI {

	private CCDAO dao = new CCDAO();
	int no1,no2;
	Scanner sc= new Scanner(System.in);

	public void uiOut(){
		
		
		while(true){
		switch(menu()){
		case 1:add();break;
		case 2:sub();break;
		case 3:checkVal();break;
		case 4:storeVal();break;
		case 5:alterVal();break;
		case 6:delVal();break;
		case 0:exit();break;

		}
		
		}
	}
	private int menu(){
		System.out.println("--------");
		System.out.println("계산기");
		System.out.println("--------");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.값 조회");
		System.out.println("4.값 저장");
		System.out.println("5.값 변경");
		System.out.println("6.값 삭제");
		System.out.println("0.종료");
		System.out.println("--------");
		
		return Integer.parseInt(sc.nextLine());
		
	}
	private void add(){
		CCVO ccvo = new CCVO();
		System.out.println("연산자 입력");
		no1=Integer.parseInt(sc.nextLine());
		System.out.println("피연산자 입력");
		no2=Integer.parseInt(sc.nextLine());
		dao.sum(ccvo,no1,no2);
		System.out.println("값"+ccvo.getResult());
	}
	private void sub(){
		CCVO ccvo =new CCVO();
		System.out.println("연산자 입력");
		no1=Integer.parseInt(sc.nextLine());
		System.out.println("피연산자 입력");
		no2=Integer.parseInt(sc.nextLine());
		dao.sub(ccvo,no1,no2);
		System.out.println("값"+ccvo.getResult());
	}
	private void checkVal(){
		System.out.println("조회할 값 번호 입력");
		//CCDAO에 있는
		CCVO ccvo = dao.checkVal(Integer.parseInt(sc.nextLine()));
		
		if(null!=ccvo){
		System.out.println("번호: "+ccvo.getNo());
		System.out.println("값 이름: "+ccvo.getValName());
		System.out.println("세이브된 값: "+ccvo.getSaveNo());
		}
		
		else
		System.out.println("정확한 값을 입력하세요");
		
		
	}
	private void storeVal(){
		CCVO ccvo =new CCVO();
		
		System.out.println("저장할 값 입력");
		ccvo.setSaveNo(Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("저장할 값 이름 입력");
		ccvo.setValName(sc.nextLine());
		dao.storeVal(ccvo);
		
		

	
	}
	private void alterVal(){
		CCVO ccvo = new CCVO();
		System.out.println("변경할 번호 입력");
		int no= Integer.parseInt(sc.nextLine());
		System.out.println("변경할 값 입력");
		ccvo.setSaveNo(Integer.parseInt(sc.nextLine()));
		System.out.println("변경할 값 이름 입력");
		ccvo.setValName(sc.nextLine());
		
		if(dao.alterVal(no,ccvo)==null)
		{System.out.println("정확한 값을 입력하세요");}
		
		
	}
	private void delVal(){
		
	}
	private void exit(){
		System.out.println("ㅂㅂ");
		System.exit(0);
	}

}
