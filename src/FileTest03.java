import java.io.File;

/*
	�ϥλ��k, ��X�ؿ��U�Ҧ����l�ؿ��H�Τl���.
	
	//�NC:\\Users\\TEST\\eclipse-workspace\\123�Ҧ��ƾڽƻs��D�L�U
 */
public class FileTest03 {

	public static void main(String[] args) {
		
		
		//D:/course
		File f = new File("C:\\Users\\TEST\\eclipse-workspace\\123");
		
		//�եΤ�k�����d��
		method1(f);
		
	}

	public static void method1(File f) {
		
		if(f.isFile()) {
			return;
		}
		
		//f����إi��, f�i��O���, �]�i��O�ؿ�
		
		//����@�ؿ�
		File[] fs = f.listFiles();
		
		for(File subF:fs) {
			System.out.println(subF.getAbsolutePath());
			method1(subF);
		}
		
	}

}
