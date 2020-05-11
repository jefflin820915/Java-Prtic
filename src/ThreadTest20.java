/*
	兩個線程對1個共享的數據操作
	
	t1和t2兩個線程對同一個線程操作
	t1輸出1個, t1喚醒其他的線程, t1等待, 
	t2輸出1個
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
//共享數據
class Num{
	
	int count;
	
	public Num(int count) {
		
		this.count = count;
	}

	//提供打印奇數的方法
	/*
		t1線程執行該方法, 拿走num對象的對象鎖,
		並且輸出 t1->1, 喚醒t2線程, 雖然t2線程被喚醒,
		t2線程並不會馬上執行, 因為t2線程無法獲取
		到對象鎖. 當printOdd方法執行到this.wait();,
		t1線程無期限的等待, printOdd方法結束, 釋放對象鎖.
		t2線程獲取到對象鎖, 開始執行printEven方法
	 */
	public synchronized void printOdd() {
		
		System.out.println(Thread.currentThread().getName()+"-->" + count++);
		this.notifyAll();
		try {
			Thread.sleep(1000);
			this.wait(); //t1線程無期限的等待
	}catch(Exception e) {
		
	}
}
	
	//提供打印偶數的方法
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

//線程1
class PrintOdd implements Runnable{
	
	Num num;
	
	public PrintOdd(Num num) {
		this.num = num;
	}
	
	public void run() {
		
		while(true) {
		//打印奇數	
		num.printOdd();
		}
	}
}

//線程2
class PrintEven implements Runnable{
	Num num;
	
	public PrintEven(Num num) {
		this.num = num;
		
	}
	
	public void run() {
		
		while(true) {
		//打印偶數
		num.printEven();
		}
	}
}