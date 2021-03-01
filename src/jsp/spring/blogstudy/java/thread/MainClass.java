package jsp.spring.blogstudy.java.thread;

public class MainClass {

	public static void main(String[] args) {
		
		// Runnable  로 구현한 멀티 쓰레드 
		ThreadTestRunnable threadTest = new ThreadTestRunnable();
		
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		
		// Thread 상속으로 구현한 멀티 쓰레드
		ThreadTest threadTest2 = new ThreadTest();
		threadTest2.setName("B");
		threadTest2.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}
