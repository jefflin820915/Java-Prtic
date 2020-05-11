import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 深入thorws
 */
public class ExceptionTest04 {
	public static void main(String[] args) throws FileNotFoundException{
		//m1();
		
		//使用thorws處理異常不是真正處理異常而是在推卸責任
		//誰調用就拋給誰
		//m1方法如果出現異常,因為採用上拋,給了JVM, JVM遇到這異常就會退出JVM, 下面的這個代碼不會執行
		//System.out.println("WS");
		
		//真正處理
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println("WWWOO");
		}
	}

	public static void m1() throws FileNotFoundException{
		m2();
	}


	public static void m2() throws FileNotFoundException{
		m3();
	}


	public static void m3() throws FileNotFoundException{
		new FileInputStream("C:/ab.txt"); //FileInputStream構造方法聲明位置上使用thorws(向上拋)
	}

}

/*
//在程序過程中發生了FileNotFoundException類型的異常
//JVM為我們創建一個FileNotFoundException類型的對象
//該對象中攜帶以下的訊息.
//JVM負責將該對象的訊息輸出到控制台
//並且JVM停掉了程序的運行

Exception in thread "main" java.io.FileNotFoundException: C:\ab.txt (系統找不到指定的檔案。)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at ExceptionTest04.m3(ExceptionTest04.java:28)
	at ExceptionTest04.m2(ExceptionTest04.java:23)
	at ExceptionTest04.m1(ExceptionTest04.java:18)
	at ExceptionTest04.main(ExceptionTest04.java:9)

*/