import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	java.io.InputStream
		java.io.FileInputStream; 文件字節輸入流
		
		按照字節方式讀取文件.
 */
public class FileInputStreamTest01 {

	public static void main(String[] atgs) {
		
		FileInputStream fis = null;
		
		try {
		
			//1.要讀取某文件, 先與這個文件創建一個"輸入流"
		
		//文件路徑
		//String filePath = ""; //相對路徑, 相對當前而言, 在當前路徑下找
		
		String filePath = "C:/Users/TEST/Desktop/Quick_test.txt";
		fis = new FileInputStream(filePath);
		
		//2.開始讀
		
		int i1 = fis.read(); //已字節的方式讀取
		
		int i2 = fis.read(); 
		
		System.out.println(i1);
		System.out.println(i2);
		//如果已經讀取到文件的末尾, 就會返回-1
		
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		
		}catch(IOException e){
			
			e.printStackTrace();
			
		}finally {
			
			//為了保證流一定會釋放, 所以在finally語塊中執行
			
			if(fis!=null) {
				try {
				fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}
