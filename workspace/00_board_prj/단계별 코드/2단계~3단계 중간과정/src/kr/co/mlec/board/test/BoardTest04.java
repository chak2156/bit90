package kr.co.mlec.board.test;

import java.util.Scanner;

import kr.co.mlec.board.vo.BoardVO;

public class BoardTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardVO[] board = new BoardVO[3];

		int pos = 0;
		int no = 0;
		int sel = 0;

		while (true) {

			System.out.println("------------------------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			switch (sel) {
			case 1:
				System.out.println("------------------------------------");
				System.out.println("1. 전체 게시물 조회");
				System.out.println("------------------------------------");
				
				System.out.println("------------------------------------");
				break;
			case 2:
				int findN=0;
				boolean checkN=false;
				
				System.out.println("------------------------------------");
				System.out.println("2. 글번호 조회");
				System.out.println("------------------------------------");
				findN=Integer.parseInt(sc.nextLine());
				for(int i = pos-1;i>0;i--){
				if(findN!=board[i].no)continue;
				
				}
				System.out.println("------------------------------------");
				break;
			case 3:
				no++;
				board[pos]= new BoardVO();
				board[pos].no=no;
				if(board.length==pos){
					BoardVO temp = new BoardVO();
					
				}
				System.out.println("------------------------------------");
				System.out.println("3. 글등록");
				System.out.println("------------------------------------");
				board[pos].title = sc.nextLine();
				pos++;
				System.out.println("------------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------");
				System.out.println("4. 글수정");
				System.out.println("------------------------------------");
				
				System.out.println("------------------------------------");
				break;
			case 5:
				System.out.println("------------------------------------");
				System.out.println("5. 글삭제");
				System.out.println("------------------------------------");
				
				System.out.println("------------------------------------");
				break;
			case 0:
				System.out.println("------------------------------------");
				System.out.println("0. 종료");
				System.out.println("------------------------------------");
			}
		}

	}

}
