/*
	在java語言中實現多線程第一個方式,
		
		第一步: 繼承java.lang.Thread;
		第二步: 重寫run方法
 	
 	三個知識點
 		如何定義線程
 		如何創建線程
 		如何啟動線程
 */
public class ThreadTest02 {

	public static void main(String[] args) {
		
		//創建線程
		
		Thread t = new Processor();
		
		//啟動
		t.start(); //這段代碼執行瞬間結束, 告訴JVM再分配一個棧給t線程
				  //run方法不需要手動調用, 系統線程啟動之後自動調用run方法
		
		//t.run(); 這是普通方法調用, 這樣做程序只有一個線程, run方法結束之後, 下面的程序才能繼續執行
		
		
		//這段代碼在主線程中運行
		for (int i = 0; i < 10; i++) {
			System.out.println("main->" + i );
		}
		
		//有了多線程之後, main方法結束只是主線程棧中沒有方法棧幀了
		//但是其他線程或其他棧中還有棧幀.
		//main方法結束程序可能還在運行
	}
}

//定義一個線程
class Processor extends Thread{
	
	//重寫run方法
	@Override
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			System.out.println("run->" + i);
		}
	}
	
}