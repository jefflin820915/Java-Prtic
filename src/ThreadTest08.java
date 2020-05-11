/*
	某線程正在休眠, 如何打斷他的休眠
	
	以下方式靠的是異常處理機制
 */
public class ThreadTest08 {

	public static void main(String[] args) throws Exception{
		
		//需求: 啟動線程, 5s之後打斷線程的休眠
		
		Thread t = new Thread(new Processor06());
		
		//起名
		t.setName("t");
		
		//啟動
		t.start();
		
		//5s之後
		Thread.sleep(5000);
		
		//打斷t的休眠
		t.interrupt();
	}
}
class Processor06 implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(100000000L); //發生異常
			
			System.out.println("HellowWorld");
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	
	}
	
}