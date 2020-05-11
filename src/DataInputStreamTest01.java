import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.file.attribute.DosFileAttributes;

/*
	DataInputStream
 */
public class DataInputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		
		//創建輸入流
		DataInputStream dis = new DataInputStream(new FileInputStream("D:/abcccc"));
		
		//讀
		//注意: 要使用該讀取數據,必須提前知道該文件中數據的存儲格式順序
		//讀的順序必須和寫入的順序相同
		
		byte b = dis.readByte();
		short s = dis.readShort();
		int i  = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(c);
		
		//關閉
		dis.close();
		
	}
}
