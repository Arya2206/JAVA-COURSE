package q11263;
class Marks{
	int id;
	float javaMarks, cMarks, cppMarks;
	void setMarks(int id, float javaMarks, float cMarks, float cppMarks){
		this.id = id;
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	void displayMarks(){
		System.out.println("Id : " + id);
		System.out.println("Java marks : " + javaMarks);
		System.out.println("C marks : " + cMarks);
		System.out.println("Cpp marks : " + cppMarks);
	}
}
class Result extends Marks{
	float total, avg;
	void compute(){
		total = javaMarks + cMarks + cppMarks;
		avg = total / 3;
	}
	void showResult(){
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg);
	}
}
public class SingleInheritanceDemo {
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		float javaMarks = Float.parseFloat(args[1]);
		float cMarks = Float.parseFloat(args[2]);
		float cppMarks = Float.parseFloat(args[3]);

		Result r = new Result();
		r.setMarks(id,javaMarks,cMarks,cppMarks);
		r.displayMarks();
		r.compute();
		r.showResult();
	}
}
