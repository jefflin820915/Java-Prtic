/*
	線程的合併
 */
public class ThreadTest11 {

	public static void main(String[] args) throws Exception{
		
		Thread t = new Thread(new Processor09());
		
		t.setName("t");
		
		t.start();
		
		//合併線程
		t.join(); //t和主線程合併 , 單線程的程序
		
		//主線程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}
}
class Processor09 implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
	
}
