/*
 * ����java�y����final����r:
 * 		1. final�O�@������r,��̲ܳת�,���i�ܪ�
 * 		2. final�׹������L�k�Q�~��
 * 		3. final�׹�����k�L�k�Q�л\
 * 		4. final�׹����ܼƤ@����Ȥ��ᤣ�i���s���
 * 		5. final�׹�������ܼ�,������ʽ��,����ĥΨt���q�{��
 * 		6. final�׹����ޥ�
 * 			final�׹����ޥ����M���V�Y�ӹ�H���ᤣ����V��L��H,���O�ҫ��V����H���������s�O�i�H�ק諸.
 * 		7. final�׹�������ܼ�,�@��Mstatic�p�X�ϥ�,�Q�٬��`��
 * 	
 */
public class FinalTest01 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
	
	final int k = 100;
	//���~,�L�k���̲��ܼ�k���t��
	//k = 200;
	
	final int m;
	m = 200;
	//���~,�L�k���̲��ܼ�m���t��
	//m = 300;
	
	
	}
}