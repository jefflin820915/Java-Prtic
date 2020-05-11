import java.text.SimpleDateFormat;
import java.util.Date;

/*
	Date d = new Date(); ����t�η�e�ɶ�
 	Date d = new Date(long millis);
 */
public class DateTest04 {

	public static void main(String[] args) {
		
		//1000�O��1970-1-1 00:00:00 000���@���
		java.util.Date t1  = new java.util.Date(1000);
		
		//Date -> String
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		
		
		
		//�_�ʪF�ڰ�
		System.out.println(sdf.format(t1)); //1970-1-1 08:00:01 000
		
		//�����e�t�ήɶ����e10�������ɶ�
		
		Date t2 = new Date(System.currentTimeMillis()-600000);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		System.out.println(sdf1.format(t2)); // 2020,01,13 18:19:20 377
	}
	
}
