import java.io.FileInputStream;

/*
	int read(byte[] bytes)
	讀取之前在內存中準備一個byte數組, 每次讀取多個字節存儲到byte數組中.
	一次讀取多個字節, 不是單字節讀取了.
	
	效率高.
 */
public class FileInputStreamTest03 {

	public static void main(String[] args) throws Exception{
		
		//1.創建輸入流
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		//2.開始讀
		//準備一個byte數組
		
		byte[] bytes = new byte[3]; //每一次最多讀取三個字節
		
		//int read(byte[] bytes); 該方法返回的int類型的值代表的是, 這次獲取多少個字節
		
		
		
		
		int i1 = fis.read(bytes); //3
		System.out.println(new String(bytes)); //abc
		
		
		int i2 = fis.read(bytes); //3
		System.out.println(new String(bytes)); //def
		
		int i3 = fis.read(bytes); //1
		//System.out.println(new String(bytes)); //gef
		System.out.println(new String(bytes,0,i3)); //g
		
		int i4 = fis.read(bytes); //-1 已經到達文件尾端, 返回-1
		
		
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		//3.關閉
		fis.close();
		
	}
}
