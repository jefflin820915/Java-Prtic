/*
  ���ϥλ��k, �p��1~N���D�M[�i�H���λ��k, �ɶq���λ��k]
 */
public class RecursionTest02 {
public static void main(String[] args) {
	
	/*
	//1~4���M
	int n = 4;
	
	int sum = 0;
	for (int i = 0; i <= 4; i++) {
		sum += i;
		}
	System.out.println(sum);
	*/
		
	//�����եΤ�k�Y�i
	int n = 4;
	int retValue = sum(n);
	System.out.println(retValue);
	
	n = 10;
	retValue = sum(n);
	System.out.println(retValue);




}
	//��W�w�q�@�Ӥ�k, �o�O�@�ӿW�ߥ\��, �i�H����1~N���D�M
	public static int sum(int n) {
		
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += i;
		}
		return result;
	}


}

