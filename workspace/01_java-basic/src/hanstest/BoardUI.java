package hanstest;

import java.util.Scanner;



public class BoardUI {
	Scanner sc = new Scanner(System.in);
			// 게시물 번호
			int no = 0;
			// 게시물이 배열에 들어갈 인덱스 위치와 실제 들어간 데이터의 크기
			int pos = 0;
			
			BoardDAO bDAO = new BoardDAO();
			
			void bui() {

			
			switch(menu()){
			case 1:bDAO.showBoardList();break;
			case 2:bDAO.showBoardByNo();break;
			case 3:bDAO.writeBoard();break;
			case 4:bDAO.modBoard();break;
			case 5:bDAO.delBoard();break;
			case 0:bDAO.exitBoard();break;
			}
			
			
			
			
			
			}
	int menu(){
			System.out.println("------------------------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			int menu = Integer.parseInt(sc.nextLine());
			return menu;
	}
	void showBoardList() {
		
		bDAO.showBoardList();
		System.out.printf("전체 %d개\n", pos);
		System.out.println("------------------------------------");
		System.out.println("번호\t제목\t글쓴이");
		System.out.println("------------------------------------");
		System.out.printf("%d\t%s\t%s\n");
	}

	void showBoardByNo() {
		bDAO.showBoardByNo();
		System.out.print("조회할 글번호를 입력하세요 : ");
		int findNo = Integer.parseInt(sc.nextLine());
		System.out.println("------------------------------------");
		System.out.println("번호 : " + findNo);
		System.out.println("제목 : " + list[i].getTitle());
		System.out.println("글쓴이 : " + list[i].getWriter());
		System.out.println("내용 : " + list[i].getContent());
		System.out.println("글번호에 해당하는 게시물이 없습니다.");
	
	System.out.println("------------------------------------");
	System.out.println();
	}

	void writeBoard() {
		bDAO.writeBoard();
		list[pos].setNo(++no);
		System.out.print("제목을 입력하세요 : ");
		list[pos].setTitle(sc.nextLine());
		System.out.print("글쓴이를 입력하세요 : ");
		list[pos].setWriter(sc.nextLine());
		System.out.print("내용을 입력하세요 : ");
		list[pos].setContent(sc.nextLine());
	}

	void modBoard() {
		bDAO.modBoard();
		System.out.print("수정할 글번호를 입력하세요 : ");
		int modNo = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.println("글번호에 해당하는 게시물이 없습니다.");
	
	
	System.out.println("게시물 수정이 완료되었습니다.");
	}

	void delBoard() {
		bDAO.delBoard();
		System.out.print("삭제할 글번호를 입력하세요 : ");
		int delNo = Integer.parseInt(sc.nextLine());
		System.out.println("글번호에 해당하는 게시물이 없습니다.");
		System.out.println("게시물 삭제가 완료되었습니다.");
		System.out.println("게시판 프로그램을 종료합니다");

	}

	void exitBoard() {
		System.out.println("게시판 프로그램을 종료합니다");
		bDAO.exitBoard();

	}
}
