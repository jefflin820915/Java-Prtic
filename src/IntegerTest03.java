/*
	關於Integer中常用的方法
 */
public class IntegerTest03 {

	public static void main(String[] args) {
		
		//int -> Integer
		//基本數據類型 -> 引用數據類型
		Integer i1 = new Integer(10); //int -> Integer
		
		//將Integer-->int
		//引用類型-->基本類型
		int i2 = i1.intValue();
		
		System.out.println(i2 + 1); //11
		
		//重要: static int parseInt(String s);
		//String -> int
		int age = Integer.parseInt("25");
		System.out.println(age+1); //26
		
		
		//"abc"這個字符串必須是數字字符串才行
		//int price = Integer.parseInt("abc"); //java.lang.NumberFormatException
		
		
		//重要: static double parseDouble(String s);
		double price = Double.parseDouble("3.0");
		System.out.println(price+1.0); //4.0
		
		//將int類型的十進制轉換成2進制
		
		String s1 = Integer.toBinaryString(10);
		System.out.println(s1); //1010
		
		//將int類型的十進制轉換成16進制
		String s2 = Integer.toHexString(10);
		System.out.println(s2); //a
		
		//將int類型的十進制轉換成8進制
		String s3 = Integer.toOctalString(10);
		System.out.println(s3); //12
		
		//int -> Integer
		Integer i3 = Integer.valueOf(10);
		
		//String -> Integer
		Integer i4 = Integer.valueOf("10");
		
		System.out.println(i3);
		System.out.println(i4);
	
		
	}
}
