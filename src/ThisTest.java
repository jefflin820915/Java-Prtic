
public class ThisTest {
	
	//����ܼ�(�ޥ�.���覡�X��)
	int num = 10;
	
	//�a��static����k
	//JVM�t�d�ե�main��k, JVM���ե�
	//ThisTest.main(String[]);
	public static void main(String[] args) {
		
		//�S����e��Hthis
		
		//�H�U�N�X�N��
		//�X�ݷ�e��Hnum�ݩ�
		
		//System.out.println(num);//�sĶ���~
		
		//System.out.println(this.num);//���~
		
		//�Q�X��num����
		ThisTest tt = new ThisTest();
		System.out.println(tt.num);
		
	}
}
