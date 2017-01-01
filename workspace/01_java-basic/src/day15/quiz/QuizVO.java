package day15.quiz;

public class QuizVO implements Comparable<QuizVO>{
	private String num;
	public QuizVO(String num){
		this.num = num;
		
	}
	public String getNum(){return num;}
	public String toString(){return String.valueOf(num);}
	@Override
	public int compareTo(QuizVO o) {
		// TODO Auto-generated method stub
		return 0;
		
	}

	
}

