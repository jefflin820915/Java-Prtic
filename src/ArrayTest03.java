/*
 * 動態初始化一維數組
 * 	1.動態初始化一維數組, 會先在堆內存中分配這個數組, 並且在數組中每一個元素都採用默認值
 * 	byte,short,int,long	0
 * 	float,double	0.0	
 * 	boolean		false
 * 	char	\u0000
 * 	引用		null
 */
public class ArrayTest03 {
	
	public static void main(String[] args) {
		
		//動態聲明一個int類型的數組, 最多可以存儲4個元素
		int[] a1 = new int[4];
		
		//遍歷
		for (int i = 0; i < a1.length; i++) {
			
			System.out.println(a1[i]);
		}
		
		//賦值
		a1[0] = 21;
		a1[1] = 22;
		a1[2] = 23;
		a1[3] = 24;
		
		//遍歷
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	
		//引用類型的數組
		Object[] objs = new Object[3];	
	
		for (int index = 0; index < objs.length; index++) {
			Object o = objs[index];
			//o.toString(); //注意空指針異常, 因為引用類型的數組默認值是null
			System.out.println(o); // null null null
		}
	
	}
}
