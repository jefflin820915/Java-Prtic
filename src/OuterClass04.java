/*
 * �ΦW������: �u���O���S���W�r
 */
public class OuterClass04 {
	
	//�R�A��k
	public static void t(CustomerService01 cs) {
		
		cs.logout();
	}
	
	
	//�J�f
	public static void main(String[] args) {
		
		//�ե�t��k
		//t(new CustomerServiceImpl01());
		
		//�ϥΰΦW���������覡����t��k
		//��ӳo��"new CustomerService01(){}"�o�ӴN�O�ΦW������
		t(new CustomerService01() {
			
			@Override
			public void logout() {
				System.out.println("�t�ΰh�X");
			}
		});
	
		//�ΦW���������u�I: �֩w�q�@����.
		//���I: �L�k���ƨϥ�
	
	}
}



//���f
interface CustomerService01{
	
	//�h�X�t��
	void logout();
	
}

//�s�g�@������{ CustomerService01���f
/*
class CustomerServiceImpl01 implements CustomerService01{
	public void logout() {
		System.out.println("�h�X�t��");
	}
}*/