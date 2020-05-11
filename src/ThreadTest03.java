/*
	java中實現線程的第二種方式
		第一步: 寫一個類實現java.lang.Runnable;接口
		第二步: 實現run方法
 */
public class ThreadTest03 {

	public static void main(String[] args) {
		
		//創建線程
		Thread t = new Thread(new Processor01());
		
		
		//啟動
		t.start();
	
	}
}

//這種方式是推薦的, 因為一個類實現接口之外還保留了類的繼承
class Processor01 implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("run-->" + i);
		}
	}
} 