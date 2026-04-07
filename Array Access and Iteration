//In the given code, the class RiverNamePrinter prints the elements of the array containing the names of Indian rivers.

package q10936;
public class RiverNamePrinter {
	public static void main(String[] args) {
		String[] namesArr = { "Ganga", "Yamuna", "Godavari", "Krishna", "Narmada", "Kaveri" };
		for(String river : namesArr){
			System.out.println(river);
		}
		//write the code to print the River names one after one
	}
}

//Create a class CityNameFinder with a public method findElement that takes one parameter index of type int.

package q10939;
public class CityNameFinder {
	public void findElement(int index){
		String[] namesarr = {"Mumbai","Delhi","Kolkata","Chennai","Hyderabad","Bangalore"};
		if(index >= 0 && index < namesarr.length){
			System.out.println(namesarr[index]);
		}else{
			System.out.println("Wrong Index");
		}
	}
}

//Write a class IndexFinder with public method printIndex that takes two parameters one is intArr of type int[] and other is an element of type int and print all indices of the elements in intArr which are equal to the given element.

package q10940;
public class IndexFinder{
	public void printIndex(int[] intArr, int element){
		for(int i = 0; i<intArr.length - 1; i++){
			if(intArr[i] == element){
				System.out.println(i);
			}
		}
	}
}

//Write a class ArrayElementCounter with a public method countElement that takes two parameters one is arr of type int[] and the other is element of type int and returns the count of the element that occures in the arr. The return type of countElement should be int.

package q10942;

public class ArrayElementCounter {
	public int countElement(int[] arr, int element){
		int count = 0;
		for(int num : arr){
			if(num == element){
				count++;
			}
		}
		return count;
	}
}

//Create a class ArrayReverser with a public method reverseArray that takes one parameter arr of type int[] and returns all the elements in the arr in reverse order. The return type of reverseArray should be int.

package q10944;

public class ArrayReverser {
	
	
	public int[] reverseArray(int[] arr) {
		//Write your code here
		int n = arr.length;
		int[] reversed = new int[n];
		for(int i = 0; i<n; i++){
			reversed[i] = arr[n-1-i];
		}
		return reversed;
}
public static void main(String[] args) {
	ArrayReverser ar = new ArrayReverser();
	int[] arr1 = {1,2,3,4};
	int[] res1 = ar.reverseArray(arr1);
	for(int x : res1) System.out.println(x);

	int[] arr2 = {9,9,6,5,2,5,4,1};
	int[] res2 = ar.reverseArray(arr2);
	for(int x : res2) System.out.println(x);
	int[] arr3 = {-78, -14, -54, -14};
	int[] res3 = ar.reverseArray(arr3);
	for(int x : res3) System.out.println(x);
}
}
