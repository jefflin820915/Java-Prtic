import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
	日曆
 */
public class DateTest05 {

	
	public static void main(String[] args) throws Exception{
		
		//獲取系統當前的日曆
		
		Calendar c = Calendar.getInstance();
		
		//查看當前日曆的星期幾
		int i = c.get(Calendar.DAY_OF_WEEK);
		//int i  =  c.get(7);
		
		System.out.println(i); // 星期日看做第一天
	
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //14
		
		//獲取2008 8 8是星期幾
		
		//獲取2008 8 8的日曆
		String strTime = "2008,08,08";
		Date d = new SimpleDateFormat("yyyy,MM,dd").parse(strTime);
		
		//該日曆就是2008,08,08的日曆
		c.setTime(d);
		
		//獲取星期幾
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); //6
	
	}
}
