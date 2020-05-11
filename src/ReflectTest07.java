
import java.lang.reflect.Method;

/*
	獲取某個特定的方法, 通過反射機制執行
	
	以前:
		CustmerService cs = new CustmerService();
		boolean isSuccess = cs.login("admin",123);
		
	通過反射機制
	
	
 */
public class ReflectTest07 {

	public static void main(String[] args) throws Exception{
		
		//1. 獲取類
		Class c = Class.forName("CustomerService02");
		
		//2. 獲取某個特定的方法
		//通過: 方法名+形參列表
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//通過反射機制執行login方法
		Object o = c.newInstance();
		
		//調用o對象的m方法, 傳遞"admin""123"參數, 方法的執行結果是retValue
		Object retValue = m.invoke(o, "admin","123");
		
		System.out.println(retValue); //true
	}
}
