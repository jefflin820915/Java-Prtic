import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
	BufferedReader
	
	File 4
	Buffered 4
	
	InputStream �ഫ�y
	Out
 */
public class BufferedReaderTest02 {

	public static void main(String[] args) throws Exception{
		
		/*
		//�Ыرa���w�İϪ��r�ſ�J�y
		//���r�`��J�y
		FileInputStream fis = new FileInputStream("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest02.java");
		
		//�ഫ�y(�N�r�`�y�ഫ���r�Ŭy)
		InputStreamReader isr = new InputStreamReader(fis); //isr�r�Ŭy
		
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//�H�W�Τ@���@�y
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/TEST/eclipse-workspace/123/src/BufferedReaderTest02.java")));
		
		//�}�lŪ
		String temp = null;
		 
		while((temp=br.readLine())!= null) {
			System.out.println(temp);
		}
		
		
		//����, �����̥~�h���y�Y�i(�˹��̼Ҧ�)
		
	
	}
}
