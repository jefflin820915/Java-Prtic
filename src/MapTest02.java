import java.util.Properties;

/*
	HashMap默認初始化容量是16, 默認加載因子是0.75
	Hashtable默認初始化是11, 默認加載因子是0.75
	
	java.util.Properties;也是由key和value組成, 但是注意key和value都是字符串類型
 
 */
public class MapTest02 {

	public static void main(String[] args) {
		
		//1.創建集合
		Properties p = new Properties();
		
		//2.存
		p.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("username", "Soott");
		
		//注意key不能重複, 如果重複則value覆蓋.
		//p.setProperty("username", "bjpowernode");
		
		p.setProperty("password", "tiger");
		p.setProperty("url", "jdbc:oracle:thin:@192.168.1.100:1521:bjpowernode");
		
		//3.取, 通過key獲取value
		String vl = p.getProperty("driver");
		String v2 = p.getProperty("username");
		String v3 = p.getProperty("password");
		String v4 = p.getProperty("url");
		
		System.out.println(vl);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
	
}
