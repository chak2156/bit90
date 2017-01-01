package hanstest.boardTest;

import java.util.Scanner;

public class BoardUI {
	Scanner sc = new Scanner(System.in);
	BoardDAO dao = new BoardDAO();
	public void MenuSelect(){
		while(true){
			switch(menu()){
			case 1:CheckAllPosts_UI();break;
			case 2:CheckOnePosts_UI();break;
			case 3:InsPost_UI();break;
			case 4:AltPost_UI();break;
			case 5:DelPost_UI();break;
			case 0:ExitMenu();break;
			}
		} 
	}
	public int menu(){
		int val=0;
		System.out.println("------------");
		System.out.println("1. 전체 게시물 조회");
		System.out.println("2. 게시물 번호로 조회");
		System.out.println("3. 게시물 등록");
		System.out.println("4. 게시물 변경");
		System.out.println("5. 게시물 삭제");
		System.out.println("0. 종료");
		System.out.println("------------");
		System.out.println("원하는 작업의 번호를 입력하세요.");		
		val=Integer.parseInt(sc.nextLine());
		return val;
	}
	public void CheckAllPosts_UI(){

		System.out.println("------------");
		System.out.println("1. 전체 게시물 조회");
		System.out.println("------------");
		if(dao.pos == 0 ){
			System.out.println("등록된 게시물이 없습니다.");
		}
		else{
		System.out.println("전체 게시물 수:"+dao.pos+"개");
			for(int i=dao.pos-1;i>=0;i--){
			System.out.printf("번호:%d 글쓴이:%s 제목:%s \n",dao.DataArr[i].getNo(),dao.DataArr[i].getWriter(),dao.DataArr[i].getTitle());
			}
		}
		System.out.println("------------");
		
	}
	public void CheckOnePosts_UI(){
		
		System.out.println("------------");
		System.out.println("2. 게시물 번호로 조회");		
		System.out.println("------------");
		System.out.println("조회할 게시물의 번호를 입력하세요.");
		int checknum = -1;
		checknum=dao.noCheck(Integer.parseInt(sc.nextLine()));
		if (checknum == -1)
			System.out.println("올바른 번호를 입력해 주세요.");
		else{
			BoardVO bvo = new BoardVO();
		bvo=dao.DataArr[checknum];
		System.out.printf("번호:%d 글쓴이:%s 제목:%s 내용:%s \n",bvo.getNo(),bvo.getWriter(),bvo.getTitle(),bvo.getContents());
		}
		System.out.println("------------");
		
		
	}
	public void InsPost_UI(){
		BoardVO bvo = new BoardVO();
		System.out.println("------------");
		System.out.println("3. 게시물 등록");
		System.out.println("------------");
		System.out.println("제목 입력");
		bvo.setTitle(sc.nextLine());
		System.out.println("글쓴이 입력");
		bvo.setWriter(sc.nextLine());
		System.out.println("내용 입력");
		bvo.setContents(sc.nextLine());	
		dao.InsPost_DAO(bvo);
		System.out.println("게시물 등록 완료.");
		System.out.println("------------");
		
		
	}
	public void AltPost_UI(){
		BoardVO bvo = new BoardVO();
		System.out.println("------------");
		System.out.println("4. 게시물 변경");
		System.out.println("------------");
		System.out.println("변경할 게시물 번호를 입력하세요.");
		int checknum = -1;
		checknum=dao.noCheck(Integer.parseInt(sc.nextLine()));
		if (checknum == -1)
			System.out.println("올바른 번호를 입력해 주세요.");
		else{
		System.out.println("제목 입력");
		bvo.setTitle(sc.nextLine());
		System.out.println("글쓴이 입력");
		bvo.setWriter(sc.nextLine());
		System.out.println("내용 입력");
		bvo.setContents(sc.nextLine());
		dao.AltPost_DAO(bvo, checknum);
		System.out.println(checknum+"번째 게시물을 변경하였습니다.");
		}
		System.out.println("------------");
		
	}
	public void DelPost_UI(){
		System.out.println("------------");
		System.out.println("5. 게시물 삭제");
		System.out.println("삭제할 게시물 번호를 입력하세요.");
		int checknum = -1;
		checknum=dao.noCheck(Integer.parseInt(sc.nextLine()));
		if (checknum == -1)
			System.out.println("올바른 번호를 입력해 주세요.");
		else{
		dao.DelPost_DAO(checknum);
		}
		System.out.println("------------");
		System.out.println("삭제 완료");
		System.out.println("------------");
		
	}
	public void ExitMenu(){
		System.out.println("------------");
		System.out.println("종료합니다.");
		System.out.println("------------");
		System.exit(0);
	}

}
