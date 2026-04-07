package q28884;
import java.util.Scanner;

public class EvenNumberChecker {
	private int number;
	public EvenNumberChecker(int number){
		this.number = number;
	}
	class EvenCheck{
		public boolean isEven(){
			return number %2==0;
		}
	}
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	
        EvenNumberChecker evenNumberChecker = new EvenNumberChecker(x);
        
        EvenCheck evenCheck = evenNumberChecker.new EvenCheck();
        boolean isEven = evenCheck.isEven();
        
        if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
