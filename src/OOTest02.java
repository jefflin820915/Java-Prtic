//������
public class OOTest02 {

	public static void main(String[] args) {
		
		//�Ы�User��H
		//u�O�����ܼ�
		//u�O�@�Ӥޥ�
		//u�O�s���s�a�}���V�鷺�s��User��H
		User u = new User();
		
		//��XUser��H��������ܼƪ���
		System.out.println(u.no); //0
		System.out.println(u.name); //null
		System.out.println(u.addr); //null
		
		//�ק�u����H��������ܼƪ���
		u.no = 110;
		u.name = "jack"; //"jack"�O�@��java��H,�ݩ�Srring��H
		u.addr = new Adress();
		
		//�bmain��k���ثe�u�ݨ�@�Ӥޥ�"u"
		//�@�����u��q�Lu�Ӷi��X��
		System.out.println(u.name + "�~��b���ӫ���: " + u.addr.city);
		System.out.println(u.name + "�~��b���ӵ�D: " + u.addr.stree);
		System.out.println(u.name + "�l�s: " + u.addr.zipcode);
		
		u.addr.city = "�s�_";
		u.addr.stree = "������";
		u.addr.zipcode = "1111111";
		
		System.out.println(u.name + "�~��b���ӫ���: " + u.addr.city);
		System.out.println(u.name + "�~��b���ӵ�D: " + u.addr.stree);
		System.out.println(u.name + "�l�s: " + u.addr.zipcode);
		
		
	
	
	
	}
}
