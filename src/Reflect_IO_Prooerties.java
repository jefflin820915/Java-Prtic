import java.io.FileReader;
import java.util.Properties;

/*
	
 */
public class Reflect_IO_Prooerties {

	public static void main(String[] args) throws Exception{
		
		//1. �Ы��ݩʹ�H
		Properties p = new Properties();
		
		//2. �Ыجy
		FileReader fr = new FileReader("C:\\Users\\TEST\\Desktop\\classinfo.properties");
		
		//3. �[��
		p.load(fr);
		
		//4. �����y
		fr.close();
		
		//�q�Lkey���value
		String className = p.getProperty("className");
		
		//System.out.println(className);
	
		//�q�L�Ϯg����Ыع�H
		Class c = Class.forName(className);
		
		//�Ыع�H
		Object o = c.newInstance();
		
		System.out.println(o);
	}
}
