import java.util.Arrays;

/*
 * Arrays是SUN公司提供的工具類
 * 	
 * 	java.util.Arrays;
 * 		
 * 		該工具類主要針對的是數組的操作
 * 		排序, 二分查找等
 */
public class ArraysTest {
	
	public static void main(String[] args) {
		
		int[] a = {3,1,6,2,5};
		
		
		//排序
		Arrays.sort(a);
		
		//輸出
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
		//對排序之後的數據進行二分查找
		int index = Arrays.binarySearch(a, 1); //0
		System.out.println(index);
	
	
	}
}
