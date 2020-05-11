import java.text.SimpleDateFormat;

/*
	獲取系統當前時間
 */
public class DateTest02 {

	public static void main(String[] args) {
		
		//獲取系統當前時間
		java.util.Date nowTime = new java.util.Date();
		
		System.out.println(nowTime); //Mon Jan 13 16:32:09 CST 2020
		
		//以上程序說明了java.util.Date;已經重寫了Object中的toString方法
		//只不過重寫的結果是英文
		
		//所以引入"格式化"日期
		//java.util.Date; -> String
		
		/*
			日期格式:
				Y	年
				M	月
				d	日
				H	小時
				m	分
		 		s	秒
		 		S	毫秒
		 		
		*/
		//1. 創建日期格式化對象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		
		//2. 開始格式化(Date -> String)
		String strTime = sdf.format(nowTime);
		
		System.out.println(strTime); //2020年01月13日 17:11:12 520

		
	}
}
