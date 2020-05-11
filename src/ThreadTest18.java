/*
	����, ���u���@��, �ҥH��O���ŧO��, �u���@��
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
		
		//����,�O��t1������
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
			mc.m1(); //�Ϊ��٬O����, �M��H�L��
		}
	
		if("t2".equals(Thread.currentThread().getName())) {
			mc.m2();
		}
	}
	
}
class MyClass04{
	
	//synchronized�K�[���R�A��k�W, �u�{���榹��k���ɭԷ|������
	public synchronized static void m1() {
		
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
		}
	
		System.out.println("m1...");
	}
	
	
	//m2��k��m1��������~�����, �Ӥ�k��synchronized
	//�u�{����ӥN�X�ݭn����, ������u���@��
	public synchronized static void m2() {
		System.out.println("m2...");
	}
	
	
}