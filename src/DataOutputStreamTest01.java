import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
	java.io.DataOutputStream /�ƾڦr�`��X�y
	
	�i�H�N���s����"int i = 10;" �g�J��w�L���
	�g�i�h�����O�r�Ŧ�, �g�i�h���O�G�i��ƾ�
	�a����.
*/
public class DataOutputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//�Ыؼƾڦr�`��X�y
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/abcccc"));
		
		//�ǳƼƾ�
		byte b  = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		
		//�g
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		
		//��s
		dos.flush();
		
		//����
		dos.close();
	}
}
