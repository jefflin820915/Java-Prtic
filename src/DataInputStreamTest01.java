import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.file.attribute.DosFileAttributes;

/*
	DataInputStream
 */
public class DataInputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		
		//�Ыؿ�J�y
		DataInputStream dis = new DataInputStream(new FileInputStream("D:/abcccc"));
		
		//Ū
		//�`�N: �n�ϥθ�Ū���ƾ�,�������e���D�Ӥ�󤤼ƾڪ��s�x�榡����
		//Ū�����ǥ����M�g�J�����ǬۦP
		
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
		
		//����
		dis.close();
		
	}
}
