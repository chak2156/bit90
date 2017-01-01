package kr.co.mlec.board.test;
import kr.co.mlec.board.vo.BoardVO;
import java.util.Scanner;

public class MyBoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//게시물 번호
		int no = 0;
		//게시물이 배열에 들어갈 인덱스 위치와 실제 들어간 데이터의 크기
		int pos = 0;
		
		BoardVO[] list = new BoardVO[3];
		
		//번호 저장
		
		//게시물 관련 변수 postNumber writer postTitle
		
		
		int numOfTotalPost=1;
		int[]postNumArr =new int[numOfTotalPost];
		String[] writerArr =new String[numOfTotalPost];
		String[] postTitleArr =new String[numOfTotalPost];
		int postNumber = 0;
		String writer = "";
		String postTitle = "";
		//루프 시작
		int menuSelect = 0;
		boolean exitFlag = true;
		while (exitFlag == true) {
			System.out.println("------------------------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");//배열로
			System.out.println("3. 글등록");//링크드리스트 이용.검색 힘듬
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요: ");
			menuSelect = sc.nextInt();
			sc.nextLine();//nextInt에 개행문자가 남아있으므로 지우기 위해 넣은 코드

			switch (menuSelect) {
			case 1://전체 게시물 조회
				
				System.out.printf("전체 %d 개\n",numOfTotalPost-1);
				
				System.out.println("------------------------------------\n");
				System.out.println("번호	글쓴이	제목\n");				
				System.out.println("------------------------------------\n");
				if(numOfTotalPost==1){
				System.out.println("게시물이 존재하지 않습니다");	}
				else{
					//for문 돌려서 포스트 갯수만큼 루프. 널값은 표시 안함
					
				System.out.printf("%d	%s	%s\n\n",postNumber,writer,postTitle);}
				System.out.println("------------------------------------\n");
				
				
				
				break;
			case 2://글번호 조회
				int checkPostNumber=0;
				System.out.print("조회할 글번호를 입력하세요 :");
				checkPostNumber=Integer.parseInt(sc.nextLine());
				System.out.println("------------------------------------\n");
				if (postNumArr[checkPostNumber-1]!=checkPostNumber){
					System.out.println("입력된 번호는 존재하지 않습니다"+postNumArr[checkPostNumber-1]);
					}
				else if (postNumArr[checkPostNumber-1]==checkPostNumber){
					System.out.printf("번호: %d\n\n",postNumArr[checkPostNumber-1]);
					System.out.printf("글쓴이: %s\n\n",writerArr[checkPostNumber-1]);
					System.out.printf("제목: %s\n\n",postTitleArr[checkPostNumber-1]);
					}

				System.out.println("------------------------------------\n");
				break;
			case 3://글등록
				//실제 입력된 데이터의 크기와 배열의 크기가 동일하다면
				//배열의 크기를 기존의 2배로 확장한다
				if(pos==list.length){
					BoardVO[] temp = new BoardVO[list.length*2];
					
					//어레이카피 써서 옮기기
				
					temp = list;
				}
				
				
				
				list[pos] = new BoardVO();//재진입하면 연결이 없어 데이터가 사라지므로 배열을 써서 보드 주소를 저장
				list[pos].no = ++no;
				numOfTotalPost++;
				postNumArr[postNumArr.length-1]=postNumArr.length;
				System.out.print("제목을 입력하세요 : ");
				list[pos].title=sc.nextLine();
				postTitleArr[postTitleArr.length-1]=sc.nextLine();
				System.out.print("글쓴이를 입력하세요 : ");
				list[pos].writer=sc.nextLine();
				writerArr[writerArr.length-1]=sc.nextLine();
				System.out.print("내용을 입력하세요 : ");
				list[pos].content=sc.nextLine();
				pos++;
				System.out.println("게시글 등록이 완료되었습니다."+postNumArr[postNumArr.length-1]+" "+postNumArr.length);
				break;
			case 4://글수정
				System.out.print("수정할 글번호를 입력하세요 : ");
				sc.nextLine();
				//글번호 받은 주소의 내용 재입력
				System.out.print("변경할 제목을 입력하세요 : ");
				sc.nextLine();
				System.out.println("글수정 메뉴 선택함");
				break;
			case 5://글삭제
				
				//해당되는 번호 내용 널값으로 변경.
				System.out.print("삭제할 글번호를 입력하세요 : ");
				sc.nextLine();
				System.out.println("글삭제 메뉴 선택함");
				break;
			case 0: {//종료
				System.out.println("게시판 프로그램을 종료합니다.");
				exitFlag = false;
				break;
			}
			default:
				System.out.printf("잘못된 번호입력 입니다.");

			}

		}
		sc.close();
	}

}
