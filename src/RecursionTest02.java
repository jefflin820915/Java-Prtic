/*
  不使用遞歸, 計算1~N的求和[可以不用遞歸, 盡量不用遞歸]
 */
public class RecursionTest02 {
public static void main(String[] args) {
	
	/*
	//1~4的和
	int n = 4;
	
	int sum = 0;
	for (int i = 0; i <= 4; i++) {
		sum += i;
		}
	System.out.println(sum);
	*/
		
	//直接調用方法即可
	int n = 4;
	int retValue = sum(n);
	System.out.println(retValue);
	
	n = 10;
	retValue = sum(n);
	System.out.println(retValue);




}
	//單獨定義一個方法, 這是一個獨立功能, 可以完成1~N的求和
	public static int sum(int n) {
		
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += i;
		}
		return result;
	}


}

