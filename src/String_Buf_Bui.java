/*
	java.lang.StringBuffer;
	java.lang.StringStringBuilder;
	
		1.StringBuffer和StringBuilder是甚麼?
			是一個字符串緩衝區
			
		2.工作原裡
			預先在內存中申請一塊空間,以容納字符系列
			如果預留的空間不夠用,則進行自動擴容,以容納更多的字符系列
			
		3.StringBuffer,StingBuilder和String最大的區別是甚麼
			String是不可變的字符系列, 存儲在字符串常數池中
			StringBuffer底層是一個char數組, 但是char數組是可變的,並且可以自動擴容
			
		4.StringBuffer和StringBuilder的默認初始化容量是16
		
		5.如何優化StingBuffer和StringBuilder
			最好在創建StringBuffer之前, 預測StringBuffer的存儲數量,
			然後再創建StringBuffer的時候採用指定初始化容量的方式創建StringBuffer
			為了減少底層數組的拷貝, 提高效率
		
		6.StringBuffer和StringBuilder的區別
			
			StringBuffer是線程安全的 (可以在多線程的環境下使用不會出現問題)
			StringBuilder是非線程安全的 (在多線程環境下使用可能出現問題)
 */
public class String_Buf_Bui {

	public static void main(String[] args) {
		
		//創建字符串緩衝區對象
		StringBuffer sb = new StringBuffer();  //16
	
		//可以向StringBuffer中追加字符串
		String[] ins = {"體育","音樂","睡覺","美食"};
		
		//推薦字符串頻繁拼接使用StringBuffer或者StringBuilder
		for (int i = 0; i < ins.length; i++) {
			
			if(i==ins.length-1) {
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
	
		System.out.println(sb);
	
	}
	
}
