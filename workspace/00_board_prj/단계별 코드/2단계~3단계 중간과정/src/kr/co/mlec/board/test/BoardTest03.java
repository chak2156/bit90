package kr.co.mlec.board.test;

import java.util.Scanner;

public class BoardTest03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BoardVOPr2[] board = new BoardVOPr2[3];
		int pos = 0;
		int no = 0;
		int sel = 0;

		outer: while (true) {
			System.out.println("-----------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("-----------------");
			System.out.println("작업 입력");
			sel = Integer.parseInt(sc.nextLine());

			switch (sel) {
			case 1:
				System.out.println("-----------------");
				System.out.println("1. 전체 게시물 조회");
				System.out.println("-----------------");
				System.out.printf("전체 게시글 수 : %d 개\n",pos);
				
				for(int i=pos-1;i>=0;i--){
					System.out.printf("글번호: %d 글제목: %s 글쓴이: %s \n",board[i].no,board[i].title,board[i].writher);
				}
				System.out.println("-----------------");
				break;
			case 2:
				int findNum=0;
				boolean checkNum=false;
				System.out.println("-----------------");
				System.out.println("2. 글번호 조회");
				System.out.println("-----------------");
				System.out.print(" 글번호 입력 : ");
				findNum=Integer.parseInt(sc.nextLine());
				for(int j=0;j<pos;j++){
				if(findNum!=board[j].no)continue;
				checkNum=true;
				System.out.printf("글번호: %d 글제목: %s 글쓴이: %s 글내용:  \n",board[j].no,board[j].title,board[j].writher,board[j].contents);
				if(checkNum==false);
					System.out.print(" 번호 조회 실패 ");
				
				}
				System.out.println("-----------------");
				break;
			case 3:
				if (board.length == pos) {
					BoardVOPr2[] temp = new BoardVOPr2[board.length * 2];
					System.arraycopy(board, 0, temp, 0, pos);
					board = temp;

				}

				System.out.println("-----------------");
				System.out.println("3. 글등록");
				System.out.println("-----------------");

				no++;
				board[pos].no = no;
				board[pos] = new BoardVOPr2();
				System.out.print("제목 입력: ");
				board[pos].title = sc.nextLine();
				System.out.print("이름 입력: ");
				board[pos].writher = sc.nextLine();
				System.out.print("내용 입력: ");
				board[pos].contents = sc.nextLine();
				pos++;

				System.out.println("-----------------");
				break;
			case 4:
				int findAlt=0;
				boolean checkAlt=false;
				System.out.println("-----------------");
				System.out.println("4. 글수정");
				System.out.println("-----------------");
				System.out.print("수정할 번호 입력");
				findAlt=Integer.parseInt(sc.nextLine());
				for(int k=0;k<pos;k++){
					if(findAlt != board[k].no)continue;
					checkAlt=true;
					System.out.print("제목 입력: ");
					board[k].title = sc.nextLine();
					System.out.print("이름 입력: ");
					board[k].writher = sc.nextLine();
					System.out.print("내용 입력: ");
					board[k].contents = sc.nextLine();
					if(checkAlt==false)
					System.out.println("올바른 번호가 아닙니다");
				}
				
				System.out.println("-----------------");
				break;
			case 5:
				int findDel=0;
				boolean checkDel=false;
				System.out.println("-----------------");
				System.out.println("5. 글삭제");
				System.out.println("-----------------");
				System.out.println("-----------------");
				System.out.print("삭제할 번호 입력");
				findDel=Integer.parseInt(sc.nextLine());
				for(int l=0;l<pos;l++)
				{
					if(findDel!=board[l].no)continue;
					checkDel=true;
					int length=board.length+(l+1);
					System.arraycopy(board, l+1, board, l, length);
					
						
				
				}
				System.out.println("올바른 번호가 아닙니다");
				break;
			case 0:
				System.out.println("-----------------");
				System.out.println("0. 종료");
				System.out.println("-----------------");
				break outer;
			}
		}

	}

}
