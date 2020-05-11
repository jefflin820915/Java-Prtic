import java.io.FileInputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) throws Exception{
		
		//1.創建流
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		System.out.println(fis.available()); //7
		
		System.out.println(fis.read()); //97
		
		//int available();返回流中剩餘的估計字節數
		System.out.println(fis.available()); //6
		
		//跳過2個字節
		fis.skip(2);
		
		System.out.println(fis.read()); //100
		
		
		//關閉
		fis.close();
		
	}
}
