import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * finally語句塊是一定會執行的,所以通常在程序中
 * 為了保證某資源一定會釋放,所以一般在finally語句塊中釋放資源
 */
public class Exception10 {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("Exception10.java");
			
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
			
		}finally {
		
		//為了保證資源一定會釋放	
		if(fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		}
	}
}
