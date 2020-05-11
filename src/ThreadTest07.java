/*
	面試題
 */
public class ThreadTest07 {

	public static void main(String[] args) throws Exception{
		
		//創建線程
		Thread t = new Processor05();
		t.setName("t");
		
		//啟動線程
		t.start();
	
		//休眠
		t.sleep(5000); //等同於Thread.sleep(5000); 阻塞的還是當前線程, 和t無關
		
		System.out.println("HellowWorld");
	
		AB a = null;
		
		a.m1(); //不會報空指針異常
	
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