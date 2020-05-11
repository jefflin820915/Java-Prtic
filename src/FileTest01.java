import java.io.File;

/*
	java.io.File;
		1.File類和流無關, 不能通過該類完成文件的讀和寫
		2.File是文件和目錄路徑名的抽象表示形式
	
	File代表的是硬盤上的Directory和File
 */
public class FileTest01 {

	public static void main(String[] args) throws Exception{
		
		//path相對路徑
		File f1 = new File("D:/aaaa.txt");
		
		File f2 = new File("C:/");
		
		File f3 = new File("D:/");
		
		System.out.println(f1.exists()); //true
		System.out.println(f2.exists()); //true
		System.out.println(f3.exists()); //true
	
		File f4 = new File("D:/TT");
		System.out.println(f4.exists()); //false
		
		//如果不存在則以目錄的形式創建
		if(!f4.exists()) {
			
			//創建目錄
			//f4.mkdir();
			
			//創建文件
			f4.createNewFile();
		}
	
	File f5 = new File("D:/a/b/c/d/e/f/g");
	
	if(!f5.exists()) {
		//創建多重目錄
		f5.mkdirs();
	}
	
	}
}
