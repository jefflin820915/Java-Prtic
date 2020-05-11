/*
	�T�Ӥ�k
		1.�����e�u�{��HThread.currentThread();
		2.���u�{�_�W t.setName("t1");
		3.����u�{���W�rt.getName();
 */
public class ThreadTest04 {

	public static void main(String[] args) {
		
		//�p�������e�u�{��H
		Thread t = Thread.currentThread(); //t�O�s�����s�a�}���V���u�{�O"�D�u�{��H"
		
		//����u�{���W�r
		System.out.println(t.getName()); //main
	
		
		
		Processor02 p = new Processor02();
		Thread t1 = new Thread(p);
		
		//���u�{�_�W
		t1.setName("t1");
		
		t1.start();
		
		Processor02 p2 = new Processor02();
		Thread t2 = new Thread(p2);
		
		t2.setName("t2");
		t2.start();
		
	}
}

class Processor02 implements Runnable{
	
	@Override
	public void run() {
		Thread t = Thread.currentThread(); //t�O�s�����s�a�}���V���u�{�O"t1�u�{"
		System.out.println(t.getName()); //Thread-0 Thread-1
	
	}
}