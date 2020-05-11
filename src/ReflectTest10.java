/*
	關於類獲取父類和父接口
 */
public class ReflectTest10 {

	//通過反射機制獲取String類的父類和父接口
	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("java.lang.String");
		
		//獲取父類
		Class superClass = c.getSuperclass();
		
		System.out.println(superClass.getName());
		
		//獲取父接口
		Class[] ins = c.getInterfaces();
		
		for(Class in:ins) {
			System.out.println(in.getName());
		}
	}
}
