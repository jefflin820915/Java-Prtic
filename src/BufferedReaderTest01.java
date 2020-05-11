import java.io.BufferedReader;
import java.io.FileReader;

/*	
 	字節
	BufferedInputStream;
	BufferedOutputStream;
	
	字符
	BufferedReader; 帶有緩衝區的字符輸入流
	BufferedWriter;	帶有緩衝區的字符輸出流
 */
public class BufferedReaderTest01 {

	public static void main(String[] args) throws Exception{
		
		//創建一個帶有緩衝區的字符輸入流
		/*
		FileReader fr = new FileReader("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest01.java"); //創建一個文件字符輸入流
		BufferedReader br = new BufferedReader(fr); //將文件輸入流包裝成帶有緩衝區的字符輸入流
		*/
		//根據流出現的位置, 流又可以分為: 包裝流或者處理流 和 節點流
		//FileReader fr是一個節點流
		//BufferedReader br 是一個包裝流,或者處理流
	
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest01.java"));
	
		//開始讀
		String temp = null;
		while((temp=br.readLine())!=null) { //br.readLine()方法讀取一行, 但是行尾不帶換行符
			System.out.println(temp); //輸出一行
		}
		
		
		//關閉
		//注意: 關閉的時候只需要關閉最外層的包裝流 (這裡有一個裝飾者模式)
		br.close();
	
	}
}
