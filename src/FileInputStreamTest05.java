import java.io.FileInputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) throws Exception{
		
		//1.�Ыجy
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		System.out.println(fis.available()); //7
		
		System.out.println(fis.read()); //97
		
		//int available();��^�y���Ѿl�����p�r�`��
		System.out.println(fis.available()); //6
		
		//���L2�Ӧr�`
		fis.skip(2);
		
		System.out.println(fis.read()); //100
		
		
		//����
		fis.close();
		
	}
}
