/*
 * 二分法查找
 *  	1. 二分法查找是建立已經排序的基礎之上的
 *  	2. 已下程序分析從小到大排序
 *  	3. 這個數組中沒有重複的元素
 *  
 *  	1 3 5 9 11 13 56
 *  
 *   	以上已經是排好序的int類型的數組, 要求快速找出13這個元素的下標.
 
 *		int begin = 0;
 *		int end = 6;
 *		int mid = 3;
 *		中間元素是9, 9<13
 *
 *		begin = mid + 1 ;  4
 *		end = 6;
 *		mid = 5;
 *		中間元素是13, 13==13
 *
 */
public class MyArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,4,5,7,8,9,10,23,25,29};
		
		int destElement = 10;
		  
		//要求從a數組中查找10這個元素的下標
		int index = binarySearch(a,destElement); //如果找到則返回元素的下標, 如果找不到統一返回 -1
		
		System.out.println((index==-1)? destElement + "元素不存在" : destElement+"在數組中的下標是" + index);
	}
	
	//折半查找算法核心算法
	private static int binarySearch(int[] a, int destElement) {
		
		int begin = 0;
		int end = a.length-1;
		
		
		
		while (begin <= end) {
			
			int mid =(begin + end)/2;
			
			if (a[mid]==destElement) {
				return mid;
			}else if(a[mid]>destElement) {
				end = mid - 1;
				
			}else if(a[mid] < destElement) {
				begin = mid + 1;
			}
		}
		return -1;
	}
}
