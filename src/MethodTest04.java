
//��k�եΪ��ɭԹ�ѩM�ΰѭn�D�Ӽƹ����ۦP, �ƾ����������ۦP
//�������P���ɭԭn�D����i������۰ʪ������ഫ
public class MethodTest04 {
	
	
	
	public static void main(String[] args) {
		
		//���~, �ѼƼƶq���P
		//MethodTest04.sum();
		
		//���~, ��ѩM�ΰѪ��������O�����ۦP��
		//MethodTest04.sum(true, false);
	
		//�i�H
		MethodTest04.sum(10L, 20L);
		
		//�s�b�۰������ഫ: int-->long
		MethodTest04.sum(10, 20);
		
		//���~, �Ѽ��������O�����ۦP��
		//MethodTest04.sum(3.0, 20);
	
		//�i�H
		MethodTest04.sum((long)3.0, 20);
	}

	//�ݨD
	public static void sum(long a,long b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}





}
