/*
	JDK5.0�s�S��
		�H�U���S�ʾA�XJDK1.5�������᪺. �]�A1.5 
		jdk1.4, �]�A1.4�b�����e����������ϥΥH�U�S��
		
		�۰ʸ˽c(auto_boxing)�M�۰ʩ�c(auto_unboxing)
 */
public class IntegerTest05 {

	public static void main(String[] args) {
		
		
		//JDK5.0���e��
		
		//int -> Integer(�˽c)
		Integer i1 = new Integer(10);
		
		//Integer -> int(��c)
		int i2 = i1.intValue();
		
		//JDK5.0����, �]�A5.0
		Integer i3 = 10; //�۰ʸ˽c
		int i4 = i3; //�۰ʩ�c
	
		System.out.println(i3); //"10"
		System.out.println(i4+1); //11
	
		//JDK5.0����
		m1(321); //�۰ʸ˽c
	
		System.out.println(m2(10, 5)+1);  //�۰ʸ˽c
	
	}
	
		public static void m1(Object o) {
			System.out.println(o);
		}

		public static int m2(Integer i1,Integer i2) {
			return i1-i2; //�۰ʩ�c
		}
}
