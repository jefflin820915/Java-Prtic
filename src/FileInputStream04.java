import java.io.FileInputStream;

//�`��Ū��

public class FileInputStream04 {

	public static void main(String[] args) throws Exception{
	
		FileInputStream fis = new FileInputStream("C:/Users/TEST/Desktop/abcefg.txt");
		
		
		//�`��Ū��
		byte[] bytes = new byte[1024]; //�C��Ū��1kb
		
		
		/*
		while(true) {
			int temp = fis.read(bytes);
			if(temp==-1) {
				break;  
			}
		
			System.out.print(new String(bytes,0,temp));
			//�Nbyte�Ʋդ����Ī��ƾ��ഫ���r�Ŧ�
		}
		*/
		
		//�ɯŴ`��
		int temp = 0;
		while((temp=fis.read(bytes))!=-1) {
			System.out.print(new String(bytes,0,temp));
		}
		fis.close();
		
	}
}
