import java.io.FileInputStream;

/*
	以下程序存在缺點, 頻繁訪問磁盤, 傷害磁盤, 並且效率低

 */
public class FileInputStreamTest02 {

	public static void main(String[] args) throws Exception{
		
		//1.創建流
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/Quick_test.txt");
		
		//2.開始讀
		/*
		while(true) {
			int temp = fis.read();
			if(temp==-1) {
				break;
			}
		*/
		
			int temp = 0;
			while((temp=fis.read())!= -1) {
				System.out.println(temp);
		}
		
		
		//關閉
		fis.close();
	}
}
