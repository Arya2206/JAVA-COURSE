//Encapsulation is a feature in object-oriented languages, like Java where we can selectively hide the data and members, so that they are not accidentally corrupted by code.

package q11121;
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0) { 
			this.age = age;	
		}
	}
	
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
}

public class Test {	
	public static void main(String[] args) {
		Person p1 = new Person("Albert Einstein", 25);
		
		System.out.println("name of p1 is : " + p1.getName());
		p1.setAge(-3);
	}
}
