import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
	�ϧǦC��
 */
public class ObjectInputStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//1.�ЫؤϧǦC�Ƭy
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/aabbccddee"));
		
		//2.�ϧǦC��
		Object o = ois.readObject();
		
		System.out.println(o); //User[name=�B�w��]
		
		//����
		ois.close();
		
	}
}
