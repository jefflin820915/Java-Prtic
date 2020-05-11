import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
	接收用戶鍵盤輸入 
 */
public class BufferedReaderTest03 {

	public static void main(String[] args) throws Exception{
		
		/*
		//以前的方式
		Scanner s = new Scanner(System.in); //System.in是一個標準的輸入流, 可以默認接收鍵盤的輸入
		
		//程序執行到此處停下來, 等待用戶的輸入
		String str = s.next();
		
		System.out.println("你輸入了" + str);
		*/
		
		//使用BufferedReader用來接收用戶的輸入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//接收輸入(每一次都接收一行)
		String str = br.readLine();
	
		System.out.println("你輸入了" + str);
		
		//關閉
		br.close();
	
	}
}
