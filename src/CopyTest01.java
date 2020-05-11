import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	d:/course -> c:/course
 */
public class CopyTest01 {

	public static void main(String[] args) {
		
		File f = new File("d:/course");
		
		method(f);
		
		
	}
	
	public static void method(File f) {
		
		//f是文件
		if(f.isFile()) {
			
			//拷貝
			// D:\course\Java\A.java
			// C:\course\Java\A.java
			String filePath = f.getAbsolutePath(); //獲取絕對路徑
			String newFilePath = "C" + filePath.substring(1);
			File parentFile = new File(newFilePath).getParentFile(); //C:\course\Java
			
			if(!parentFile.exists()) {
				parentFile.mkdirs();
			}
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			//為了保證關閉, 使用finally語句
			try {
				fis = new FileInputStream(filePath);
				fos = new FileOutputStream(newFilePath);
				
				//複製
				byte[] bytes = new byte[102400]; //100kb
				int temp = 0;
				while((temp=fis.read(bytes))!=-1) {
					fos.write(bytes,0,temp);
				}
				fos.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				//分別try..catch..
				if(fis!=null) {
					try {
					fis.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				if(fos!=null) {
					try {
					fos.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			return;
			
		}
		
		//f是目錄
		File[] fs = f.listFiles();
		for(File subF:fs) {
			//System.out.println(subF.getAbsolutePath());
			method(subF);
		
		}
		
	}
	
}
