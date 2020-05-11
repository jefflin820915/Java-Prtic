import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Exception06 {
	
	//編譯無法通過
	//IOException沒有處理
	/*public static void main(String[] args) throws FileNotFoundException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();	
	}*/

	
	//通過
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();

	}*/


	//通過
	/*
	public static void main(String[] args) throws IOException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();
}*/
	
	
	
	
public static void main(String[] args){
		
	try {
		
		//程序在執行到此處發生了FileNotFoundException類型的異常
		//JVM會自動創建一個FileNotFoundException類型的對象,將該對象的內存地址賦值給catch語句塊中的e變數
		FileInputStream fis = new FileInputStream("abc");
		
		//上面代碼出現異常, try語句塊的代碼不再繼續執行,直接進入catch語句塊中執行
		System.out.println("TTTTTT");
		
		fis.read();
		
	}catch (FileNotFoundException e) { //e內存地址指向堆中的那個對象是"FileNotFoundException種類
		
		System.out.println("讀取文件不存在");
		
		//FileNotFoundException將Object中的toString方法重寫了
		System.out.println(e);//java.io.FileNotFoundException: abc (系統找不到指定的檔案。)
		
	}catch (IOException e) {
		System.out.println("其他IO異常");
		
		}
	System.out.println("abc");
	}
}
