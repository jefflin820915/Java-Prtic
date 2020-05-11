import java.text.SimpleDateFormat;
import java.util.Date;

/*
	Date d = new Date(); 獲取系統當前時間
 	Date d = new Date(long millis);
 */
public class DateTest04 {

	public static void main(String[] args) {
		
		//1000是自1970-1-1 00:00:00 000的毫秒數
		java.util.Date t1  = new java.util.Date(1000);
		
		//Date -> String
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		
		
		
		//北京東巴區
		System.out.println(sdf.format(t1)); //1970-1-1 08:00:01 000
		
		//獲取當前系統時間的前10分鐘的時間
		
		Date t2 = new Date(System.currentTimeMillis()-600000);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		System.out.println(sdf1.format(t2)); // 2020,01,13 18:19:20 377
	}
	
}
