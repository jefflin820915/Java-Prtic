/*
 	�����ϥλ��k, �p��N������
 	5������:
 		5 * 4 *3 * 2 * 1
 */
/*
public class RecursionTest04 {
	public static void main(String[] args) {
		
		int n = 5;
		int reValue = method(n);
		System.out.println(reValue); //120
	}
	
		public static int method(int n) {
			int result = 1;
			for (int i = n; i > 0; i--) {
				result *= i;
			}
		
				return result;
		}
}*/

//���k�覡
public class RecursionTest04 {
	public static void main(String[] args) {
		
		int n = 5;
		int reValue = method(n);
		System.out.println(reValue); //120
	}
	
		public static int method(int n) {
			if(n==1){
				return 1;
				}
			return n * method(n -1);
		}
}

//