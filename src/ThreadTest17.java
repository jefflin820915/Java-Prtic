/*
	類鎖, 類只有一個, 所以鎖是類級別的, 只有一個
 */
public class ThreadTest17 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Thread(new Processor15());
		Thread t2 = new Thread(new Processor15());
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		
		//延遲,保證t1先執行
		Thread.sleep(1000);
		t2.start();
		
	}
}
class Processor15 implements Runnable{
	
	public void run() {
		if("t1".equals(Thread.currentThread().getName())) {
			MyClass03.m1();
		}
	
		if("t2".equals(Thread.currentThread().getName())) {
			MyClass03.m2();
		}
	}
	
}
class MyClass03{
	
	//synchronized添加到靜態方法上, 線程執行此方法的時候會找類鎖
	public synchronized static void m1() {
		
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
		}
	
		System.out.println("m1...");
	}
	
	//不會等m1結束, 因為該方法沒有被synchronized修飾
	/*
	public static void m2() {
		
		System.out.println("m2...");
	}
	*/
	
	//m2方法等m1結束之後才能執行, 該方法有synchronized
	//線程執行該代碼需要類鎖, 而類鎖只有一個
	public synchronized static void m2() {
		System.out.println("m2...");
	}
	
	
}