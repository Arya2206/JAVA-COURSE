import java.util.Scanner;
public class ArrayIndexHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input index
        int index = scanner.nextInt();

        // Array index validation
       try{
		   System.out.println("Element at index "+index+" is: "+numbers[index]);
	   }
           
         catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("Error: Index out of bounds");

        }
    }
}
