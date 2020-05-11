/*
	½uµ{ªº¦X¨Ö
 */
public class ThreadTest11 {

	public static void main(String[] args) throws Exception{
		
		Thread t = new Thread(new Processor09());
		
		t.setName("t");
		
		t.start();
		
		//¦X¨Ö½uµ{
		t.join(); //t©M¥D½uµ{¦X¨Ö , ³æ½uµ{ªºµ{§Ç
		
		//¥D½uµ{
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
