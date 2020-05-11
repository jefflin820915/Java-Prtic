import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 關於getMessage和printStackTrace方法的應用
 */
public class Exception07 {
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("C:/abc.txt");
			
			//JVM為我們執行了以下這段代碼
			//FileNotFoundException e = new FileNotFoundException(); //C:\abc.txt (系統找不到指定的檔案。)
			 
		}catch (FileNotFoundException e) {
			
			//輸出異常堆棧訊息
			//一般情況下都會使用該方式去調試程序 
			e.printStackTrace();
			
			/*
		java.io.FileNotFoundException: C:\abc.txt (系統找不到指定的檔案。)
			at java.io.FileInputStream.open0(Native Method)
			at java.io.FileInputStream.open(Unknown Source)
			at java.io.FileInputStream.<init>(Unknown Source)
			at java.io.FileInputStream.<init>(Unknown Source)
			at Exception07.main(Exception07.java:12)
			 */
		
			String msg = e.getMessage();
			System.out.println(msg); //C:\abc.txt (系統找不到指定的檔案。)
		
		
		}
		
		//這段代碼會執行
	System.out.println("ABC");
	
	
	
	
	}
}
