/*
	�����D
 */
public class ThreadTest07 {

	public static void main(String[] args) throws Exception{
		
		//�Ыؽu�{
		Thread t = new Processor05();
		t.setName("t");
		
		//�Ұʽu�{
		t.start();
	
		//��v
		t.sleep(5000); //���P��Thread.sleep(5000); ���몺�٬O��e�u�{, �Mt�L��
		
		System.out.println("HellowWorld");
	
		AB a = null;
		
		a.m1(); //���|���ū��w���`
	
	}
}

class Processor05 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
	
}

class AB{
	public static void m1() {
		
	}
}