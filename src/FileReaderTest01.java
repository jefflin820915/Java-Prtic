import java.io.FileReader;

/*
	java.io.Reader;
		java.io.InputStreamReader; 轉換流(字節輸入流轉換成字符輸入流) 
			java.io.FileReader; 文件字符輸入流
 */
public class FileReaderTest01 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
		
		//創建文件字符輸入流
		fr = new FileReader("C:/Users/TEST/eclipse-workspace/123/src/FileReaderTest01.java");
		
		
		//開始讀
		char[] chars = new char[512]; //1kb
		
		int temp = 0;
		
		while((temp=fr.read(chars))!=-1) {
			
			//將char數組轉換為字符串
			System.out.print(new String(chars,0,temp));
		}
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			
			if(fr!=null) {
			
				try {
				fr.close();
				
				}catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
	}
}
