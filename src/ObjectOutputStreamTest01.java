import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/* 
	java.io.ObjectOutputStream;	序列化JAVA對象到硬盤 (Serial)
	java.io.ObjectInputStream; 將硬盤中的數據反序列化到JVM內存 (Deserial)
	
	Compile 編譯 (java->class)
	Decompile 反編譯(class->java)
	
	
 */
public class ObjectOutputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.創建java對象
		
		ObjectOutputStreamUser u1 = new ObjectOutputStreamUser("劉德華");
		
		//2.創建輸出流(序列化流) (JVM中的java對象狀態保存在硬盤中)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/aabbccddee"));
		
		//3.寫
		oos.writeObject(u1);
		
		//刷新
		oos.flush();
		
		//關閉
		oos.close();
		
		
		
		
	}
}
