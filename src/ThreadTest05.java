/*
	線程優先級高的獲取的CPU時間片相對多一些
	優先級:	1-10
	最低	 1
	最高   10
	默認   5
 */
public class ThreadTest05 {

	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY); //10
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		
		
		//創建線程
		
		Thread t1 = new Processor03();
		
		t1.setName("t1");
		
		Thread t2 = new Processor03();
		
		t2.setName("t2");
		
		System.out.println(t1.getPriority()); //5
		System.out.println(t2.getPriority()); //5
		
		//設置優先級
		t1.setPriority(5);
		t2.setPriority(6);
		
		//啟動線程
		t1.start();
		t2.start();
	}
}

class Processor03 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}