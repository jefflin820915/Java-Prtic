/*
 * 二維數組的特點:
 * 	1.二維數組是一個特殊的一維數組
 * 	2.特殊的一維數組, 特殊在這個一維數組中每一個元素都是一維數組
 */
public class ArrayTest09 {
	
	public static void main(String[] args) {
		
		//靜態初始化二維數組
		int[][] a = {
						{1,2,3},
						{33,43},
						{0},
						{12,455,24,99}
					};
	
		//以上這個數組有多少個一維數組
		System.out.println(a.length);
		
		//獲取第一個一維數組
		int[] a0 =  a[0];
		int a00 = a0[0];
		System.out.println(a00);
		
		//獲取第一個一維數組中第一個元素
		System.out.println(a[0][0]);
	
		//獲取最後一個一維數組中最後一個元素
		System.out.println(a[3][3]);
		
		System.out.println(a[a.length-1][a[a.length-1].length-1]);
		
		//遍歷二維數組
		//縱向循環在外
		for(int i=0;i<a.length;i++) {
			//對一維數組a[i]進行遍歷
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
	
}
