import java.util.Arrays;

/*
 * Arrays�OSUN���q���Ѫ��u����
 * 	
 * 	java.util.Arrays;
 * 		
 * 		�Ӥu�����D�n�w�諸�O�Ʋժ��ާ@
 * 		�Ƨ�, �G���d�䵥
 */
public class ArraysTest {
	
	public static void main(String[] args) {
		
		int[] a = {3,1,6,2,5};
		
		
		//�Ƨ�
		Arrays.sort(a);
		
		//��X
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
		//��ƧǤ��᪺�ƾڶi��G���d��
		int index = Arrays.binarySearch(a, 1); //0
		System.out.println(index);
	
	
	}
}
