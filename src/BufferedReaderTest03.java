import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
	�����Τ���L��J 
 */
public class BufferedReaderTest03 {

	public static void main(String[] args) throws Exception{
		
		/*
		//�H�e���覡
		Scanner s = new Scanner(System.in); //System.in�O�@�ӼзǪ���J�y, �i�H�q�{������L����J
		
		//�{�ǰ���즹�B���U��, ���ݥΤ᪺��J
		String str = s.next();
		
		System.out.println("�A��J�F" + str);
		*/
		
		//�ϥ�BufferedReader�Ψӱ����Τ᪺��J
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//������J(�C�@���������@��)
		String str = br.readLine();
	
		System.out.println("�A��J�F" + str);
		
		//����
		br.close();
	
	}
}
