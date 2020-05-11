/*
	��ӽu�{��1�Ӧ@�ɪ��ƾھާ@
	
	t1�Mt2��ӽu�{��P�@�ӽu�{�ާ@
	t1��X1��, t1�����L���u�{, t1����, 
	t2��X1��
 */
public class ThreadTest20 {

	public static void main(String[] args) throws Exception{
		
		Num num = new Num(1);
		
		Thread t1 = new Thread(new PrintOdd(num));
		t1.setName("t1");
		
		Thread t2 = new Thread(new PrintEven(num));
		t2.setName("t2");
		
		t1.start();
		
		Thread.sleep(1000);
		
		t2.start();
		
	}
}
//�@�ɼƾ�
class Num{
	
	int count;
	
	public Num(int count) {
		
		this.count = count;
	}

	//���ѥ��L�_�ƪ���k
	/*
		t1�u�{����Ӥ�k, ����num��H����H��,
		�åB��X t1->1, ���t2�u�{, ���Mt2�u�{�Q���,
		t2�u�{�ä��|���W����, �]��t2�u�{�L�k���
		���H��. ��printOdd��k�����this.wait();,
		t1�u�{�L����������, printOdd��k����, �����H��.
		t2�u�{������H��, �}�l����printEven��k
	 */
	public synchronized void printOdd() {
		
		System.out.println(Thread.currentThread().getName()+"-->" + count++);
		this.notifyAll();
		try {
			Thread.sleep(1000);
			this.wait(); //t1�u�{�L����������
	}catch(Exception e) {
		
	}
}
	
	//���ѥ��L���ƪ���k
	public synchronized void printEven() {

		System.out.println(Thread.currentThread().getName()+"-->"+count++);
		this.notifyAll();
		
		try {
			Thread.sleep(1000);
			this.wait();
		}catch(Exception e) {
			
		}
	}

}

//�u�{1
class PrintOdd implements Runnable{
	
	Num num;
	
	public PrintOdd(Num num) {
		this.num = num;
	}
	
	public void run() {
		
		while(true) {
		//���L�_��	
		num.printOdd();
		}
	}
}

//�u�{2
class PrintEven implements Runnable{
	Num num;
	
	public PrintEven(Num num) {
		this.num = num;
		
	}
	
	public void run() {
		
		while(true) {
		//���L����
		num.printEven();
		}
	}
}