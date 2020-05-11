import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
	BufferedReader
	
	File 4
	Buffered 4
	
	InputStream 轉換流
	Out
 */
public class BufferedReaderTest02 {

	public static void main(String[] args) throws Exception{
		
		/*
		//創建帶有緩衝區的字符輸入流
		//文件字節輸入流
		FileInputStream fis = new FileInputStream("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest02.java");
		
		//轉換流(將字節流轉換成字符流)
		InputStreamReader isr = new InputStreamReader(fis); //isr字符流
		
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//以上統一成一句
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest02.java")));
		
		//開始讀
		String temp = null;
		 
		while((temp=br.readLine())!= null) {
			System.out.println(temp);
		}
		
		
		//關閉, 關閉最外層的流即可(裝飾者模式)
		
	
	}
}
