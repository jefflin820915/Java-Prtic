
public class Customer02Test {
	public static void main(String[] args) {
		
		Customer02 c = new Customer02();
		
		//�p�����ݩʤ���b�~���i��X��,�o�N�O�ʸ�
		//c.id =444;
		
		//�ާ@�J�f�ܦ��F�u��q�Lset�Mget��k�i��X��
		//�bset��k�Mget��k�i��L�{���i�H�w���L�o
		c.setAddr("�s�_");
		c.setAge(50);
		c.setId(100);
		c.setName("zhisyu");
		
		System.out.println(c.getId());
		System.out.println(c.getAddr());
		System.out.println(c.getAge());
		System.out.println(c.getName());
	}
}
