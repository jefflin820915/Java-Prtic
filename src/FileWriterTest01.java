import java.io.FileWriter;

/*
	java.io.Writer;
		java.io.OutputStreamWriter; 轉換流(字節輸出流-->字符輸出流)
			java.io.FileWriter 文件字符輸出流
 */
public class FileWriterTest01 {

	public static void main(String[] args) throws Exception{
		
		/*創建文件字
		FileWriter  fw = new FileWriter(file);

		//
		*///創建文件字
				//FileWriter  fw = new FileWriter(file); //覆蓋

		
				//創建文件字
				FileWriter  fw = new FileWriter("C:/Users/TEST/Desktop/temp03",true);	//追加
				
				//開始寫
				fw.write("李海波");
				
				//將char數組的一部分寫入
				char[] chars = {'我','是','你','她','他'};				
				
				fw.write(chars,0,5);
				
				//刷新
				fw.flush();
				
				//關閉
				fw.close();
	}

}