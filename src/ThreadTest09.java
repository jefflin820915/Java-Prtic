/*
	�p�󥿽T����n�פ�@�ӥ��b���檺�u�{
	
	�ݨD: �u�{�Ұ�5S����פ� 
 */
public class ThreadTest09 {

	public static void main(String[] args) throws Exception{
		
		Processor07 p = new Processor07();
		Thread t = new Thread(p);
		
		t.setName("t");
		
		t.start();
		
		//5s����פ�
		
		Thread.sleep(5000);
		
		//�פ�
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