import java.io.FileReader;

/*
	java.io.Reader;
		java.io.InputStreamReader; �ഫ�y(�r�`��J�y�ഫ���r�ſ�J�y) 
			java.io.FileReader; ���r�ſ�J�y
 */
public class FileReaderTest01 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
		
		//�Ыؤ��r�ſ�J�y
		fr = new FileReader("C:/Users/TEST/eclipse-workspace/123/src/FileReaderTest01.java");
		
		
		//�}�lŪ
		char[] chars = new char[512]; //1kb
		
		int temp = 0;
		
		while((temp=fr.read(chars))!=-1) {
			
			//�Nchar�Ʋ��ഫ���r�Ŧ�
			System.out.print(new String(chars,0,temp));
		}
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			
			if(fr!=null) {
			
				try {
				fr.close();
				
				}catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}
	}
}
