import java.io.FileInputStream;

/*
 * ����finally�y�y��
 * 	1.finally�y�y���i�H�����Ptry�y�y���p��. try....finally..
 * 	2.try...catch...finally �]�i�H
 * 	3.�bfinally�y�y�������N�X�@�w�|���檺
 */
public class Exception08 {
	
	public static void main(String[] args) throws Exception{
		
		/*try {
		
		System.out.println("ABC");
		return;
				
		}finally {
				
			System.out.println("Test");
		}*/
		
		/*
		try {
			
			FileInputStream fis = new FileInputStream("Test.java");
			
			//���|����
			System.out.println("TTT");
			
		} finally {
		
			//�|����
		System.out.println("AAAA");
		}*/
	
	
		//�u�n�b����finally�y�y�����e�h�XJVM, �hfinally�y�����|����
		try {
			
			//�h�XJVM
			System.exit(0);
			
		} finally {
		
			//���|����
			System.out.println("AAAA");
		}
	}
}
