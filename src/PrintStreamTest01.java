import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
	java.io.PrintStream; �зǪ���X�y, �q�{���L�챱��x, �H�r�`�覡
	java.io.PrintWriter; �H�r�Ū��覡
 */
public class PrintStreamTest01 {

	public static void main(String[] args) throws Exception{
		
		//�q�{�O��X�챱��x��
		System.out.println("HellowWorld");
		
		PrintStream ps = System.out;
		
		ps.println("JAVA....");

		//�i�H���ܿ�X��V
		System.setOut(new PrintStream(new FileOutputStream("D:/log"))); //log��x���
		
		//�A����X
		//System.out.println("HAHA");
		
		//�q�`�ϥΤW�����o�ؤ覡�O����x
		//�ݨD: �O����x, m1��k�}�l���檺�ɶ��M�������ɶ�. ������log���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("m1��k�}�l���檺�ɶ�" + sdf.format(new Date()));
		m1();
		System.out.println("m1��k���浲��" + sdf.format(new Date()));
		
		
	}
	
	public static void m1() {
		System.out.println("m1 method execute");
	}


}
