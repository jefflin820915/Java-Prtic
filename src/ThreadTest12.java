/*
	t1�Mt2
	
	�����s�{�ҫ�:  t1�u�{����t1��, t2�u�{����t2��, ��ӽu�{�����֤]������.
	
	�P�B�s�{�ҫ�:  t1�u�{�Mt2�u�{����, ��t1�u�{������t2�u�{���浲������, t1�u�{�~�����, �o�O�P�B�s�{�ҫ�
	
	�ƻ�ɭԭn�P�B?	������n�ޤJ�u�{�P�B?
		1.���F�ƾڪ��w��, �������ε{�Ǫ��ϥβv���C, ���O���F�O�ҼƾڬO�w����,�����[�J�u�{�P�B����
		�u�{�P�B����ϵ{���ܦ��F(���P)��u�{
		
		2.�ƻ����U�n�ϥνu�{�P�B?
			�Ĥ@: �����O�h�u�{����
			�ĤG: �h�u�{���Ҧ@�ɦP�@�Ӽƾ�
			�ĤT: �@�ɪ��ƾگA�Ψ�ק�ާ@
	
	
	�H�U�{�Ǻt�ܨ��ڨҤl, �H�U�{�Ǥ��ϥνu�{�P�B����,�h�u�{
	�P�ɹ�P�@�ӱb��i����ھާ@
	
 */
public class ThreadTest12 {

	public static void main(String[] args) {
		
		//�Ыؤ@�Ӥ��@���b��
		Account01 act = new Account01("act-001",5000.0);
		
		//�Ыؽu�{��P�@�ӱb�����
		//Porcessor10 p = new Porcessor10(act);
		
		Thread t1 = new Thread(new Porcessor10(act));
		Thread t2 = new Thread(new Porcessor10(act));
		
		t1.start();
		
		t2.start();
		
		
	}
}

//���ڽu�{
class Porcessor10 implements Runnable{
	
	//�b��
	Account01 act;
	
	//Constructor
	public Porcessor10(Account01 act) {
		
		this.act = act;
	}
	
	
	@Override
	public void run() {
		
		act.withdraw(1000.0);
		System.out.println("����1000.0���\, �l�B:" + act.getBalance());
	}
}



//�b��
class Account01 {
	
	private String actno;
	
	private double balance;
	
	public Account01() {
		
	}
	
	public Account01(String actno,double balance) {
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
	public void withdraw(double money) { //���e�b����ھާ@
		
		double after = balance-money;
		
		//����
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//��s
		this.setBalance(after);
		
	}
}