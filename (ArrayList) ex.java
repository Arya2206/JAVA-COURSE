package q23676;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
	List<String> namesList = new ArrayList<>();
		for(String arg : args){
			namesList.add(arg);
		}
		if(namesList.size() > 2){
			System.out.println("Name at index 2 is : " + namesList.get(2));
		}else{
			System.out.println("Not enough argumnets provided.");
		}
	}
}
