import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	java.io.InputStream
		java.io.FileInputStream; ���r�`��J�y
		
		���Ӧr�`�覡Ū�����.
 */
public class FileInputStreamTest01 {

	public static void main(String[] atgs) {
		
		FileInputStream fis = null;
		
		try {
		
			//1.�nŪ���Y���, ���P�o�Ӥ��Ыؤ@��"��J�y"
		
		//�����|
		//String filePath = ""; //�۹���|, �۹��e�Ө�, �b��e���|�U��
		
		String filePath = "C:/Users/TEST/Desktop/Quick_test.txt";
		fis = new FileInputStream(filePath);
		
		//2.�}�lŪ
		
		int i1 = fis.read(); //�w�r�`���覡Ū��
		
		int i2 = fis.read(); 
		
		System.out.println(i1);
		System.out.println(i2);
		//�p�G�w�gŪ�����󪺥���, �N�|��^-1
		
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		
		}catch(IOException e){
			
			e.printStackTrace();
			
		}finally {
			
			//���F�O�Ҭy�@�w�|����, �ҥH�bfinally�y��������
			
			if(fis!=null) {
				try {
				fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}
