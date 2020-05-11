
public class Account {
	
	private String aotno;
	private double balance;
	
	public Account() {
		super();
	}
	
	public Account(String aotno, double balance) {
		super();
		this.aotno = aotno;
		this.balance = balance;
	}
	
	public String getAotno() {
		return aotno;
	}
	
	public void setAotno(String aotno) {
		this.aotno = aotno;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

}