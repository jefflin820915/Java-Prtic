import java.io.FileWriter;

/*
	java.io.Writer;
		java.io.OutputStreamWriter; �ഫ�y(�r�`��X�y-->�r�ſ�X�y)
			java.io.FileWriter ���r�ſ�X�y
 */
public class FileWriterTest01 {

	public static void main(String[] args) throws Exception{
		
		/*�Ыؤ��r
		FileWriter  fw = new FileWriter(file);

		//
		*///�Ыؤ��r
				//FileWriter  fw = new FileWriter(file); //�л\

		
				//�Ыؤ��r
				FileWriter  fw = new FileWriter("C:/Users/TEST/Desktop/temp03",true);	//�l�[
				
				//�}�l�g
				fw.write("�����i");
				
				//�Nchar�Ʋժ��@�����g�J
				char[] chars = {'��','�O','�A','�o','�L'};				
				
				fw.write(chars,0,5);
				
				//��s
				fw.flush();
				
				//����
				fw.close();
	}

}