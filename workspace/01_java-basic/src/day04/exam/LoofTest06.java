package day04.exam;

public class LoofTest06 {
public static void main(String[] args) {
	for(int i=1;i<10;i++){
		if(i==1)System.out.print("  :");
		if(i>1)System.out.print(i+"단" );
		
		for(int j=1;j<10;j++){
		
			System.out.print("	"+i*j);
		}
		if (i==1){
				System.out.println("\n---------------------------------------------------------------------------"); 
			}
		
		System.out.println();
	}
}
}
