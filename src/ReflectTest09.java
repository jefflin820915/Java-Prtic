import java.lang.reflect.Constructor;

/*
	����Y�ӯS�w���c�y��k, �M��Ыع�H
 */
public class ReflectTest09 {

	public static void main(String[] args) throws Exception{
		
		//1. �Ы���
		Class c = Class.forName("Customer01");
		
		//2. ����S�w���c�y��k
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		
		//3. �Ыع�H
		Object o = con.newInstance("�i�T",25);
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