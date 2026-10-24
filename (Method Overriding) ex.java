package q11271;
class Bank {
	float calculateInterest(float principal, int time)	{
		return 0;
	}
}

//complete the below code..
class SBI  extends Bank      {
	private static final float INTEREST_RATE = 10.8f;
	public float calculateInterest(float principal, int time){
		return (float) (principal*INTEREST_RATE*time/100);
	}
	
	
	
}
class ICICI extends Bank     {
	private static final float INTEREST_RATE = 11.6f;
	public float calculateInterest(float principal, int time){
		return (float)(principal*INTEREST_RATE*time/100);
	}
	
	
	
}

class AXIS extends Bank       {
	private static final float INTEREST_RATE = 12.3f;
	public float calculateInterest(float principal, int time){
		return (float)(principal*INTEREST_RATE*time/100);
	}
	
	
	
}

public class TestOverriding {
	public static void main(String[] args) {
		Bank sbiBank = new SBI();
		Bank  iciciBank = new ICICI();
		Bank axisBank = new AXIS();
		float principal = Float.parseFloat(args[0]);
		int time = Integer.parseInt(args[1]);
		System.out.println("SBI rate of interest = " + sbiBank.calculateInterest(principal, time));
		System.out.println("ICICI rate of interest = " + iciciBank.calculateInterest(principal, time));
		System.out.println("AXIS rate of interest = " + axisBank.calculateInterest(principal, time));
	}
}
