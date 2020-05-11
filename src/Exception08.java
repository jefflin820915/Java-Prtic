import java.io.FileInputStream;

/*
 * 關於finally語句塊
 * 	1.finally語句塊可以直接與try語句塊聯用. try....finally..
 * 	2.try...catch...finally 也可以
 * 	3.在finally語句塊中的代碼一定會執行的
 */
public class Exception08 {
	
	public static void main(String[] args) throws Exception{
		
		/*try {
		
		System.out.println("ABC");
		return;
				
		}finally {
				
			System.out.println("Test");
		}*/
		
		/*
		try {
			
			FileInputStream fis = new FileInputStream("Test.java");
			
			//不會執行
			System.out.println("TTT");
			
		} finally {
		
			//會執行
		System.out.println("AAAA");
		}*/
	
	
		//只要在執行finally語句塊之前退出JVM, 則finally語塊不會執行
		try {
			
			//退出JVM
			System.exit(0);
			
		} finally {
		
			//不會執行
			System.out.println("AAAA");
		}
	}
}
