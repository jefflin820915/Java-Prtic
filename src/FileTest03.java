import java.io.File;

/*
	使用遞歸, 找出目錄下所有的子目錄以及子文件.
	
	//將C:\\Users\\TEST\\eclipse-workspace\\123所有數據複製到D盤下
 */
public class FileTest03 {

	public static void main(String[] args) {
		
		
		//D:/course
		File f = new File("C:\\Users\\TEST\\eclipse-workspace\\123");
		
		//調用方法完成查找
		method1(f);
		
	}

	public static void method1(File f) {
		
		if(f.isFile()) {
			return;
		}
		
		//f有兩種可能, f可能是文件, 也可能是目錄
		
		//先當作目錄
		File[] fs = f.listFiles();
		
		for(File subF:fs) {
			System.out.println(subF.getAbsolutePath());
			method1(subF);
		}
		
	}

}
