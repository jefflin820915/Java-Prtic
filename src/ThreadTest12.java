/*
	t1和t2
	
	異部編程模型:  t1線程執行t1的, t2線程執行t2的, 兩個線程之間誰也不等誰.
	
	同步編程模型:  t1線程和t2線程執行, 當t1線程必須等t2線程執行結束之後, t1線程才能執行, 這是同步編程模型
	
	甚麼時候要同步?	為什麼要引入線程同步?
		1.為了數據的安全, 儘管應用程序的使用率降低, 但是為了保證數據是安全的,必須加入線程同步機制
		線程同步機制使程序變成了(等同)單線程
		
		2.甚麼條件下要使用線程同步?
			第一: 必須是多線程環境
			第二: 多線程環境共享同一個數據
			第三: 共享的數據涉及到修改操作
	
	
	以下程序演示取款例子, 以下程序不使用線程同步機制,多線程
	同時對同一個帳戶進行取款操作
	
 */
public class ThreadTest12 {

	public static void main(String[] args) {
		
		//創建一個公共的帳戶
		Account01 act = new Account01("act-001",5000.0);
		
		//創建線程對同一個帳戶取款
		//Porcessor10 p = new Porcessor10(act);
		
		Thread t1 = new Thread(new Porcessor10(act));
		Thread t2 = new Thread(new Porcessor10(act));
		
		t1.start();
		
		t2.start();
		
		
	}
}

//取款線程
class Porcessor10 implements Runnable{
	
	//帳戶
	Account01 act;
	
	//Constructor
	public Porcessor10(Account01 act) {
		
		this.act = act;
	}
	
	
	@Override
	public void run() {
		
		act.withdraw(1000.0);
		System.out.println("取款1000.0成功, 餘額:" + act.getBalance());
	}
}



//帳戶
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
	
	//對外提供一個取款的方法
	public void withdraw(double money) { //對當前帳戶取款操作
		
		double after = balance-money;
		
		//延遲
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//更新
		this.setBalance(after);
		
	}
}