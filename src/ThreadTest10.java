/*
	Thread.yield();
	
	1. 該方法是一個靜態方法
	
	2. 作用:給同一個優先級的線程讓位,  讓位時間不固定
	
	3. 和sleep方法相同, 就是yield時間不固定.
	
 */
public class ThreadTest10 {

	public static void main(String[] args) {
		
		Thread t = new Processor08();
		
		t.setName("t");
		
		t.start();
		
		//主線程中
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}
}
class Processor08 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			if(i%20==0) {
				Thread.yield();
			}
		}
	
	}
	
	
}