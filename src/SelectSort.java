/*
  選擇排序:
  	3 1 6 2 5
  	
  	算法: 找出最小值, 然後這個最小值和最前面的數據交換位置.
 */
public class SelectSort {
	
	public static void main(String[] args) {
		
		int[] a = {3,1,6,2,5};
		
		//選擇排序
		for (int i = 0; i < a.length-1; i++) {
			
			//假設第一個數據為最小值
			//紀錄最小值元素的下標
			int min = i;
			
			for(int j=i+1; j<a.length;j++ ) {
				
				if(a[min]>a[j]) {
					//給min重新賦值
					min = j;
				}
			}
			//考慮交換位置.
			if(min != i) {
				int temp;
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	
		//輸出
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}
}

/*

 3 1 6 2 5
 
 第一次循環:
1 3 6 2 5

3 6 2 5 
第二次循環:
2 6 3 5

6 3 5
第三次循環:
3 6 5

6 5
第四次循環:
5 6

*/