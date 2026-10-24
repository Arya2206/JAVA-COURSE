//Write a Java program to handle an ArithmeticException divide by zero using exception handling.

package q11329;
public class Division{
	public static void main(String[] args){
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("Result = " + result);
			
		}catch (ArithmeticException e){
			System.out.println("Exception caught : divide by zero occurred");
		}catch (NumberFormatException e){
			System.out.println("Exception caught : invalid number format");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught : insufficient arguments provided");
		}
	}
}

//Write a Java program to handle an ArithmeticExceptiondivided by zero by using try, catch and finally blocks.

package q11330;
public class MyFinallyBlock {
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		float fnum1 = Float.parseFloat(args[2]);
		float fnum2 = Float.parseFloat(args[3]);
		try{
			int resultInt = num1 / num2;
			System.out.println("Result of integer values division : " + resultInt);
		}catch (ArithmeticException e){
			System.out.println("Inside the 1st catch block");
		}finally{
			System.out.println("Inside the 1st finally block");
		}
		try{
			float resultFloat = fnum1 / fnum2;
			System.out.println("Result of float values division : " + resultFloat);
		} catch (ArithmeticException e){
			System.out.println("Inside the 2nd catch block");
		}finally{
			System.out.println("Inside the 2nd finally block");
		}
	}
}

//Write a Java program to illustrate multiple catch blocks in exception handling.

package q11331;
public class MultiCatchBlocks {
	public static void multiCatch(int[] arr,int index){
		try{
			System.out.println(arr[index]);
			int result = arr[index] / index;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Division by zero exception occurred");
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds exception occurred");
		}
		catch(Exception e){
			System.out.println("Exception occurred");
		}
	}
}
