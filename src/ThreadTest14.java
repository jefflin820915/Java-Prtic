/*
	
	以下程序演示取款例子, 以下程序使用線程同步機制保證數據的安全.
	
 */
public class ThreadTest14 {

	public static void main(String[] args) {
		
		//創建一個公共的帳戶
		Account03 act = new Account03("act-001",5000.0);
		
		//創建線程對同一個帳戶取款
		//Porcessor10 p = new Porcessor10(act);
		
		Thread t1 = new Thread(new Porcessor12(act));
		Thread t2 = new Thread(new Porcessor12(act));
		
		t1.start();
		
		t2.start();
	
	}
}

//取款線程
class Porcessor12 implements Runnable{
	
	//帳戶
	Account03 act;
	
	//Constructor
	public Porcessor12(Account03 act) {
		
		this.act = act;
	}
	
	
	@Override
	public void run() {
		
		act.withdraw(1000.0);
		System.out.println("取款1000.0成功, 餘額:" + act.getBalance());
	}
}



//帳戶
class Account03 {
	
	private String actno;
	
	private double balance;
	
	public Account03() {
		
	}
	
	public Account03(String actno,double balance) {
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
	
	//對外提供一個取款的方法
	//synchronized關鍵字添加到成員方法上, 線程拿走的也是this的對象鎖
	public synchronized void withdraw(double money) { //對當前帳戶取款操作
		
		//把需要同步的代碼放到同步語句塊中
		
		/*
			原理: t1線程和t2線程
			t1線程執行到此處,遇到了sychronized的關鍵字, 就會去找this的對象鎖
			如果找到this對象鎖, 則進入同步語句塊中執行程序, 當同步語句塊中的代碼
			執行結束之後, t1線程歸還this對象鎖
			
			在t1線程執行同步語句塊的過程中,  如果t2線程也過來執行以下代碼, 也遇到
			synchronized關鍵字, 所以也去找this的對象鎖, 但是該對象鎖被t1線程持有,
			只能在這等待this對象鎖的歸還
		*/
			
		double after = balance - money;
		
		//延遲
		try {
		Thread.sleep(1000);
		}catch(Exception e) {
		}
		
		//更新
		this.setBalance(after);
	}
}