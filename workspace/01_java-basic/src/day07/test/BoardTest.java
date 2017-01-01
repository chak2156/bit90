package day07.test;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BoardVO[] board = new BoardVO[3];

		int no = 0;
		int pos = 0;
		int sel = 0;

		outer: while (true) {
			System.out.println("---------------");
			System.out.println("1.전체 조회");
			System.out.println("2.번호로 조회");
			System.out.println("3.글 등록");
			System.out.println("4.글 수정");
			System.out.println("5.글 삭제");
			System.out.println("0.종료");
			System.out.println("---------------");
			System.out.print("수행할 작업 번호 입력: ");
			sel = Integer.parseInt(sc.nextLine());

			switch (sel) {
			case 1:

				System.out.println("---------------");
				System.out.println("전체 조회");
				System.out.println("---------------");
				System.out.println("전체 글 수 : "+pos);
				if(pos==0){
				System.out.println("등록된 글이 없습니다");}
				for (int a = pos - 1; a >= 0; a--)
					System.out.printf("번호 : %d 글쓴이: %s 제목: %s \n", board[a].no, board[a].writher,board[a].title);
				System.out.println("---------------");
				break;
			case 2:
				int findNum = 0;
				boolean checkNum = false;

				System.out.println("---------------");
				System.out.println("번호로 조회");
				System.out.println("---------------");
				System.out.print("찾을 번호 입력: ");
				findNum = Integer.parseInt(sc.nextLine());
				
				for (int i = 0; i < pos; i++) {
					if (board[i].no != findNum)
						continue;
					checkNum = true;
					System.out.printf("번호 : %d 글쓴이: %s 제목: %s \n", board[i].no, board[i].writher,board[i].title);
					System.out.println("내용: " + board[i].contents);

				}
				if (checkNum == false)
					System.out.println("해당 번호가 없습니다.");
				System.out.println("---------------");
				break;
			case 3:
				if (board.length == pos) {
					BoardVO[] temp = new BoardVO[board.length * 2];
					System.arraycopy(board, 0, temp, 0, pos);
					board = temp;
				}

				no++;
				board[pos] = new BoardVO();
				board[pos].no = no;
				System.out.println("---------------");
				System.out.println("글 등록");
				System.out.println("---------------");
				System.out.print("제목: ");
				board[pos].title = sc.nextLine();
				System.out.print("글쓴이: ");
				board[pos].writher = sc.nextLine();
				System.out.print("내용: ");
				board[pos].contents = sc.nextLine();
				System.out.println("---------------");
				pos++;
				break;
			case 4:
				 findNum = 0;
				 checkNum = false;
				System.out.println("---------------");
				System.out.println("글 수정");
				System.out.println("---------------");
				System.out.print("찾을 번호 입력: ");
				findNum = Integer.parseInt(sc.nextLine());
				
				for (int i = 0; i < pos; i++) {
					if (board[i].no != findNum)
						continue;
					checkNum = true;
					System.out.print("제목: ");
					board[i].title = sc.nextLine();
					System.out.print("글쓴이: ");
					board[i].writher = sc.nextLine();
					System.out.print("내용: ");
					board[i].contents = sc.nextLine();

				}
				if (checkNum == false)
					System.out.println("해당 번호가 없습니다.");
				System.out.println("---------------");
				break;
			case 5:
				 findNum = 0;
				 checkNum = false;
				 
				System.out.println("---------------");
				System.out.println("글 삭제");
				System.out.println("---------------");
				System.out.print("찾을 번호 입력: ");
				findNum = Integer.parseInt(sc.nextLine());
				
				for (int i = 0; i < pos; i++) {
					if (board[i].no != findNum)
						continue;
					checkNum = true;
					int length=board.length-(pos+i);
					System.arraycopy(board, i+1, board, i, length);
					board[pos--]=null;




				}
				if (checkNum == false)
					System.out.println("해당 번호가 없습니다.");
				System.out.println("---------------");
				break;
			case 0:
				System.out.println("---------------");
				System.out.println("종료");
				System.out.println("---------------");
				break outer;
			}
		}

	}
}
