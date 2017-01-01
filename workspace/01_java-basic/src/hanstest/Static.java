package hanstest;

import java.util.Date;

public class Static {
static int num=1;
public static void ad(){

	num+=num;
}
	public static void main(String[] args) {
		num =0;
				System.out.println(num);
				
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		ad();
		System.out.println(num);
		Date da = new Date();
		
		System.out.println(da);
	
		
	}
}
class asd{
	asd(){
		
	}

}