import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//�ǦC��
public class ObjectIOTest {

	public static void main(String[] args) throws Exception{
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/user.DBF"));
		
		ObjetIOUser u = new ObjetIOUser("JACK"); //ObjectIOUser.class
		
		oos.writeObject(u);
		
		oos.flush();
		
		oos.close();
		
	}
}
