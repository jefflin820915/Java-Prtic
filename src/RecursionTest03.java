
/*
  	使用遞歸計算1~N的求和
  	--> 1 + 2 + 3 + 4
  	--> 4 + 3 + 2 + 1 : n的最初值是4, 建議採用這種方式
 */
public class RecursionTest03 {
public static void main(String[] args) {

	//1~4的和
	int n = 4;
	int reValue = sum(n);
	System.out.println(reValue);

}

	public static int sum(int n) {
		//4 + 3 + 2 + 1
		if(n==1) {
			return 1;
		}
		return n + sum(n-1);
		
	}
	


}

//n + sum(n-1)
//4 + sum(3)
//4 + 3 + 2 +sum(1)
//4 + 3 + 2 + 1