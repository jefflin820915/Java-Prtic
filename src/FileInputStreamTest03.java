import java.io.FileInputStream;

/*
	int read(byte[] bytes)
	Ū�����e�b���s���ǳƤ@��byte�Ʋ�, �C��Ū���h�Ӧr�`�s�x��byte�Ʋդ�.
	�@��Ū���h�Ӧr�`, ���O��r�`Ū���F.
	
	�Ĳv��.
 */
public class FileInputStreamTest03 {

	public static void main(String[] args) throws Exception{
		
		//1.�Ыؿ�J�y
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		//2.�}�lŪ
		//�ǳƤ@��byte�Ʋ�
		
		byte[] bytes = new byte[3]; //�C�@���̦hŪ���T�Ӧr�`
		
		//int read(byte[] bytes); �Ӥ�k��^��int�������ȥN���O, �o������h�֭Ӧr�`
		
		
		
		
		int i1 = fis.read(bytes); //3
		System.out.println(new String(bytes)); //abc
		
		
		int i2 = fis.read(bytes); //3
		System.out.println(new String(bytes)); //def
		
		int i3 = fis.read(bytes); //1
		//System.out.println(new String(bytes)); //gef
		System.out.println(new String(bytes,0,i3)); //g
		
		int i4 = fis.read(bytes); //-1 �w�g��F������, ��^-1
		
		
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		//3.����
		fis.close();
		
	}
}
