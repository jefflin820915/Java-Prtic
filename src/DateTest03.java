import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.tools.JavaCompiler;

/*
	獲取特定的日期
 */
public class DateTest03 {

	public static void main(String[] args) throws Exception {
		
		 String strTime = "2008年08月08日 08:08:08 888";
		 
		 //將String 日期轉換成日期類型Date
		 //String -> Date
		 
		 //1. 創建日期格式化對象
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS"); //格式不能隨意, 應該和上面的字符串格式相同
		 
		 //2. 將字符串轉換成日期類型
		 java.util.Date t = sdf.parse(strTime);
		 System.out.println(t); // Fri Aug 08 08:08:08 CST 2008
	
	}
}
