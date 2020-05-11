import java.io.FileInputStream;
import java.util.Properties;

/*
	IO+Properties

	dbinfo�o�˪����ڭ̺٧@�t�m���
	�t�m��󪺧@�δN�O: �ϵ{�ǧ�[���F��
	
	�`�N: �@��b�{�Ǥ��i�ܪ��F�褣�n�g��, ���˼g��t�m���
	�B��P�˪��{�Ǳo�줣�P�����G
	
	��dbinfo�o�ˤ@�Ө㦳�S���e���t�m���ڭ̤S�s��: �ݩʤ��
	java�W�d���n�D�ݩʤ��H".properties"����
	
	�ݩʤ�󤤼ƾڭn�D:
		key�Mvalue�����i�H�ϥ�"�Ů�", "�_��", "����"
			�p�G"�Ů�","����","�_��"����, ���̫e�����@�����j��
 */
public class IO_Properties01 {

	public static void main(String[] args) throws Exception{
		
		//1. �Ы��ݩʹ�H
		Properties p = new Properties(); //�Mmap�@��, �u���Lkey�Mvalue�u��s�x�r�Ŧ�����
										//key���୫��, �p�Gkey���ƫhvalue�л\
		
		//2. �Ыؿ�J�y
		FileInputStream fis = new FileInputStream("C:\\Users\\TEST\\Desktop\\dbinfo.properties");
		
		//3. �Nfis�y�����Ҧ��ƾڥ[�����ݩʹ�H��
		p.load(fis); //�ҥH�{�b�ݩʹ�H����(key=username=scott)
		
		//4. �����y
		fis.close();
		
		//5. �q�Lkey���value
		String v1 = p.getProperty("driver");
		String v2 = p.getProperty("url");
		String v3 = p.getProperty("username");
		String v4 = p.getProperty("password");
		
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
