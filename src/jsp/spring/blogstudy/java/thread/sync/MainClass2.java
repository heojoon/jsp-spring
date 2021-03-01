package jsp.spring.blogstudy.java.thread.sync;

public class MainClass2 {

	public static void main(String[] args) {
		
		// 객체 1개를 여러개의 쓰레드가 사용 구현. 객체의 맴버 자원을 공유함. 
		ThreadTestRunnable2 threadTest = new ThreadTestRunnable2();
		
		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}
