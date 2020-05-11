import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIOTest02 {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/user.DBF"));
		
		System.out.println(ois.readObject());
		
		ois.close();
		
		
	}
}
//Exception in thread "main" java.io.InvalidClassException: ObjetIOUser; 
//local class incompatible: stream classdesc serialVersionUID = 8308883760975496240, 
//local class serialVersionUID = 7613532954802680372