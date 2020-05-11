/*
	1.Thread.sleep(毫秒);
 	2.sleep方法是一個靜態方法.
 	3.該方法作用:	阻塞當前線程,騰出CPU, 讓給其他線程
 	
 */
public class ThreadTest06 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Processor04();
		t1.setName("t1");
		t1.start();
	
		//阻塞主線程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);
		}
	}
}

class Processor04 extends Thread{
	
	
	//Thread中的run方法不拋出異常, 所以重寫run方法之後,在run方法的生命位置上不能使用throws
	//所以run方法中的異常只能try...catch..
	@Override
	public void run() {
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
			Thread.sleep(1000); //讓當前線程阻塞1s
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//m1();
	
	}
	
	/*
	m1方法是可以使用throws的
	public void m1() throws Exception{
	
		
	}
	*/
}