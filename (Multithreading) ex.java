package q36051;
public class SimpleThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter("Ganga");
		Thread t1 = new Thread(c1);
		System.out.println("Before start() method call t1.getState() = " + t1.getState());
		System.out.println("Before start() method call t1.isAlive() = " + t1.isAlive());
		t1.start();
		System.out.println("After start() method call t1.getState() = " + t1.getState());
		System.out.println("After start() method call t1.isAlive() = " + t1.isAlive());
		t1.join();
		System.out.println("After t1 has terminated t1.getState() = " + t1.getState());
		System.out.println("After t1 has terminated t1.isAlive() = " + t1.isAlive());
	}
}
class Counter implements Runnable {
	private String name;
	public Counter(String name) {
		this.name = name;
	}
	public void run() {
	try{
		for (int i = 0; i < 3; i++) {
			System.out.println("Ganga : " + i);
			Thread.sleep(500);
		}
	}catch (InterruptedException e){
		System.out.println("Thread interrupted.");
		
		
		}
	}
}
