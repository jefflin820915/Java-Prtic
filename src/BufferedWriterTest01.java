import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
	BufferedWriter
 */
public class BufferedWriterTest01 {

	public static void main(String[] args) throws Exception{
		
		//�Ыرa���w�İϪ��r�ſ�X�y
		//BufferedWriter bw = new BufferedWriter(new FileWriter("D:/aaaa.txt"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/aaaa.txt",true)));
		 
		//�}�l�g
		bw.write("���B!");
		
		//�g�J�@�Ӧ���j��
		bw.newLine();
		
		bw.write("�Ʊ�");
		
		//��s
		bw.flush();
		
		//����
		bw.close();
	}
}
