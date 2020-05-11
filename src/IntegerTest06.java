/*
	深入自動裝箱和自動拆箱:
		1. 自動裝箱和自動拆箱是程序編程階段的一個概念
		和程序運行無關
 
 		2. 自動裝箱和自動拆箱主要目的是方便程序員
 */
public class IntegerTest06 {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//這裡不會有自動拆箱
		System.out.println(i1==i2); //false
		
		//比較兩個Integer類型的數據是否相等, 不能用"=="
		//Integer已經重寫了Object中的equals方法
		System.out.println(i1.equals(i2)); //true

		//重點:
		Integer i3 = 128;
		Integer i4 = 128;
		
		//上面等同於
		//Integer i3 = new Integer(128);
		//Integer i4 = new Integer(128);
		
		System.out.println(i3==i4); //false
	
		
		//注意以下程序
		//如果數據是在(-128~127)之間, java中引入了一個"整型常數池", 在方法區中
		//該整型常數池只存儲-128~127之間的數據
		Integer i5 = 127; //這個程序不會在堆中創建對象, 會直接從整型常數池中拿.
		Integer i6 = 127;
		
		System.out.println(i5==i6); //true
	
		Integer i7 = -128;
		Integer i8 = -128;
		
		System.out.println(i7==i8); //true
		
		Integer i9 = -129;
		Integer i10 = -129;
		
		System.out.println(i9==i10); //false
	}
	
}
