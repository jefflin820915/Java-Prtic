/*
	
	�H�U�{�Ǻt�ܨ��ڨҤl, �H�U�{�Ǩϥνu�{�P�B����O�Ҽƾڪ��w��.
	
 */
public class ThreadTest13 {

	public static void main(String[] args) {
		
		//�Ыؤ@�Ӥ��@���b��
		Account02 act = new Account02("act-001",5000.0);
		
		//�Ыؽu�{��P�@�ӱb�����
		//Porcessor10 p = new Porcessor10(act);
		
		Thread t1 = new Thread(new Porcessor11(act));
		Thread t2 = new Thread(new Porcessor11(act));
		
		t1.start();
		
		t2.start();
	
	}
}

//���ڽu�{
class Porcessor11 implements Runnable{
	
	//�b��
	Account02 act;
	
	//Constructor
	public Porcessor11(Account02 act) {
		
		this.act = act;
	}
	
	
	@Override
	public void run() {
		
		act.withdraw(1000.0);
		System.out.println("����1000.0���\, �l�B:" + act.getBalance());
	}
}



//�b��
class Account02 {
	
	private String actno;
	
	private double balance;
	
	public Account02() {
		
	}
	
	public Account02(String actno,double balance) {
		this.actno = actno;
		this.balance = balance;
	}
	//setter getter
	
	public void setActno(String actno) {
		this.actno = actno;
	}
	
	public void setBalance(double balance) {
		
		this.balance = balance;
	}

	public String getActno() {
		return actno;
	}

	public double getBalance() {
		return balance;
	}
	
	//��~���Ѥ@�Ө��ڪ���k
	public void withdraw(double money) { //����e�b����ھާ@
		
		//��ݭn�P�B���N�X���P�B�y�y����
		synchronized (this) {
		/*
			��z: t1�u�{�Mt2�u�{
			t1�u�{����즹�B,�J��Fsychronized������r, �N�|�h��this����H��
			�p�G���this��H��, �h�i�J�P�B�y�y��������{��, ���P�B�y�y�������N�X
			���浲������, t1�u�{�k��this��H��
			
			�bt1�u�{����P�B�y�y�����L�{��,  �p�Gt2�u�{�]�L�Ӱ���H�U�N�X, �]�J��
			synchronized����r, �ҥH�]�h��this����H��, ���O�ӹ�H��Qt1�u�{����,
			�u��b�o����this��H�ꪺ�k��
		*/
			
		double after = balance - money;
		
		//����
		try {
		Thread.sleep(1000);
		}catch(Exception e) {
		}
		
		//��s
		this.setBalance(after);
		}
	}
}