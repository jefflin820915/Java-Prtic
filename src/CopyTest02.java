import java.io.FileReader;
import java.io.FileWriter;

/*
	文件複製
	只能複製純文本文件
*/
public class CopyTest02 {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("C:/Users/TEST/eclipse-workspace/123/src/CopyTest02.java");
		FileWriter fw = new FileWriter("D:/CopyTest02.java");
		
		char[] chars = new char[512];
		int temp = 0;
		while((temp=fr.read(chars))!=-1) {
			//寫
			fw.write(chars, 0, temp);
		}
		
		fw.flush();
		fr.close();
		fw.close();
		
	}
}
