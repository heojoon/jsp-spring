package jsp.spring.blogstudy.java.thread;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest by extends Thread Class");
		
		for (int i=0 ; i<10;i++) {
			System.out.println("B item = "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
