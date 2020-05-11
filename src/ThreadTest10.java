/*
	Thread.yield();
	
	1. �Ӥ�k�O�@���R�A��k
	
	2. �@��:���P�@���u���Ū��u�{����,  ����ɶ����T�w
	
	3. �Msleep��k�ۦP, �N�Oyield�ɶ����T�w.
	
 */
public class ThreadTest10 {

	public static void main(String[] args) {
		
		Thread t = new Processor08();
		
		t.setName("t");
		
		t.start();
		
		//�D�u�{��
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