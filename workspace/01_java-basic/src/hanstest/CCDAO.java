package hanstest;



public class CCDAO {
	int pos=0;
	int no=0;
	CCVO[] voArr = new CCVO[3];
	
	
	public void sum(CCVO ccvo,int num0,int num1)
	{
		
		ccvo.setResult(num0+num1);
		
	}
	public void sub(CCVO ccvo,int num0,int num1)
	{

		ccvo.setResult(num0-num1);
		
	}
	public CCVO checkVal(int no){
		for(int i=0;i<pos;i++){
			System.out.println(this.voArr[i].getNo()+" ");

			if (this.voArr[i].getNo() == no) return this.voArr[i];

		}
		System.out.println("checkVal Activiatied2");
		return null;
			
	}
	public void storeVal(CCVO ccvo){
		
		if(this.voArr.length == pos){
			CCVO[] temp =new CCVO[pos*2];
			System.arraycopy(this.voArr, 0, temp, 0,pos);
			this.voArr = temp;
		}
		
		ccvo.setNo(++no);
		this.voArr[pos++]=ccvo;
		

		
	}
	public CCVO alterVal(int no,CCVO ccvo){
		
		for(int i=0;i<pos;i++){
		if(this.voArr[i].getNo()==no){
			ccvo.setNo(no);
			this.voArr[i]=ccvo;
			return this.voArr[i];
		}
		}
		return null;
	}

	public void delVal(){
		
	}


}
