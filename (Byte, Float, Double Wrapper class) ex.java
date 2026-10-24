//Byte Wrapper Class

package q10779;
public class GuessDataType {
	public static void main(String[] args) {
		//write code to convert the value pased in args[0] into a byte
		byte numberOfBits = Byte.parseByte(args[0]);

		switch(numberOfBits) {
			case 8 : 
				System.out.println("byte");
				break;
			case 16 : 
				System.out.println("short or a char");
				break;
			case 32 : 
				System.out.println("int or a float");
				break;
			case 64 : 
				System.out.println("long or a double");
				break;
			default : 
				System.out.println("Could not guess the data type of size : " + numberOfBits + " bits");
				break;
		}
	}
}

//Float wrapper class

package q10782;
public class CalculateDifference {
	public static void main(String[] args) {
		// In the below two lines write code to convert
		// the string value passed in args[0] and args[1] into int values using Float.parseFloat method
		// convert the value in args[0] to int and store in firstValue
		// convert the value in args[1] to int and store in secondValue
		float firstValue = Float.parseFloat(args[0]);
		float secondValue = Float.parseFloat(args[1]);
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}

//Double Wrapper class

package q10857;
public class CalculateDifference {
	public static void main(String[] args) {
		double firstValue = Double.parseDouble(args[0]);
		double secondValue = Double.parseDouble(args[1]);
		
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}
