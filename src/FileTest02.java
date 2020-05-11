import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		
		//1.���������|
		File f1 = new File("ArrayTest01.jpg");
		
		String absolutePath = f1.getAbsolutePath();
		
		System.out.println(absolutePath);
		
		
		//2.������W
		System.out.println(f1.getName()); //ArrayTest01.java
	
		//3.��������|
		File f2 = new File("C:\\Users\\TEST\\eclipse-workspace\\123\\");
		String parentPath = f2.getParent();
		
		System.out.println(parentPath); //C:\Users\TEST\eclipse-workspace
		
		//4.�P�_��File�ODirectory�٬OFile
		System.out.println(f1.isDirectory());//false
		System.out.println(f1.isFile());//true
		
		//5.������̫�@���ק�ɶ�
		java.util.Date t = new java.util.Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		
		//6.�����󪺪���(�r�`��)
		System.out.println(f1.length());
		
		//7.�C�X�l���
		
		File f3 = new File("C:/Users/TEST/eclipse-workspace/123");
		 
		File[] fs = f3.listFiles();
		
		//�M��
		for(File f:fs) {
			//System.out.println(f.getAbsolutePath());
			if(f.getAbsolutePath().endsWith(".txt")) {
			System.out.println(f.getAbsolutePath());
		
		}
		
	}
	}
}
