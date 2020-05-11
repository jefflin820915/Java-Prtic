/*
	�Y�u�{���b��v, �p���_�L����v
	
	�H�U�覡�a���O���`�B�z����
 */
public class ThreadTest08 {

	public static void main(String[] args) throws Exception{
		
		//�ݨD: �Ұʽu�{, 5s���ᥴ�_�u�{����v
		
		Thread t = new Thread(new Processor06());
		
		//�_�W
		t.setName("t");
		
		//�Ұ�
		t.start();
		
		//5s����
		Thread.sleep(5000);
		
		//���_t����v
		t.interrupt();
	}
}
class Processor06 implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(100000000L); //�o�Ͳ��`
			
			System.out.println("HellowWorld");
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	
	}
	
}