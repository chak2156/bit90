package hanstest.boardTest;

public class BoardDAO {
	int pos=0;
	int no=0;
	BoardVO[] DataArr = new BoardVO[3];
	
	public void CheckAllPosts_DAO(){
		
	}
	public void CheckOnePosts_DAO(int num){
	
	}
	public int noCheck(int num){
		for (int i=0 ; i<pos ; i++){
			if (num == DataArr[i].getNo()){
			return DataArr[i].getNo();}
		}
		return -1;
	}
	public void InsPost_DAO(BoardVO bvo){
		if(DataArr.length==pos){
			BoardVO[] temp = new BoardVO[pos*2];
			System.arraycopy(DataArr, 0, temp, 0, pos);
			DataArr=temp;		
		}
		bvo.setNo(++no);
		DataArr[pos]=bvo;
		pos++;
	}
	public void AltPost_DAO(BoardVO bvo,int num){
		bvo.setNo(++no);
		DataArr[num-1] = bvo;

	}
	public void DelPost_DAO(int num){
		System.arraycopy(DataArr, num, DataArr, num-1,pos-(num));
		
		pos--;
	}

}
