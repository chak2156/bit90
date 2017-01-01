package day04.exam;

public class LoofTest08 {
	public static void main(String[] args) {
		boolean b=true;
System.out.println("1");
		for(int s=1;s<=100;s++){
		for(int i=2;i<s;i++){
			b=(s%i==0)?true:false;
			if(b==true){break;}
		
		}if(b==false)System.out.println(s);
		}
		

		
	}

}
