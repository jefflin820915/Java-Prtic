/*
	三個方法
		1.獲取當前線程對象Thread.currentThread();
		2.給線程起名 t.setName("t1");
		3.獲取線程的名字t.getName();
 */
public class ThreadTest04 {

	public static void main(String[] args) {
		
		//如何獲取當前線程對象
		Thread t = Thread.currentThread(); //t保存的內存地址指向的線程是"主線程對象"
		
		//獲取線程的名字
		System.out.println(t.getName()); //main
	
		
		
		Processor02 p = new Processor02();
		Thread t1 = new Thread(p);
		
		//給線程起名
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
		Thread t = Thread.currentThread(); //t保存的內存地址指向的線程是"t1線程"
		System.out.println(t.getName()); //Thread-0 Thread-1
	
	}
}