/*
 * 關於二維數組的動態初始化
 */
public class ArrayTest10 {
	
	public static void main(String[] args) {
		
		//3個一維數組
		//每個一維數組中有4個元素
		int[][] a = new int[3][4];
	
		//遍歷
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
			
			//賦值
		a[1][2] = 100;
		for (int  i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}	
				System.out.println();
		} 
	}
}
