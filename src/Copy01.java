import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	關於文件的複製粘貼
*/
public class Copy01 {

	public static void main(String[] args) throws Exception{
		
		//創建輸入流
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		//創建輸出流
		FileOutputStream fos = new FileOutputStream("D:/abcefg.txt");
		
		//一邊讀, 一邊寫
		byte[] bytes = new byte[1024]; //1kb
		
		int temp = 0;
		while((temp=fis.read(bytes))!=-1) {
			//將byte數組中內存直接寫入
			fos.write(bytes,0,temp);
		}
		
		
		
		//刷新
		fos.flush();
		
		//關閉
		fis.close();
		fos.close();
	}
}
