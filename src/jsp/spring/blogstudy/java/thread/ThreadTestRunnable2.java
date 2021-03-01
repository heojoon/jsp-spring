package jsp.spring.blogstudy.java.thread;

public class ThreadTestRunnable2 implements Runnable {

	int testNum = 0;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("A") || Thread.currentThread().getName().equals("C") ) {
				System.out.println("=========> Current Thread : "+Thread.currentThread().getName());
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ",testNum : " + testNum);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
