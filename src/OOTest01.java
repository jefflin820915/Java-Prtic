import java.awt.peer.SystemTrayPeer;

/*
 	��H���ЫةM�ϥ�
 */
public class OOTest01 {
	
	public static void main(String[] args) {
		
		//int�O�򥻼ƾ�����
		//i�O�@���ܼƦW
		//10�O�@��int�������r����
		int i = 10;
		
		//�q�L�@�����i�H��Ҥ�N�ӹ�H
		//��Ҥƹ�H���y�k: new ���W();
		//new�Ojava�y�������B���
		//new�B��Ū��@�άO�Ыع�H, �bJVM�鷺�s���}�P�s�����s�Ŷ�
		//��k�Ϥ��s: �b���[�����ɭ�, class�N�X���q�Q�[����Ӥ��s�Ŷ���
		//�̤��s(�����ܼ�): ��k�N�X���q���檺�ɭ�, �|���Ӥ�k���t���s�Ŷ��b�̤��s������
		//�鷺�s: new ����H���b�鷺�s���s�x
		//Student�O�@�Ӥޥμƾ�����
		//s�O�@���ܼƦW
		//new Student()�O�@�Ӿǥ͹�H
		//s�O�@�ӧ����ܼ�
		//�ƻ�O��H? new�B��Ŧb�鷺�s���}�P�����s�Ŷ��٬���H
		//�ƻ�O�ޥ�? �ޥάO�@���ܼ�, �o���ܼƤ��O�s�F�t�@��java��H�����s�a�}
		//java��, ���ઽ���ާ@�鷺�s, java���S�����w, ����C�y��
		//java���u��z�L�ޥΨӳX�ݰ鷺�s����H����������ܼ�
		Student s = new Student();
		
		//�X�ݹ���ܼƪ��y�k�榡�O: 
		//	Ū���ƾ�: �ޥ�.�ܼƦW
		//	�ק�ƾ�: �ޥ�.�ܼƦW = ��;
		/*
		int stuNo = s.no;
		String stuName = s.name;
		boolean stuSex = s.sex;
		int stuAge = s.age;
		String stuAddr = s.address;
		
		System.out.println(stuNo); //0
		System.out.println(stuName); //null
		System.out.println(stuSex);// false
		System.out.println(stuAge); //0
		System.out.println(stuAddr); //null
		*/
	
		System.out.println(s.no); //0
		System.out.println(s.name); //null
		System.out.println(s.sex);// false
		System.out.println(s.age); //0
		System.out.println(s.address); //null
	
		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.address = "�s�_";
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.sex);
		System.out.println(s.age); 
		System.out.println(s.address);
		
		//�A�q�L����ҤƤ@�ӥ��s����H
		//stu�O�@�Ӥޥ�
		//stu�O�@�ӧ����ܼ�
		//Student�O�ܼƪ��ƾ�����
		Student stu = new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.age);
		System.out.println(stu.address);
		
		
		//���~, no�o�ӹ���ܼƤ���ĥ�"���W"���覡�X��
		//�]��no�O����ܼ�, ��H�ŧO���ܼ�, �ܼƦs�x�bjava������, ����������H
		//�q�L��H�~��X��no�o�ӹ���ܼ�, ���ઽ���q�L"���W"�X��
		//System.out.println(Student.no);
		
	}
}

/*
 	�����ܼƦb�̤��s�s�x
 	�����ܼƪ�����ܼƦb�鷺�s��java��H�����s�x
 	
 	����ܼƬO�@�ӹ�H�@��, 100�ӹ�H��100��
 */

