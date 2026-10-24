package q11268;
public class OverloadArea {
	// Write the overload methods
	static float area(float side){
		return side * side;
	}
	static float area(float length, float breadth){
		return length * breadth;
	}
	public static void main (String[] args) {
		// Write the code
		float f1 = Float.parseFloat(args[0]);
		Float f2 = Float.parseFloat(args[1]);
			
			System.out.println("Area of square for side in meters " + f1 + " : " + area(f1)); // Fill in the missing code
		System.out.println("Area of rectangle for length and breadth in meters " + f1 + ", " + f2 + " : " + area(f1,f2)); // Fill in the missing code
	}
}
