/*
	java����{�u�{���ĤG�ؤ覡
		�Ĥ@�B: �g�@������{java.lang.Runnable;���f
		�ĤG�B: ��{run��k
 */
public class ThreadTest03 {

	public static void main(String[] args) {
		
		//�Ыؽu�{
		Thread t = new Thread(new Processor01());
		
		
		//�Ұ�
		t.start();
	
	}
}

//�o�ؤ覡�O���˪�, �]���@������{���f���~�٫O�d�F�����~��
class Processor01 implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("run-->" + i);
		}
	}
} 