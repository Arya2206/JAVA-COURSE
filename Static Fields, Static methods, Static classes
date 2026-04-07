//Static Fields
import java.util.Scanner;
class Counter {

	private static int count = 0;
	public static void increment(){
	count++;
	
}
public static void decrement(){
	count--;
}
public static void displayCount(){
	System.out.println("Current value of count is: " + count);
}
	// write the code..

}

public class CounterTest {
    public static void main(String[] args) {
        Counter.increment(); // Increment count
        Counter.displayCount(); // Display count

        Counter.increment(); // Increment count again
        Counter.displayCount(); // Display count

        Counter.decrement(); // Decrement count
        Counter.displayCount(); // Display count
    }
}


//static methods

import java.util.*;
public class Calculator {
    
    // write the code..
	public static int add(int a, int b){
		return a+b;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
        System.out.println(add(x,y));
    }
}

//static classes

import java.util.Scanner;
public class MathMain {
    
    // Static nested class MathUtils
    static class MathUtils {
		public static int add(int a, int b){
			return a+b;
		}
		public static int subtract(int a, int b){
			return a-b;
		}
		public static int multiply(int a, int b){
			return a*b;
		}
        
        // Method to add two integers
        
        // Method to subtract the second integer from the first
        
        // Method to multiply two integers
       
    }
        // Implementation of the main method where the program execution starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        int a = scanner.nextInt();

        // Prompt the user to enter the second number
        int b = scanner.nextInt();

        // Close the scanner to release resources
        scanner.close();

        // Usage of the MathUtils methods
        System.out.println("Addition: " + MathUtils.add(a, b));
        System.out.println("Subtraction: " + MathUtils.subtract(a, b));
        System.out.println("Multiplication: " + MathUtils.multiply(a, b));
    }

}
