import java.io.FileInputStream;
import java.util.Properties;

/*
	IO+Properties

	dbinfo這樣的文件我們稱作配置文件
	配置文件的作用就是: 使程序更加的靈活
	
	注意: 一般在程序中可變的東西不要寫死, 推薦寫到配置文件中
	運行同樣的程序得到不同的結果
	
	像dbinfo這樣一個具有特殊內容的配置文件我們又叫做: 屬性文件
	java規範中要求屬性文件以".properties"結束
	
	屬性文件中數據要求:
		key和value之間可以使用"空格", "冒號", "等號"
			如果"空格","等號","冒號"都有, 按最前面的作為分隔符
 */
public class IO_Properties01 {

	public static void main(String[] args) throws Exception{
		
		//1. 創建屬性對象
		Properties p = new Properties(); //和map一樣, 只不過key和value只能存儲字符串類型
										//key不能重複, 如果key重複則value覆蓋
		
		//2. 創建輸入流
		FileInputStream fis = new FileInputStream("C:\\Users\\TEST\\Desktop\\dbinfo.properties");
		
		//3. 將fis流中的所有數據加載到屬性對象中
		p.load(fis); //所以現在屬性對象中有(key=username=scott)
		
		//4. 關閉流
		fis.close();
		
		//5. 通過key獲取value
		String v1 = p.getProperty("driver");
		String v2 = p.getProperty("url");
		String v3 = p.getProperty("username");
		String v4 = p.getProperty("password");
		
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
