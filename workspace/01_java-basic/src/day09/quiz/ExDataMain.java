package day09.quiz;

public class ExDataMain {
	public static void main(String[] args) {
		ExDate ex01 = new ExDate();
		ex01.showDate();
		ExDate ex02 = new ExDate(2013, 8, 11);
		ex02.showDate();
	}

}

class ExDate {
	private  int y;
	private  int m;
	private  int d;
	
	public ExDate() {
		this(2013,4,1);
	}

	public ExDate(int y, int m, int d) {
		this.y=y;
		this.m=m;
		this.d=d;

	}

	void showDate() {
	
		System.out.printf("%d 년 %d 월 %d 일 \n",y,m,d);
	
	}
}