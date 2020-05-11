/*
	�����D
 */
public class ThreadTest16 {

	public static void main(String[] args) throws Exception{
		
		MyClass02 mc1 = new MyClass02();
		MyClass02 mc2 = new MyClass02();
		
		Processor14 p1 = new Processor14(mc1);
		Processor14 p2 = new Processor14(mc2);
		
		Thread t1 = new Thread(p1);
		t1.setName("t1");
		Thread t2 = new Thread(p2);
		t2.setName("t2");
	
		//�Ұʽu�{
		t1.start();
		
		//����(�O��t1�u�{���Ұ�, �ð���run)
		Thread.sleep(1000);
		
		t2.start();
	}	

}
class Processor14 implements Runnable{
	
	MyClass02 mc;
	
	public Processor14(MyClass02 mc) {
		
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
class MyClass02{
	
	public synchronized void m1() {
		
		//��v
		try {
		Thread.sleep(10000);
		}catch(Exception e) {
			
		}
		System.out.println("m1...");
	}
	
	//m2��k���|��m1��k����, t1,t2���@�ɦP�@��mc
	public synchronized void m2() {
		System.out.println("m2...");
	}
}