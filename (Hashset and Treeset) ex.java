//Hashset

package q11380;
import java.util.*;
public class HashSetMethodsDemo {
	public static void main(String[] args) {
		Set aSet = new HashSet(args.length);
		for (String argument : args) {
			aSet.add(argument);
		}
		System.out.println("aSet = " + aSet);
		System.out.println("aSet.size() = " +aSet.size());
		boolean removed = aSet.remove("Larry Page");
		System.out.println("Larry Page removedFlag = " + removed);
		
		
	}
}

//Treeset

package q37263;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new TreeSet<String>();
		// write your code here 
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2  = scanner.nextLine();
		String s3  = scanner.nextLine();
		namesSet.add(s1);
		namesSet.add(s2);
		namesSet.add(s3);
		System.out.println("namesSet = " + namesSet);
		String s4 = scanner.nextLine();
		namesSet.add(s4);
		System.out.println("namesSet = " + namesSet);
		String s5 = scanner.nextLine();
		String s6 = scanner.nextLine();
		namesSet.remove(s5);
		namesSet.remove(s6);
		
		
		System.out.println("namesSet = " + namesSet);
	}
}
