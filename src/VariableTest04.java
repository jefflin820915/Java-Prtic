/*
 * ����K�ذ򥻼ƾ��������q�{��
	�ƾ�����						�q�{�� 
	-----------------------------------------
	byte,short,int,long			0
	float,double				0.0
	boolean						false	[true�O1 , false�O0]
	char						\u0000
 	�K�ذ򥻼ƾ��������q�{�ȬO�@���V0�ݻ�.
 */
public class VariableTest04 {

	//static�����[
	static int k = 1000;
	
	//�ܼ��٬O��u�o�ӻy�k, �������n��, �A��Ȥ~��X��
	//�����ܼƨS����ʽ�Ȩt�η|�q�{���[ �����ܼƤ��| ]
	static int f; //�����ܼ�
	
	public static void main(String[] args) {
		/*int i; //�����ܼ�
		System.out.println(i); */
		
		System.out.println(k);
		
		System.out.println(f); // 0
	}
}