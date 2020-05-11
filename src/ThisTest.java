
public class ThisTest {
	
	//實例變數(引用.的方式訪問)
	int num = 10;
	
	//帶有static的方法
	//JVM負責調用main方法, JVM怎麼調用
	//ThisTest.main(String[]);
	public static void main(String[] args) {
		
		//沒有當前對象this
		
		//以下代碼意思
		//訪問當前對象num屬性
		
		//System.out.println(num);//編譯錯誤
		
		//System.out.println(this.num);//錯誤
		
		//想訪問num怎麼辦
		ThisTest tt = new ThisTest();
		System.out.println(tt.num);
		
	}
}
