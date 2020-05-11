/*
	Integer
	int
	String
	
	三種類型相互轉換
	
	
	
 */
public class IntegerTest04 {
	
	public static void main(String[] args) {
		
		//1. int -> Integer
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);
		
		//2. Integer -> int
		int i2 = i1.intValue(); 
		System.out.println(i2);
		
		//3. String -> Integer
		Integer i3 = Integer.valueOf("10");
		System.out.println(i3);
		
		//4. Integer -> String
		String s1 = i3.toString();
		System.out.println(s1);
		
		//5. String -> int
		int i4 = Integer.parseInt("1012");
		System.out.println(i4);
		
		//6. int -> String
		String s2 = 10 + "";
		System.out.println(s2);
	}
	
}
