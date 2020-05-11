import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ����getMessage�MprintStackTrace��k������
 */
public class Exception07 {
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("C:/abc.txt");
			
			//JVM���ڭ̰���F�H�U�o�q�N�X
			//FileNotFoundException e = new FileNotFoundException(); //C:\abc.txt (�t�Χ䤣����w���ɮסC)
			 
		}catch (FileNotFoundException e) {
			
			//��X���`��̰T��
			//�@�뱡�p�U���|�ϥθӤ覡�h�ոյ{�� 
			e.printStackTrace();
			
			/*
		java.io.FileNotFoundException: C:\abc.txt (�t�Χ䤣����w���ɮסC)
			at java.io.FileInputStream.open0(Native Method)
			at java.io.FileInputStream.open(Unknown Source)
			at java.io.FileInputStream.<init>(Unknown Source)
			at java.io.FileInputStream.<init>(Unknown Source)
			at Exception07.main(Exception07.java:12)
			 */
		
			String msg = e.getMessage();
			System.out.println(msg); //C:\abc.txt (�t�Χ䤣����w���ɮסC)
		
		
		}
		
		//�o�q�N�X�|����
	System.out.println("ABC");
	
	
	
	
	}
}
