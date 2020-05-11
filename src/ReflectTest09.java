import java.lang.reflect.Constructor;

/*
	獲取某個特定的構造方法, 然後創建對象
 */
public class ReflectTest09 {

	public static void main(String[] args) throws Exception{
		
		//1. 創建類
		Class c = Class.forName("Customer01");
		
		//2. 獲取特定的構造方法
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		
		//3. 創建對象
		Object o = con.newInstance("張三",25);
		System.out.println(o);
	}
}
class Customer01{
	
	String name;
	int age;
	
	public Customer01(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		
		return "Customer01["+name+","+age+"]";
	}
}