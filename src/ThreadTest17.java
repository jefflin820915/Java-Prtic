/*
	����, ���u���@��, �ҥH��O���ŧO��, �u���@��
 */
public class ThreadTest17 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Thread(new Processor15());
		Thread t2 = new Thread(new Processor15());
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		
		//����,�O��t1������
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
	
	//synchronized�K�[���R�A��k�W, �u�{���榹��k���ɭԷ|������
	public synchronized static void m1() {
		
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
		}
	
		System.out.println("m1...");
	}
	
	//���|��m1����, �]���Ӥ�k�S���Qsynchronized�׹�
	/*
	public static void m2() {
		
		System.out.println("m2...");
	}
	*/
	
	//m2��k��m1��������~�����, �Ӥ�k��synchronized
	//�u�{����ӥN�X�ݭn����, ������u���@��
	public synchronized static void m2() {
		System.out.println("m2...");
	}
	
	
}