import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.IIOException;

/*
 * 處理異常有兩種方式: 
 * 	1. 聲明拋出	thorws
 * 	2.捕捉	try..catch
 * 
 * 以下程序演示第一種方式: 聲明拋出, 在方法聲明的位置上使用thorws關鍵字拋出異常
 */

public class Exception03 {
	//public static void main(String[] args) throws FileNotFoundException{
	//public static void main(String[] args) throws IOException{
	public static void main(String[] args) throws Exception{
		//創建文件輸入流,讀取文件
		//java編譯器如何知道以下代碼執行過程中出現異常,java編譯器是如何知道這個異常發生機率比較高呢
		//java便義氣不是那麼智能.因為:FIleImputStearm這個思路
		FileInputStream fis = new FileInputStream("C:/abc.txt");
}
}
//以上程序編譯不通過
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type FileNotFoundException

	at Exception03.main(Exception03.java:15)

*/