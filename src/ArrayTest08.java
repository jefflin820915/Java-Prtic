import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * ����Ʋժ�����
 * 
 * �H�U�{�����Ѫ��OJDK�����Ѧn����k, �����եΧY�i
 */
public class ArrayTest08 {
	
	public static void main(String[] args) {
		
		/*int[] src = {2,3,4,5,6,7,8};
		
		int[] dest = {10,11,12,13,14,15,16};
		
		//��src����4,5,6������dest�Ʋձq13�}�l
		System.arraycopy(src, 2, dest, 3, 3);
		
		//�s��
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		*/
	
		int[] a = {1,2,3,4,5};
		int[] b = new int[a.length];
	
		
		for (int i = 0;  i < a.length; i++) {
			b[i] = a[i];
			System.out.println(a[i]);
	}

	
}


}