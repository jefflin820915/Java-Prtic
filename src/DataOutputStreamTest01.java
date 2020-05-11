import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
	java.io.DataOutputStream /數據字節輸出流
	
	可以將內存中的"int i = 10;" 寫入到硬盤文件中
	寫進去的不是字符串, 寫進去的是二進制數據
	帶類型.
*/
public class DataOutputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//創建數據字節輸出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/abcccc"));
		
		//準備數據
		byte b  = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		
		//寫
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		
		//刷新
		dos.flush();
		
		//關閉
		dos.close();
	}
}
