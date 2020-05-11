
public class Buffered_File_ReaderTest {

	public static void main(String[] args) {
		
		/*
		//1.創建 被裝飾者
		
		FileReader fr = new FileReader();
		
		//2.創建裝飾者 
		
		BufferedReader br = new BufferedReader(fr);
		*/
		
		BufferedReader br = new BufferedReader(new FileReader());
		//3.通過裝飾者中的方法間接去執行被裝飾者中的方法
		
		br.close();
	}
}
