import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	�����󪺽ƻs�߶K
*/
public class Copy01 {

	public static void main(String[] args) throws Exception{
		
		//�Ыؿ�J�y
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		//�Ыؿ�X�y
		FileOutputStream fos = new FileOutputStream("D:/abcefg.txt");
		
		//�@��Ū, �@��g
		byte[] bytes = new byte[1024]; //1kb
		
		int temp = 0;
		while((temp=fis.read(bytes))!=-1) {
			//�Nbyte�Ʋդ����s�����g�J
			fos.write(bytes,0,temp);
		}
		
		
		
		//��s
		fos.flush();
		
		//����
		fis.close();
		fos.close();
	}
}
