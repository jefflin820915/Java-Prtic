import java.io.File;

/*
	java.io.File;
		1.File���M�y�L��, ����q�L�����������Ū�M�g
		2.File�O���M�ؿ����|�W����H��ܧΦ�
	
	File�N���O�w�L�W��Directory�MFile
 */
public class FileTest01 {

	public static void main(String[] args) throws Exception{
		
		//path�۹���|
		File f1 = new File("D:/aaaa.txt");
		
		File f2 = new File("C:/");
		
		File f3 = new File("D:/");
		
		System.out.println(f1.exists()); //true
		System.out.println(f2.exists()); //true
		System.out.println(f3.exists()); //true
	
		File f4 = new File("D:/TT");
		System.out.println(f4.exists()); //false
		
		//�p�G���s�b�h�H�ؿ����Φ��Ы�
		if(!f4.exists()) {
			
			//�Ыإؿ�
			//f4.mkdir();
			
			//�Ыؤ��
			f4.createNewFile();
		}
	
	File f5 = new File("D:/a/b/c/d/e/f/g");
	
	if(!f5.exists()) {
		//�Ыئh���ؿ�
		f5.mkdirs();
	}
	
	}
}
