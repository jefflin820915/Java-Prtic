import java.text.SimpleDateFormat;
import java.util.Date;

/*
	獲取Class類型的對象之後, 可以創建該"類"的對象
 */
public class ReflectTest03 {

	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("Employee");
		
		//創建此Class對象所表示的類的一個新實例
		 
		Object o = c.newInstance(); //調用Employee的無參數構造方法
		
		System.out.println(o); //Employee@15db9742
	
		Class c1 = Class.forName("java.util.Date");
		Object o1 = c1.newInstance();
		
		if(o1 instanceof java.util.Date) {
			Date t = (Date)o1;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:ss SSS").format(t));
		}
	
	}
}
