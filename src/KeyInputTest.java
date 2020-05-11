/*
   system.out.println();	負責向控制台輸出[內存到控制台][輸出的過程]
   
       接收用戶鍵盤輸入, 從"鍵盤"到"內存". [輸入的過程, 到內存中去]
 */
public class KeyInputTest {
	public static void main(String[] args) {
		
		//第一步: 創建鍵盤掃描器對象
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		//第二步: 用Scanner對象的next()方法開始接收用戶鍵盤輸入
		//程序執行到這裡會停下來等待用戶的輸入
		//當用戶輸入的時候, 並且最終敲回車鍵時, 鍵入的訊息會自動賦值給userInputContent
		//程序執行到這裡, 用戶輸入的訊息已經到內存中了
		//接收文本[以字符串形式接收]
		//String userInputContent = s.next(); //見名知意
		
		//接收數字[以整數型int的形式來接收] 
		int num = s.nextInt();
		
		//將內存中的數據輸出到控制台
		//System.out.println("您輸入了:" + userInputContent);
		System.out.println("您輸入的數字是:" + num);
		System.out.println("您輸入的數字是:" + (num + 100));
	}
}

/* 記住代碼,或著直接將代碼複製貼上
	第一步:
	java.util.Scanner s = new java.util.Scanner(System.in);
	第二步:
	String str = s.next();
	或
	int num = s.nextInt();

*/