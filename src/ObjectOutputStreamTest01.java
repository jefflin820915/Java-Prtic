import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/* 
	java.io.ObjectOutputStream;	�ǦC��JAVA��H��w�L (Serial)
	java.io.ObjectInputStream; �N�w�L�����ƾڤϧǦC�ƨ�JVM���s (Deserial)
	
	Compile �sĶ (java->class)
	Decompile �ϽsĶ(class->java)
	
	
 */
public class ObjectOutputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.�Ы�java��H
		
		ObjectOutputStreamUser u1 = new ObjectOutputStreamUser("�B�w��");
		
		//2.�Ыؿ�X�y(�ǦC�Ƭy) (JVM����java��H���A�O�s�b�w�L��)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/aabbccddee"));
		
		//3.�g
		oos.writeObject(u1);
		
		//��s
		oos.flush();
		
		//����
		oos.close();
		
		
		
		
	}
}
