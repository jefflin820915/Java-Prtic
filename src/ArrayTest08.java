import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * 關於數組的拷貝
 * 
 * 以下程序講解的是JDK中提供好的方法, 直接調用即可
 */
public class ArrayTest08 {
	
	public static void main(String[] args) {
		
		/*int[] src = {2,3,4,5,6,7,8};
		
		int[] dest = {10,11,12,13,14,15,16};
		
		//把src中的4,5,6拷貝到dest數組從13開始
		System.arraycopy(src, 2, dest, 3, 3);
		
		//編歷
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