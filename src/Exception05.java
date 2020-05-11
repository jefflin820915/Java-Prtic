import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 處理異常的第二種方式: 捕捉..  try....catch..
 
 *	語法:
 *		try{
 		可能出現異常的代碼;
 		
 		}catch (異常類型1 變數) {
 			
 			處理異常的代碼;
 		
 		}catch(異常類型2 變數){
 			
 			處理異常的代碼
 		
 		}.....
 *	
 *	1. catch語句塊可以寫多個
 *	2. 但是從上到下catch, 必須從小類型異常到大類型異常進行捕捉
 *	3. try...catch中最多執行1個catch語句塊,執行結束之後 try...catch就結束
 */

public class Exception05 {
	public static void main(String[] args) {
		
		//以下代碼編譯無法通過, 因為FileNotFoundException沒有處理
		/*
		try {
			
			//FileNotFoundException
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			
		} catch (ArithmeticException e) {//捕獲的異常是算數異常
			// TODO: handle exception
		}*/
	
		
		//編譯通過
		/*
			try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
			
				
			} catch (FileNotFoundException e) {
		}*/
	
		
		//以下程序無法通過
		//因為還有更多的IOException沒有處理
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
			
				fis.read();
				
			} catch (FileNotFoundException e) {
	
	
			}*/
		
		
		
		//編譯可以通過
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
				
			}catch (FileNotFoundException e) {
	
	
			}catch (IOException e) {

			}*/
		
		
		//編譯通過
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
	
			}catch (IOException e) {

			}*/
		
		

		//編譯無法通過
		//catch可以寫多個,但必須從上到下, 從小到大捕捉
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
	
			}catch (IOException e) {

			}catch (FileNotFoundException e) {
		}*/
		
	}
}