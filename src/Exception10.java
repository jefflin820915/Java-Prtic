import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * finally�y�y���O�@�w�|���檺,�ҥH�q�`�b�{�Ǥ�
 * ���F�O�ҬY�귽�@�w�|����,�ҥH�@��bfinally�y�y��������귽
 */
public class Exception10 {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("Exception10.java");
			
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
			
		}finally {
		
		//���F�O�Ҹ귽�@�w�|����	
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
