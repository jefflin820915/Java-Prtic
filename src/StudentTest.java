//�ǥʹ�����
public class StudentTest {
	public static void main(String[] args) {
		
		//�Ыؾǥ͹�H
		Student s = new Student();
		
		//�X�ݸӾǥͪ��ݩ�
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.sex);
		System.out.println(s.address);
		
		//����ܼƤ��ઽ���ĥ����W���覡�X��
		//system.out.println(Student.no);
		
		s.no = 10;
		s.name = "s";
		
		//�Ыؾǥ͹�H
		
		Student s2 = new Student();
		s2.name = "s2";
		System.out.println(s2.name);
	}

}
