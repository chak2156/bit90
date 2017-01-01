package kr.co.mlec.board.test;

import kr.co.mlec.board.vo.BoardVO;
import java.util.Scanner;

public class BoardTestPr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardVO[] board = new BoardVO[5];
		int pos = 0;
		int no = 0;
		outer: while (true) {
			System.out.println("-----------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("-----------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("전체 게시물 조회 메뉴 선택함");
				System.out.printf("전체 %d개 \n", pos);
				System.out.println("-----------------");
				if (pos != 0) {
					for (int n = pos-1; n >= 0; n--) {
						System.out.printf("번호 %d 글쓴이 %s 제목 %s \n", board[n].no, board[n].writer, board[n].title);
					}

				} else if (pos == 0) {
					System.out.println("입력된 게시물이 없습니다.");
					System.out.println("-----------------");
				}
				break;
			case 2:
				int findNo = 0;
				System.out.print("조회할 글번호를 입력하세요 : ");
				findNo = Integer.parseInt(sc.nextLine());
				boolean search = false;
				System.out.println("-----------------");
				for (int n = 0; n < pos; n++) {
					if(board[n].no != findNo)continue;
					
					search = true;
					System.out.printf("번호 : %d 글쓴이 : %s 제목 : %s  내용 : %s \n", board[n].no, board[n].writer, board[n].title ,board[n].content);
					
				}
					if(search==false){

				System.out.println("입력된 게시물이 없습니다.");
				System.out.println("-----------------");
				
				}

				System.out.println("글번호 조회 메뉴 선택함");
				break;
			case 3:
				board[pos] = new BoardVO();
				board[pos].no = ++no;
				System.out.print("제목을 입력하세요 : ");
				board[pos].title = sc.nextLine();
				System.out.print("글쓴이를 입력하세요 : ");
				board[pos].writer = sc.nextLine();
				System.out.print("내용을 입력하세요 : ");
				board[pos].content = sc.nextLine();
				pos++;
				break;
			case 4:
				int alt = 0;
				System.out.print("수정할 글번호를 입력하세요 : ");
				alt = Integer.parseInt(sc.nextLine());
				 search = false;
				System.out.println("-----------------");
				for (int n = 0; n < pos; n++) {
					if(board[n].no != alt)continue;
					
					search = true;
					System.out.print("제목을 입력하세요 : ");
					board[n].title = sc.nextLine();
					System.out.print("글쓴이를 입력하세요 : ");
					board[n].writer = sc.nextLine();
					System.out.print("내용을 입력하세요 : ");
					board[n].content = sc.nextLine();
					break;
				}
				if(search==false){

				System.out.println("입력된 게시물이 없습니다.");
				System.out.println("-----------------");
				}

				System.out.println("글번호 조회 메뉴 선택함");
				break;
			case 5:
				int delNo=0;
				System.out.print("삭제할 글번호를 입력하세요 : ");
				delNo=Integer.parseInt(sc.nextLine());
				 search = false;
				System.out.println("-----------------");
				for (int n = 0; n < pos; n++) {
					int length=pos-(n+1);
					System.out.println(board[n].no);
					if(board[n].no != delNo)continue;
					
					search = true;
					System.arraycopy(board, n+1, board, n, length);
					board[--pos] = null;
					break; 
				}
				if(search==false){

				System.out.println("입력된 게시물이 없습니다.");
				System.out.println("-----------------");
				}
				System.out.println("글삭제 메뉴 선택함");
				break;
			case 0:
				System.out.println("게시판 프로그램을 종료합니다.");
				break outer;
			}
		}
	}
}
