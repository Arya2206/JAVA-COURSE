package q10737;
public class Student {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("q10737.Student");
			System.out.println("class Student found");
		} catch(ClassNotFoundException cnfe) {
			try {
				Class<?> badClazz = Class.forName("q10737.student");
				System.out.println("class student found");
			} catch(ClassNotFoundException cnfe1) {
				System.out.println("class Student not found");
			}
		}
	}
}
