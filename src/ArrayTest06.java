/*
 * ��k�եΪ��ɭ�, �]�i�H�o�˶ǻ��@�ӼƲ�.
 */
public class ArrayTest06 {
	
	public static void main(String[] args) {
		
		//�Ĥ@�ؤ覡
		int[] a = {12,3,4,5,6}; 
		m1(a);
		
		//�ĤG�ؤ覡
		m1(new int[] {32,5,6,7,8,9,10});
	}
	public static void m1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}



}
