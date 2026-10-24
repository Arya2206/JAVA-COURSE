package q11264;
class Student{
	int id;
	String name;
	void setData(int id, String name){
		this.id  = id;
		this.name = name;
	}
	void displayData(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}
class Marks extends Student{
	float javaMarks, cMarks, cppMarks;
	void setMarks(float javaMarks, float cMarks, float cppMarks){
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	void displayMarks(){
		System.out.println("Java marks : " + javaMarks);
		System.out.println("C marks : " + cMarks);
		System.out.println("Cpp marks : " + cppMarks);
	}
}
class Result extends Marks {
	float total, avg;
	void compute(){
		total = javaMarks + cMarks + cppMarks;
		avg = total / 3;
	}
	void showResult() {
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg);
	}
}
public class MultilevelInheritanceDemo {
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		float javaMarks = Float.parseFloat(args[2]);
		float cMarks = Float.parseFloat(args[3]);
		float cppMarks = Float.parseFloat(args[4]);
		Result r = new Result();
		r.setData(id,name);
		r.displayData();
		r.setMarks(javaMarks, cMarks, cppMarks);
		r.displayMarks();
		r.compute();
		r.showResult();
	}
}
