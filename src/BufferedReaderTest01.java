import java.io.BufferedReader;
import java.io.FileReader;

/*	
 	�r�`
	BufferedInputStream;
	BufferedOutputStream;
	
	�r��
	BufferedReader; �a���w�İϪ��r�ſ�J�y
	BufferedWriter;	�a���w�İϪ��r�ſ�X�y
 */
public class BufferedReaderTest01 {

	public static void main(String[] args) throws Exception{
		
		//�Ыؤ@�ӱa���w�İϪ��r�ſ�J�y
		/*
		FileReader fr = new FileReader("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest01.java"); //�Ыؤ@�Ӥ��r�ſ�J�y
		BufferedReader br = new BufferedReader(fr); //�N����J�y�]�˦��a���w�İϪ��r�ſ�J�y
		*/
		//�ھڬy�X�{����m, �y�S�i�H����: �]�ˬy�Ϊ̳B�z�y �M �`�I�y
		//FileReader fr�O�@�Ӹ`�I�y
		//BufferedReader br �O�@�ӥ]�ˬy,�Ϊ̳B�z�y
	
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest01.java"));
	
		//�}�lŪ
		String temp = null;
		while((temp=br.readLine())!=null) { //br.readLine()��kŪ���@��, ���O������a�����
			System.out.println(temp); //��X�@��
		}
		
		
		//����
		//�`�N: �������ɭԥu�ݭn�����̥~�h���]�ˬy (�o�̦��@�Ӹ˹��̼Ҧ�)
		br.close();
	
	}
}
