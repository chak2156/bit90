package kr.co.mlec.board.test;

public class BoardVO2 {
	int no = 0;
	int findNum = 0;
	int pos = 0;
	BoardVO2[] board = new BoardVO2[3];
	boolean checkNum = false;
	String writher = "";
	String title = "";
	String contents = "";

	void lookAll() {
		System.out.println("---------------");
		System.out.println("전체 조회");
		System.out.println("---------------");
		System.out.println("전체 글 수 : " + pos);
		if (pos == 0) {
			System.out.println("등록된 글이 없습니다");
		}
		for (int a = pos - 1; a >= 0; a--)
			System.out.printf("번호 : %d 글쓴이: %s 제목: %s \n", board[a].no, board[a].writher, board[a].title);
		System.out.println("---------------");
	}
	void lookNum(int findNum){
		boolean checkNum = false;
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
	}
	void add(int no,String title,String writher,String contents){
		
		if (board.length == pos) {
			BoardVO2[] temp = new BoardVO2[board.length * 2];
			System.arraycopy(board, 0, temp, 0, pos);
			board = temp;
		}

		no++;
		board[pos] = new BoardVO2();
		board[pos].no = no;
		System.out.println("---------------");
		System.out.println("글 등록");
		System.out.println("---------------");
		System.out.print("제목: ");
		board[pos].title = title;
		System.out.print("글쓴이: ");
		board[pos].writher = writher;
		System.out.print("내용: ");
		board[pos].contents = contents;
		System.out.println("---------------");
		pos++;
	}
	void alt(int findNum,String title,String writher,String contents){
		 checkNum = false;

			
			for (int i = 0; i < pos; i++) {
				if (board[i].no != findNum)
					continue;
				checkNum = true;
				System.out.print("제목: ");
				board[i].title = title;
				System.out.print("글쓴이: ");
				board[i].writher = writher;
				System.out.print("내용: ");
				board[i].contents = contents;

			}
	}
	void del(int findNum){
		
	}

}
