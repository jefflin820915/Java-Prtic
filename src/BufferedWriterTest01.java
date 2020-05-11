import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
	BufferedWriter
 */
public class BufferedWriterTest01 {

	public static void main(String[] args) throws Exception{
		
		//創建帶有緩衝區的字符輸出流
		//BufferedWriter bw = new BufferedWriter(new FileWriter("D:/aaaa.txt"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/aaaa.txt",true)));
		 
		//開始寫
		bw.write("奧運!");
		
		//寫入一個行分隔符
		bw.newLine();
		
		bw.write("希望");
		
		//刷新
		bw.flush();
		
		//關閉
		bw.close();
	}
}
