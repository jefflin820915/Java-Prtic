/*
 	�ݨD: 
 		�w�q�@�ӭp�����[�q��/���O��]
 			����
 			�~�P
 			�C��
 			
 		�w�q�@�Ӿǥ���
 			�Ǹ�
 			�m�W
 			�ǥͦ��@�x���O���q��
 		
 		�нs�g�Ӫ�ܥH�W����, �M����O�N���Ыج���H,��H�ƶq����, ���䤤�@�ӾǥͨϥΨ䤤�@�x�q��
 		
 		�M��sĶ�ùB��, �N��Ӱ���L�{�ιϧΤ覡�y�z
 		
 		�Ҧ����N�X�g���e��java����
 */

//������
public class OOTest06 {
public static void main(String[] args) {
	
	
	//�Ыعq����H
	Computer computer = new Computer();
	
	//��ʽ��
	//���ĥ��q�{��
	computer.brand = "ASUS";
	computer.style = "c111";
	computer.color = "red";
	
	//�Ыؾǥ͹�H
	Student2 student = new Student2();
	
	//��ʽ��
	//���ĥ��q�{��
	student.name = "student";
	student.no = 123;
	student.notepad = computer;
	
	//���o�Ӿǥ͸�q����H�������Y
	//�Q���D�ǥ͹q�����~�P
	System.out.println(student.notepad.brand);

	//�ק�~�P
	student.notepad.brand = "apple";
	
	System.out.println(student.notepad.brand);

	//�ǥͤS�R�F�@�x�s�q��, ������q�����F
	student.notepad = new Computer();
	System.out.println(student.notepad.brand);//null
}
}

//�ǥ���
class Student2{
	
		int no;
		String name;
		Computer notepad;
}

//�q����
class Computer{
	
	String brand;
	String style;
	String color;
	
}
