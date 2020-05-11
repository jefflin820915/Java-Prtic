import java.lang.reflect.Field;

/*
	java.lang.reflect.Field; 獲取某個指定的屬性
	
 */
public class ReflectTest05 {

	public static void main(String[] args) throws Exception{
		
		/*
		//以前的方式
		ReflectTest04_User u = new ReflectTest04_User();
		u.age = 12; //set
		System.out.println(u.age); //get
		*/
		
		
		//獲取類
		Class c = Class.forName("ReflectTest04_User");
		
		//獲取某個特定的
		Field idF = c.getDeclaredField("id"); 
		
		
		//獲取到某個特定的屬性可以用來 set, get
		Object o = c.newInstance();
		
		//打破封裝
		idF.setAccessible(true); //使用反射機制可以打破封裝性, 導致java對象的屬性不安全
		
		
		//給o對象的id屬性賦值"110"
		idF.set(o, "110"); //set
		
		//get
		System.out.println(idF.get(o));
	}
}
