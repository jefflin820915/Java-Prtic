/*
 *  數組:
 *  	1.數組是一個引用類型,
 *  	
 *  	2.數組是一種簡單的數據結構, 線性的數據結構
 *  	
 *  	3.數組是一個容器, 可以用來存儲其他元素.
 *  	數組是可以存儲任意數據類型的元素.
 
 *		4.數組分為, 一維數組, 二維數組, 三維數組, 多維數組
 
 *		5.數組中存儲的元素類型是是統一的
 *
 		6.數組長度不可改變,數組一旦創建長度是不可變的,固定的
 		 
 *
 */
public class ArrayTest01 {
	
	public static void main(String[] args) {
		
		//聲明一個一維數組,用來存儲int類型
		int[] a1 = {100,200,150,300};//這種方式稱作"靜態初始化一維數組"
		
		//boolean類型的數組
		boolean[] b1 = {true,false,true};
		
		//String類型數組
		String[] s1 = {"AB","CD","EF"};
		
		//byte類型數組
		byte[] b2 = {1,2,3};
		
		//char類型數組
		char[] c1 = {'a','b','c'};
		
		//object類型數組
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		Object[] objs = {o1,o2,o3};
		
	}
}
