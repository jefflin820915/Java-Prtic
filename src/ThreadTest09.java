/*
	如何正確的更好終止一個正在執行的線程
	
	需求: 線程啟動5S之後終止 
 */
public class ThreadTest09 {

	public static void main(String[] args) throws Exception{
		
		Processor07 p = new Processor07();
		Thread t = new Thread(p);
		
		t.setName("t");
		
		t.start();
		
		//5s之後終止
		
		Thread.sleep(5000);
		
		//終止
		p.run = false;
	}
}

class Processor07 implements Runnable{
	
	
	boolean run = true;
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			if(run) {
					try {
					
						Thread.sleep(1000);
					
						}catch(Exception e) {
						
							e.printStackTrace();
				}
					System.out.println(Thread.currentThread().getName()+"-->"+i);
			}else {
				return;
			}
			
		}
	}
}