
public class Test {
	public static void main(String[] args) {
		//���
		//���гy�H��H
		Owner  owner = new Owner();
		//���ĥΨt���q�{��
		//��ʽ��
		
		owner.id = "456789110";
		owner.name = "owner";
		owner.sex = true;
		owner.age = 100;
		
		//�A�гy�O�ֹ�H
		bigHouse bigHouse = new bigHouse();
		
		//���ĥΨt���q�{��
		//��ʽ��
		bigHouse.area = 500.0;
		
		//���O�֦��D�H
		bigHouse.owner = owner;
		
		//�Q���D�Фl�D�H���W�r�O�ƻ�?
		System.out.println(bigHouse.owner.name);
	
		//�Фl���D�H�F
		//���Ыؤ@�ӷs���D�H��H
		Owner owner2 = new Owner();
		owner2.name = "owner2";
		
		//���D�H
		bigHouse.owner = owner2;
		
		//�Q���D�Фl�D�H���W�r�O�ƻ�?
		System.out.println(bigHouse.owner.name);
		
	
	}
}
