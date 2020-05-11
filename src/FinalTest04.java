
public class FinalTest04 {
	
	public static void main(String[] args) {
		System.out.println(Chinese.GUC_JI);
		System.out.println("圓周率" + Math.PI);
	}
}

class Math{
	
		public static final double PI = 3.1415926;
	
}
//中國人類
class Chinese{
	
	//國籍
	//每個人的國籍都是中國,而且不會發生改變, 為了防止國籍被修改,建議加final修飾
	//final修飾的實例變數不可變的,一般聯合static一起使用,被稱為"常數"
	//常數的定義語法格式是 public static final 類型 常數名 = 值;
	//java規範中要求所有常數的名字全部大寫,每個單詞之間使用下划線分開/連接
	
	//static final String country = "中國";
	
	public static final String GUC_JI = "中國";
	
}