import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * �`�Jthorws
 */
public class ExceptionTest04 {
	public static void main(String[] args) throws FileNotFoundException{
		//m1();
		
		//�ϥ�thorws�B�z���`���O�u���B�z���`�ӬO�b�����d��
		//�ֽեδN�ߵ���
		//m1��k�p�G�X�{���`,�]���ĥΤW��,���FJVM, JVM�J��o���`�N�|�h�XJVM, �U�����o�ӥN�X���|����
		//System.out.println("WS");
		
		//�u���B�z
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println("WWWOO");
		}
	}

	public static void m1() throws FileNotFoundException{
		m2();
	}


	public static void m2() throws FileNotFoundException{
		m3();
	}


	public static void m3() throws FileNotFoundException{
		new FileInputStream("C:/ab.txt"); //FileInputStream�c�y��k�n����m�W�ϥ�thorws(�V�W��)
	}

}

/*
//�b�{�ǹL�{���o�ͤFFileNotFoundException���������`
//JVM���ڭ̳Ыؤ@��FileNotFoundException��������H
//�ӹ�H����a�H�U���T��.
//JVM�t�d�N�ӹ�H���T����X�챱��x
//�åBJVM�����F�{�Ǫ��B��

Exception in thread "main" java.io.FileNotFoundException: C:\ab.txt (�t�Χ䤣����w���ɮסC)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at ExceptionTest04.m3(ExceptionTest04.java:28)
	at ExceptionTest04.m2(ExceptionTest04.java:23)
	at ExceptionTest04.m1(ExceptionTest04.java:18)
	at ExceptionTest04.main(ExceptionTest04.java:9)

*/