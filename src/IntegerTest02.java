/*
 	以java.lang.Integer:類型為例,講解八種數據類型
 */
public class IntegerTest02 {
	
	public static void main(String[] args) {
		
		//獲取int類型最大值跟最小值
		System.out.println("int最小值: " + Integer.MIN_VALUE);
		System.out.println("int最大值: " + Integer.MAX_VALUE);
		
		//以int推byte
		System.out.println("byte最小值: " + Byte.MIN_VALUE);
		System.out.println("byte最大值: " + Byte.MAX_VALUE);
	
	
		//創建Integer類型的對象
		Integer i1 = new Integer(10); //int -> Integer
		Integer i2 = new Integer("123"); // String -> Integer
	
		System.out.println(i1); //10
		System.out.println(i2); //123
		
		//以下程序可以通過, 但報錯
		//雖然可以將字符串轉換成Integer類型,但是該字符串也必須是"數字字符串"
		//Integer i3 = new Integer("abcdr"); //java.lang.NumberFormatException
	}
}
