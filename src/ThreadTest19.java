/*
	守護線程
	
	其他所有的用戶線程結束, 則守護線程退出
	守護線程一般都無限執行
 */
public class ThreadTest19 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Processor17();
		
		t1.setName("t1");
		
		//將t1這個用戶線程,修改成守護線程
		t1.setDaemon(true);
		
		t1.start();
		
		//主線程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			
			Thread.sleep(1000);
		}
	}
	
}
class Processor17 extends Thread{
	
	@Override
	public void run() {
	
		int i = 0;
		
		while(true) {
			
			i++;
			
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			
			try {
			
			Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}