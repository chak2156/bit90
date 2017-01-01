package kr.co.mlec.board.ui;

import java.sql.Date;
import java.text.SimpleDateFormat;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class DetailUI extends BaseUI {
	private BoardDAO dao;
	public DetailUI(BoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute() {
		System.out.print("조회할 글번호를 입력하세요 : ");
		int no = Integer.parseInt(sc.nextLine());
		BoardVO boardVO = dao.selectOneBoard(no);
		
		System.out.println("------------------------------------");
		if (boardVO != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/hh:mm:ss");
			System.out.println("번호 : " + no);
			System.out.println("제목 : " + boardVO.getTitle());
			System.out.println("글쓴이 : " + boardVO.getWriter());
			System.out.println("내용 : " + boardVO.getContent());
			System.out.println("등록일시 : "+sdf.format(boardVO.getRegDate()));
			//+등록일시 년월일분초
		} else {
			System.out.println("글번호에 해당하는 게시물이 없습니다.");
		}
		System.out.println("------------------------------------");
		System.out.println();		
	}

}
