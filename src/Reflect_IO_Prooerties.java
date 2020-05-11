import java.io.FileReader;
import java.util.Properties;

/*
	
 */
public class Reflect_IO_Prooerties {

	public static void main(String[] args) throws Exception{
		
		//1. 創建屬性對象
		Properties p = new Properties();
		
		//2. 創建流
		FileReader fr = new FileReader("C:\\Users\\TEST\\Desktop\\classinfo.properties");
		
		//3. 加載
		p.load(fr);
		
		//4. 關閉流
		fr.close();
		
		//通過key獲取value
		String className = p.getProperty("className");
		
		//System.out.println(className);
	
		//通過反射機制創建對象
		Class c = Class.forName(className);
		
		//創建對象
		Object o = c.newInstance();
		
		System.out.println(o);
	}
}
