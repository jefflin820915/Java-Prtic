/*
	面試題
 */
public class ThreadTest15 {

	public static void main(String[] args) throws Exception{
		
		MyClass01 mc = new MyClass01();
		
		Processor13 p = new Processor13(mc);
		
		Thread t1 = new Thread(p);
		t1.setName("t1");
		Thread t2 = new Thread(p);
		t2.setName("t2");
	
		//啟動線程
		t1.start();
		
		//延遲(保證t1線程先啟動, 並執行run)
		Thread.sleep(1000);
		
		t2.start();
	}	

}
class Processor13 implements Runnable{
	
	MyClass01 mc;
	
	public Processor13(MyClass01 mc) {
		
		this.mc  = mc;
	}
	
	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
			mc.m1();
		}
	
		if(Thread.currentThread().getName().equals("t2")) {
			mc.m2();
		}
	}
}
class MyClass01{
	
	public synchronized void m1() {
		
		//休眠
		try {
		Thread.sleep(10000);
		}catch(Exception e) {
			
		}
		System.out.println("m1...");
	}
	
	/*
	m2方法的執行不需要等m1的結束,  因為m2方法上沒有synchronized
	public void m2() {
		System.out.println("m2....");
	}
	*/
	
	//m2方法會等m1方法結束, t1,t2共享同一個mc, 並且m1和m2方法上都有synchronized
	public synchronized void m2() {
		System.out.println("m2...");
	}
}