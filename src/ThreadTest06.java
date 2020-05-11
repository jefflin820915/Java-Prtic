/*
	1.Thread.sleep(�@��);
 	2.sleep��k�O�@���R�A��k.
 	3.�Ӥ�k�@��:	�����e�u�{,�˥XCPU, ������L�u�{
 	
 */
public class ThreadTest06 {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Processor04();
		t1.setName("t1");
		t1.start();
	
		//����D�u�{
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);
		}
	}
}

class Processor04 extends Thread{
	
	
	//Thread����run��k���ߥX���`, �ҥH���grun��k����,�brun��k���ͩR��m�W����ϥ�throws
	//�ҥHrun��k�������`�u��try...catch..
	@Override
	public void run() {
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
			Thread.sleep(1000); //����e�u�{����1s
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//m1();
	
	}
	
	/*
	m1��k�O�i�H�ϥ�throws��
	public void m1() throws Exception{
	
		
	}
	*/
}