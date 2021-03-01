package jsp.spring.blogstudy.java.thread;

public class MainClass2 {

	public static void main(String[] args) {
		
		// 객체 1개를 여러개의 쓰레드가 사용 구현. 객체의 맴버 자원을 공유함. 
		ThreadTestRunnable2 threadTest = new ThreadTestRunnable2();
		
		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		
		// 객체 2개를 각 쓰레드가 사용 구현. 객체 맴버 자원을 독립적으로 사용.
		ThreadTestRunnable2 threadTestC = new ThreadTestRunnable2();
		ThreadTestRunnable2 threadTestD = new ThreadTestRunnable2();
		
		Thread thread3 = new Thread(threadTestC, "C");
		Thread thread4 = new Thread(threadTestD, "D");
		
		thread3.start();
		thread4.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
