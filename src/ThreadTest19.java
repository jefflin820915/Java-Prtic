/*
	�u�@�u�{
	
	��L�Ҧ����Τ�u�{����, �h�u�@�u�{�h�X
	�u�@�u�{�@�볣�L������
 */
public class ThreadTest19 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Processor17();
		
		t1.setName("t1");
		
		//�Nt1�o�ӥΤ�u�{,�ק令�u�@�u�{
		t1.setDaemon(true);
		
		t1.start();
		
		//�D�u�{
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