import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		
		//1.獲取絕對路徑
		File f1 = new File("ArrayTest01.jpg");
		
		String absolutePath = f1.getAbsolutePath();
		
		System.out.println(absolutePath);
		
		
		//2.獲取文件名
		System.out.println(f1.getName()); //ArrayTest01.java
	
		//3.獲取父路徑
		File f2 = new File("C:\\Users\\TEST\\eclipse-workspace\\123\\");
		String parentPath = f2.getParent();
		
		System.out.println(parentPath); //C:\Users\TEST\eclipse-workspace
		
		//4.判斷該File是Directory還是File
		System.out.println(f1.isDirectory());//false
		System.out.println(f1.isFile());//true
		
		//5.獲取文件最後一次修改時間
		java.util.Date t = new java.util.Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		
		//6.獲取文件的長度(字節數)
		System.out.println(f1.length());
		
		//7.列出子文件
		
		File f3 = new File("C:/Users/TEST/eclipse-workspace/123");
		 
		File[] fs = f3.listFiles();
		
		//遍歷
		for(File f:fs) {
			//System.out.println(f.getAbsolutePath());
			if(f.getAbsolutePath().endsWith(".txt")) {
			System.out.println(f.getAbsolutePath());
		
		}
		
	}
	}
}
