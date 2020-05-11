/*
	自定義泛型
 */
public class GenericTest05 {

	public static void main(String[] args) {
		
		GenericMyClass<String> mc = new GenericMyClass<String>();
		
		//泛型就是編譯期檢查類型
		//Error
		//mc.m1(100);
		
		mc.m1("JACK");
	}
}
//自定義泛型
class GenericMyClass<T>{
	
	public void m1(T t) {
		System.out.println(t);
	}
}