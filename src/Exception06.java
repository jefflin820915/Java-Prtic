import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Exception06 {
	
	//�sĶ�L�k�q�L
	//IOException�S���B�z
	/*public static void main(String[] args) throws FileNotFoundException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();	
	}*/

	
	//�q�L
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();

	}*/


	//�q�L
	/*
	public static void main(String[] args) throws IOException{
		
		
		FileInputStream fis = new FileInputStream("abc");
		
		fis.read();
}*/
	
	
	
	
public static void main(String[] args){
		
	try {
		
		//�{�Ǧb����즹�B�o�ͤFFileNotFoundException���������`
		//JVM�|�۰ʳЫؤ@��FileNotFoundException��������H,�N�ӹ�H�����s�a�}��ȵ�catch�y�y������e�ܼ�
		FileInputStream fis = new FileInputStream("abc");
		
		//�W���N�X�X�{���`, try�y�y�����N�X���A�~�����,�����i�Jcatch�y�y��������
		System.out.println("TTTTTT");
		
		fis.read();
		
	}catch (FileNotFoundException e) { //e���s�a�}���V�襤�����ӹ�H�O"FileNotFoundException����
		
		System.out.println("Ū����󤣦s�b");
		
		//FileNotFoundException�NObject����toString��k���g�F
		System.out.println(e);//java.io.FileNotFoundException: abc (�t�Χ䤣����w���ɮסC)
		
	}catch (IOException e) {
		System.out.println("��LIO���`");
		
		}
	System.out.println("abc");
	}
}
