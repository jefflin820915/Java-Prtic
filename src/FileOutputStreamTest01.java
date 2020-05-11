import java.io.FileOutputStream;

/*
	java.io.OutputStream;
		java.io.FileOutputStream; 文件字節輸出流
		
		將計算機內存中的數據寫入硬盤文件中
 */
public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
		//1.創建文件字節輸出流
		//謹慎使用,會將原文件的內容覆蓋
		//fos = new FileOutputStream("C:/Users/TEST/Desktop/abcefghij.txt"); //該文件不存在則自動創建
		
		//已追加的方式寫入
		fos = new FileOutputStream("C:/Users/TEST/Desktop/abcefghij.txt",true);
		
		//2.開始寫
		String msg = "HellowWorld";
		
		//將String轉換成byte數組
		byte[] bytes = msg.getBytes();
		
		//將byte數組中所有數據全部寫入
		//fos.write(bytes);
		
		//將byte數組的一部份寫入
		fos.write(bytes,0,3);
		
		
		//推薦最後的時候為了保證數據完全寫入硬盤, 所以要刷新
		fos.flush();
		
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			//關閉
			if(fos!=null) {
				try {
				fos.close(); 
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
