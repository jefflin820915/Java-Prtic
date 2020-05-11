import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
	反序列化
 */
public class ObjectInputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.創建反序列化流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/aabbccddee"));
		
		//2.反序列化
		Object o = ois.readObject();
		
		System.out.println(o); //User[name=劉德華]
		
		//關閉
		ois.close();
		
	}
}
