import java.io.FileInputStream;

//循環讀取

public class FileInputStream04 {

	public static void main(String[] args) throws Exception{
	
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		
		//循環讀取
		byte[] bytes = new byte[1024]; //每次讀取1kb
		
		
		/*
		while(true) {
			int temp = fis.read(bytes);
			if(temp==-1) {
				break;  
			}
		
			System.out.print(new String(bytes,0,temp));
			//將byte數組中有效的數據轉換成字符串
		}
		*/
		
		//升級循環
		int temp = 0;
		while((temp=fis.read(bytes))!=-1) {
			System.out.print(new String(bytes,0,temp));
		}
		fis.close();
		
	}
}
