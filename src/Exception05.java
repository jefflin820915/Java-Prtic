import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �B�z���`���ĤG�ؤ覡: ����..  try....catch..
 
 *	�y�k:
 *		try{
 		�i��X�{���`���N�X;
 		
 		}catch (���`����1 �ܼ�) {
 			
 			�B�z���`���N�X;
 		
 		}catch(���`����2 �ܼ�){
 			
 			�B�z���`���N�X
 		
 		}.....
 *	
 *	1. catch�y�y���i�H�g�h��
 *	2. ���O�q�W��Ucatch, �����q�p�������`��j�������`�i�殷��
 *	3. try...catch���̦h����1��catch�y�y��,���浲������ try...catch�N����
 */

public class Exception05 {
	public static void main(String[] args) {
		
		//�H�U�N�X�sĶ�L�k�q�L, �]��FileNotFoundException�S���B�z
		/*
		try {
			
			//FileNotFoundException
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			
		} catch (ArithmeticException e) {//���򪺲��`�O��Ʋ��`
			// TODO: handle exception
		}*/
	
		
		//�sĶ�q�L
		/*
			try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
			
				
			} catch (FileNotFoundException e) {
		}*/
	
		
		//�H�U�{�ǵL�k�q�L
		//�]���٦���h��IOException�S���B�z
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
			
				fis.read();
				
			} catch (FileNotFoundException e) {
	
	
			}*/
		
		
		
		//�sĶ�i�H�q�L
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
				
			}catch (FileNotFoundException e) {
	
	
			}catch (IOException e) {

			}*/
		
		
		//�sĶ�q�L
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
	
			}catch (IOException e) {

			}*/
		
		

		//�sĶ�L�k�q�L
		//catch�i�H�g�h��,�������q�W��U, �q�p��j����
		/*
		try {
			
			//FileNotFoundException
				FileInputStream fis = new FileInputStream("C:/ab.txt");
	
			}catch (IOException e) {

			}catch (FileNotFoundException e) {
		}*/
		
	}
}