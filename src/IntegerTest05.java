/*
	JDK5.0新特性
		以下的特性適合JDK1.5版本之後的. 包括1.5 
		jdk1.4, 包括1.4在內之前的版本不能使用以下特性
		
		自動裝箱(auto_boxing)和自動拆箱(auto_unboxing)
 */
public class IntegerTest05 {

	public static void main(String[] args) {
		
		
		//JDK5.0之前的
		
		//int -> Integer(裝箱)
		Integer i1 = new Integer(10);
		
		//Integer -> int(拆箱)
		int i2 = i1.intValue();
		
		//JDK5.0之後, 包括5.0
		Integer i3 = 10; //自動裝箱
		int i4 = i3; //自動拆箱
	
		System.out.println(i3); //"10"
		System.out.println(i4+1); //11
	
		//JDK5.0之後
		m1(321); //自動裝箱
	
		System.out.println(m2(10, 5)+1);  //自動裝箱
	
	}
	
		public static void m1(Object o) {
			System.out.println(o);
		}

		public static int m2(Integer i1,Integer i2) {
			return i1-i2; //自動拆箱
		}
}
