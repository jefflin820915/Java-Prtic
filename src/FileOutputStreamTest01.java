import java.io.FileOutputStream;

/*
	java.io.OutputStream;
		java.io.FileOutputStream; ���r�`��X�y
		
		�N�p������s�����ƾڼg�J�w�L���
 */
public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
		//1.�Ыؤ��r�`��X�y
		//�ԷV�ϥ�,�|�N���󪺤��e�л\
		//fos = new FileOutputStream("C:/Users/TEST/Desktop/abcefghij.txt"); //�Ӥ�󤣦s�b�h�۰ʳЫ�
		
		//�w�l�[���覡�g�J
		fos = new FileOutputStream("C:/Users/TEST/Desktop/abcefghij.txt",true);
		
		//2.�}�l�g
		String msg = "HellowWorld";
		
		//�NString�ഫ��byte�Ʋ�
		byte[] bytes = msg.getBytes();
		
		//�Nbyte�Ʋդ��Ҧ��ƾڥ����g�J
		//fos.write(bytes);
		
		//�Nbyte�Ʋժ��@�����g�J
		fos.write(bytes,0,3);
		
		
		//���˳̫᪺�ɭԬ��F�O�Ҽƾڧ����g�J�w�L, �ҥH�n��s
		fos.flush();
		
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			//����
			if(fos!=null) {
				try {
				fos.close(); 
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
