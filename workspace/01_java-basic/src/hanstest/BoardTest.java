package hanstest;


import java.util.Scanner;

public class BoardTest {
	public static void main(String[] args) {
		
		// 게시물 번호
		int no = 0;
		// 게시물이 배열에 들어갈 인덱스 위치와 실제 들어간 데이터의 크기
		int pos = 0;
		 
		BoardVO[] list = new BoardVO[3];
		
		Scanner sc = new Scanner(System.in);
		outer : 
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
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.printf("전체 %d개\n", pos);
				System.out.println("------------------------------------");
				System.out.println("번호\t제목\t글쓴이");
				System.out.println("------------------------------------");
				for (int i = pos - 1; i >= 0; i--) {
					System.out.printf(
							"%d\t%s\t%s\n", list[i].getNo(), list[i].getTitle(), list[i].getWriter());
				}
				if (pos == 0) {
					System.out.println("입력된 게시물이 없습니다.");
				}
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.print("조회할 글번호를 입력하세요 : ");
				int findNo = Integer.parseInt(sc.nextLine());
				System.out.println("------------------------------------");
				boolean search = false;
				for (int i = 0; i < pos; i++) {
					if (list[i].getNo() != findNo) continue;
					
					search = true;
					System.out.println("번호 : " + findNo);
					System.out.println("제목 : " + list[i].getTitle());
					System.out.println("글쓴이 : " + list[i].getWriter());
					System.out.println("내용 : " + list[i].getContent());
					break;
				}
				if (search == false) {
					System.out.println("글번호에 해당하는 게시물이 없습니다.");
				}
				System.out.println("------------------------------------");
				System.out.println();
				break;
			case 3:
				// 실제 입력된 데이터의 크기와 배열의 크기가 동일하다면
				// 배열의 크기를 기존 2배로 확장한다.
				if (pos == list.length) {
					BoardVO[] temp = new BoardVO[pos * 2];
					// 기존 입력된 내용을 새롭게 생성된 배열로 복사
					System.arraycopy(list, 0, temp, 0, pos);
					list = temp;
				}
				
				list[pos] = new BoardVO();
				// 게시물 번호 입력
				list[pos].setNo() = ++no;
				System.out.print("제목을 입력하세요 : ");
				list[pos].setTitle() = sc.nextLine();
				System.out.print("글쓴이를 입력하세요 : ");
				list[pos].setWriter() = sc.nextLine();
				System.out.print("내용을 입력하세요 : ");
				list[pos].setContent() = sc.nextLine();
				pos++;
				System.out.println("게시물 등록이 완료되었습니다.");
				break;
			case 4:
				System.out.print("수정할 글번호를 입력하세요 : ");
				int modNo = Integer.parseInt(sc.nextLine());
				System.out.print("변경할 제목을 입력하세요 : ");
				String title = sc.nextLine();
				
				boolean modFlag = false;
				for (int i = 0; i < pos; i++) {
					if (list[i].getNo() != modNo) continue;
					
					modFlag = true;
					list[i].getTitle() = getTitle();
					break;
				}
				if (modFlag == false) {
					System.out.println("글번호에 해당하는 게시물이 없습니다.");
				}
				
				System.out.println("게시물 수정이 완료되었습니다.");
				break;
			case 5:
				System.out.print("삭제할 글번호를 입력하세요 : ");
				int delNo = Integer.parseInt(sc.nextLine());
				int delIndex = -1;
				for (int i = 0; i < pos; i++) {
					if (list[i].getNo() == delNo) {
						delIndex = i;
						break;
					}
				}
				if (delIndex == -1) {
					System.out.println("글번호에 해당하는 게시물이 없습니다.");
					break;
				}
				int length = pos - (delIndex + 1);
				if (length > 0) {
	 				// 삭제하려는 인덱스 다음 위치의 게시물들을 한칸씩 앞으로 이동시킨다.
					System.arraycopy(list, delIndex + 1, list, delIndex, length);
				}
				
				// 제일 마지막 위치값을 null 처리함
				list[--pos] = null;
				
				System.out.println("게시물 삭제가 완료되었습니다.");
				break;
			case 0:
				System.out.println("게시판 프로그램을 종료합니다");
				break outer;
			}
		}
	}
}
/*
------------------------------------
메뉴 중 처리할 항목을 선택하세요 : 0
게시판 프로그램을 종료합니다
*/