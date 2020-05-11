/*
	�u�{�u���Ű��������CPU�ɶ����۹�h�@��
	�u����:	1-10
	�̧C	 1
	�̰�   10
	�q�{   5
 */
public class ThreadTest05 {

	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY); //10
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		
		
		//�Ыؽu�{
		
		Thread t1 = new Processor03();
		
		t1.setName("t1");
		
		Thread t2 = new Processor03();
		
		t2.setName("t2");
		
		System.out.println(t1.getPriority()); //5
		System.out.println(t2.getPriority()); //5
		
		//�]�m�u����
		t1.setPriority(5);
		t2.setPriority(6);
		
		//�Ұʽu�{
		t1.start();
		t2.start();
	}
}

class Processor03 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}