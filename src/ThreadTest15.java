/*
	�����D
 */
public class ThreadTest15 {

	public static void main(String[] args) throws Exception{
		
		MyClass01 mc = new MyClass01();
		
		Processor13 p = new Processor13(mc);
		
		Thread t1 = new Thread(p);
		t1.setName("t1");
		Thread t2 = new Thread(p);
		t2.setName("t2");
	
		//�Ұʽu�{
		t1.start();
		
		//����(�O��t1�u�{���Ұ�, �ð���run)
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
		
		//��v
		try {
		Thread.sleep(10000);
		}catch(Exception e) {
			
		}
		System.out.println("m1...");
	}
	
	/*
	m2��k�����椣�ݭn��m1������,  �]��m2��k�W�S��synchronized
	public void m2() {
		System.out.println("m2....");
	}
	*/
	
	//m2��k�|��m1��k����, t1,t2�@�ɦP�@��mc, �åBm1�Mm2��k�W����synchronized
	public synchronized void m2() {
		System.out.println("m2...");
	}
}