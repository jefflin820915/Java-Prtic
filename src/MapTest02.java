import java.util.Properties;

/*
	HashMap�q�{��l�Ʈe�q�O16, �q�{�[���]�l�O0.75
	Hashtable�q�{��l�ƬO11, �q�{�[���]�l�O0.75
	
	java.util.Properties;�]�O��key�Mvalue�զ�, ���O�`�Nkey�Mvalue���O�r�Ŧ�����
 
 */
public class MapTest02 {

	public static void main(String[] args) {
		
		//1.�Ыض��X
		Properties p = new Properties();
		
		//2.�s
		p.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("username", "Soott");
		
		//�`�Nkey���୫��, �p�G���ƫhvalue�л\.
		//p.setProperty("username", "bjpowernode");
		
		p.setProperty("password", "tiger");
		p.setProperty("url", "jdbc:oracle:thin:@192.168.1.100:1521:bjpowernode");
		
		//3.��, �q�Lkey���value
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
