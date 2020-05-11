/*
	類鎖, 類只有一個, 所以鎖是類級別的, 只有一個
 */
public class ThreadTest18 {

	public static void main(String[] args) throws Exception{
		
		MyClass04 mc1 = new MyClass04();
		MyClass04 mc2 = new MyClass04();
		
		Thread t1 = new Thread(new Processor16(mc1));
		Thread t2 = new Thread(new Processor16(mc2));
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		
		//延遲,保證t1先執行
		Thread.sleep(1000);
		t2.start();
		
	}
}
class Processor16 implements Runnable{
	
	MyClass04 mc;
	
	public Processor16(MyClass04 mc) {
		this.mc = mc;
	}
	
	public void run() {
		if("t1".equals(Thread.currentThread().getName())) {
			mc.m1(); //用的還是類鎖, 和對象無關
		}
	
		if("t2".equals(Thread.currentThread().getName())) {
			mc.m2();
		}
	}
	
}
class MyClass04{
	
	//synchronized添加到靜態方法上, 線程執行此方法的時候會找類鎖
	public synchronized static void m1() {
		
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
		}
	
		System.out.println("m1...");
	}
	
	
	//m2方法等m1結束之後才能執行, 該方法有synchronized
	//線程執行該代碼需要類鎖, 而類鎖只有一個
	public synchronized static void m2() {
		System.out.println("m2...");
	}
	
	
}