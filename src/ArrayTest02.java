/*
 * 數組中存儲元素的類型是統一的, 每個元素在內存中所佔的
 * 空間大小是相同的,知道數組的首元素的內存地址, 要查找的元素只要
 * 知道下標就可以快速的計算出偏移量, 通過首元素內存地址加上偏移量
 * 快速計算出要查找元素的內存地址, 通過內存地址快速定位該元素,
 * 所以數組查找元素的效率較高.
 * 
 * 隨機的對數組進行增刪元素, 當增加元素的時候, 為了保證數組中元素
 * 在空間存儲上是有序的, 所以被添加元素位置後面的所有元素都要向後移動.
 * 刪除元素也是, 後面所有的元素要向前移動, 所以數組的增刪元素效率很低.
 * 
 * 初始化一維數組有兩種方式:
 * 	1.靜態初始化
 * 	2.動態初始化
 */
public class ArrayTest02 {
	
	public static void main(String[] args) {
		
		//靜態初始化一個int類型的一維數組
		int[] a1  = {10,12,31};
	
		//取得第一個元素
		System.out.println("第一個元素" + a1[0]);
		System.out.println("最後一個元素" + a1[2]);
		System.out.println("最後一個元素" + a1[a1.length-1]);
		
		//取得個數
		System.out.println("數組中元素的個數是" + a1.length);
		
		//遍歷一維數組
		for(int i=0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
	
		//將第二個元素修改成100
		a1[1] = 100;
		System.out.println("-----------------");
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	
	
	
	
	
	
	
	}
}
