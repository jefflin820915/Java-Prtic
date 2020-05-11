import java.util.Date;

/*
	獲取Class類型對象的三種方式
 */
public class ReflectTest01 {

	public static void main(String[] args) throws Exception{
		
		//第一種方式:
		Class c1 = Class.forName("Employee"); //c1引用保存內存地址指向堆中的對象, 該對象代表的是Employee,class整個類
		
		//第二種方式:
		//java中每個類型都有 class 屬性.
		Class c2 = Employee.class;
		
		//第三種方式:
		//java語言中任何一個java對象都有 getClass 方法
		Employee e = new Employee();
		Class c3 = e.getClass(); //c3是運行時類 (e的運行時類是Employee)
		
		//因為Employee這個類在JVM中只有一個, 所以c1,c2,c3的內存地址是相同的, 指向堆中唯一的一個對象
		System.out.println(c1==c2); //true
		System.out.println(c2==c3); //true
		
		//c4 c5 c6都代表Date這個類	
		Class c4 = Date.class; //c4代表 Date這個類
		
		Class c5 = Class.forName("java.util.Date"); //必須寫類全名, 類全名帶有包名
		
		Date d = new Date();
		Class c6 = d.getClass();
		
		System.out.println(c4==c5); //true
		System.out.println(c5==c6); //true
		
		//c7代表 int類型
		Class c7 = int.class;
	}
}