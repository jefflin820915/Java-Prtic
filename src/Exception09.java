/*
 * �`�Jfinally�y�y��
 */
public class Exception09 {
	
	public static void main(String[] args) {
		
		int i = m1();
		System.out.println(i); //10
		
	}


	public static int m1(){
		
		int i = 10;
		try {
			
			return i;
		
		} finally {
			// TODO: handle finally clause
		
			i++;
			
			System.out.println("m1��i =" + i); //11
		}
		
		
		
	}
	
	
	//�H�W�N�X�������z
	/*
	int i = 10;
	try {
		
		int temp = i;
		
		return temp;
	
	} finally {
		// TODO: handle finally clause
	
		i++;
		
		System.out.println("m1��i =" + i);
	}*/
}
