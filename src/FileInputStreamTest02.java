import java.io.FileInputStream;

/*
	�H�U�{�Ǧs�b���I, �W�c�X�ݺϽL, �ˮ`�ϽL, �åB�Ĳv�C

 */
public class FileInputStreamTest02 {

	public static void main(String[] args) throws Exception{
		
		//1.�Ыجy
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/Quick_test.txt");
		
		//2.�}�lŪ
		/*
		while(true) {
			int temp = fis.read();
			if(temp==-1) {
				break;
			}
		*/
		
			int temp = 0;
			while((temp=fis.read())!= -1) {
				System.out.println(temp);
		}
		
		
		//����
		fis.close();
	}
}
