/*
 * 深入finally語句塊
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
			
			System.out.println("m1的i =" + i); //11
		}
		
		
		
	}
	
	
	//以上代碼的執行原理
	/*
	int i = 10;
	try {
		
		int temp = i;
		
		return temp;
	
	} finally {
		// TODO: handle finally clause
	
		i++;
		
		System.out.println("m1的i =" + i);
	}*/
}
