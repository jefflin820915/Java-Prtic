/*
	����java�����i�ܪ��Ѽ�
 */
public class VarArgsTest01 {

	//m1��k���@�ӥi�ܪ��Ѽ�
	public static void m1(int... a) { //m1��k�b�եΪ��ɭ�, �ǻ�����ѥi�H�O0-N��
		
		System.out.println("Test");
	}
	
	//�p�G�i�H��T�ǰt����k, �h�եθӤ�k, ���|�A�h����i�ܪ��Ѽƪ���k
	public static void m1(int i ) {
		
		System.out.println(i);
	}
	
	//�i�ܪ��Ѽƥi�H���P�ݰ��Ʋ�
	public static void m2(String... args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void m3(Class... args) {
		
		for (int i = 0; i < args.length; i++){
			Class c = args[i];
			try {
			System.out.println(c.newInstance());
			}catch(Exception e) {
				
			}
		}
	}
	
	//�i�ܪ��Ѽƥu��X�{�@��, �åB�u��X�{�b�Ҧ��Ѽƪ��̫�@��
	//public static void m4(String... a,int i) {}
	
	public static void m4(int i,String... a) {}
	
	
	public static void main(String[] args) {
		
		m1();
		m1(1);
		m1(1,2);
		m1(3,4,5,6,7);
		
		m2("��|","����","�ȹC","����");
	
		String[] s = {"��|","����","�ȹC","����"};
		m2(s);
		
		m3(Date.class,Employee.class);
	}
}
