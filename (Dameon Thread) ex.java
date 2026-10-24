//Daemon thread is a low priority thread (in the context of JVM) that runs in background to perform tasks such as garbage collection etc., they do not prevent the JVM from exiting when all the user threads finish their execution.


package q11351;
public class DaemonThreadDemo extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is daemon thread");
		} else {
			System.out.println("This is not a daemon thread");
		}
	}
	public static void main(String[] args) {
		DaemonThreadDemo t1 = new DaemonThreadDemo(); 
		DaemonThreadDemo t2 = new DaemonThreadDemo(); 
		DaemonThreadDemo t3 = new DaemonThreadDemo(); 
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
