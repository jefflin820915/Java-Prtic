/*
 * 冒泡排序算法:
 * int類型的數組 :	3 1 6 2 5
 * 
 * 		冒泡排序:
 * 	
 */
public class BobbleSort {

		public static void main(String[] args) {
			
			int[] a = {3,1,6,2,5};
			
			//開始排序
			
			for (int i = 4; i > 0 ; i--) {
				for (int j = 0; j < i; j++) {
					if(a[j] > a[j+1]) {
						//交換位置
						int temp;
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
				
			}
	
				//遍歷
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
}

/*
	1. 原數據是
	3 1 6 2 5
 	
 	第一次循環:
	1 3 6 2 5
	1 3 6 2 5
	1 3 2 6 5
	1 3 2 5 6
	
	1 3 2 5
	第二次循環:
	1 3 2 5
	1 2 3 5
	1 2 3 5
	
	1 2 3
	第三次循環:
	1 2 3
	1 2 3
	
	1 2
	第四次循環:
	1 2
 */