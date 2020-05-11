import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
	java.io.PrintStream; 標準的輸出流, 默認打印到控制台, 以字節方式
	java.io.PrintWriter; 以字符的方式
 */
public class PrintStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//默認是輸出到控制台的
		System.out.println("HellowWorld");
		
		PrintStream ps = System.out;
		
		ps.println("JAVA....");

		//可以改變輸出方向
		System.setOut(new PrintStream(new FileOutputStream("D:/log"))); //log日誌文件
		
		//再次輸出
		//System.out.println("HAHA");
		
		//通常使用上面的這種方式記錄日誌
		//需求: 記錄日誌, m1方法開始執行的時間和結束的時間. 紀錄到log文件中
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("m1方法開始執行的時間" + sdf.format(new Date()));
		m1();
		System.out.println("m1方法執行結束" + sdf.format(new Date()));
		
		
	}
	
	public static void m1() {
		System.out.println("m1 method execute");
	}


}
