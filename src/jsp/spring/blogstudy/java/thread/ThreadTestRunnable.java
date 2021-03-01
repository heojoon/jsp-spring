package jsp.spring.blogstudy.java.thread;

public class ThreadTestRunnable implements Runnable {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest by Runnable");
		
		for (int i=0 ; i<10;i++) {
			System.out.println("A item = "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
