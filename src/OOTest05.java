//���յ{��
public class OOTest05 {
	public static void main(String[] args) {
		
		Customer c = new Customer();
		System.out.println(c.id); //0
		
		c = null;
		
		//�H�U�sĶ�i�H�q�L, �ŦX�y�k
		//�B��X�{�ū��w���`
		//�ŤޥγX��"���"�������ƾ�,�@�w�|�X�{�ū��w���`
		//java.lang.NullPointerException
		System.out.println(c.id);
	
	
	}
}

//��Ҭ������ƾ�: �o�ӼƾڳX�ݪ��ɭԥ�������H���ѻP. �o�ؼƾڴN�O��Ҭ������ƾ�