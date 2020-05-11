/*
	
 */
public class ReflectTest02 {

	public static void main(String[] args) throws Exception{
		
		//將A.class文件裝載到JVM中的過程
		Class.forName("A01");
	
		//不會執行靜態語句塊
		//Class c = A01.class;
	
		A01 a = new A01();
		
		Class c = a.getClass();
		
	}
}

class A01{
	
	static {
		System.out.println("A01....") ;
	}
	
}

