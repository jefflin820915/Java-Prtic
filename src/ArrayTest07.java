/*
 * ����main��k�����ѼƦC��String[] args
 * 
 * 1. String[] args�O�M���Ψӱ����R�O��Ѽƪ�
 * 
 * 2. �Ҧp: java ArrayTest07 abc def aaa 
 * 	JVM�b�ե�ArrayTest07�o������main��k���e, �� "abc def aaa"�o�Ӧr�Ŧ�H"�Ů�"���覡����, �M��s�x�bString�Ʋդ�
 */
public class ArrayTest07 {
	
	//main��k����String[]�Ʋժ��]�p�D�n�O�Ψӱ����R�O��Ѽƪ�
	public static void main(String[] args) {
		
		/*
		System.out.println("String���������Ʋդ����ӼƬO" + args.length);
	
		//�s��
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		//�ݨD����: �B��ӳn�󪺮ɭԥ������ѥΤ�W�M�K�X.
		//�榡: java ArrayTest07 username password
		//�p�G�Τ�S�����Ѩ������Ѽƫh�h�X�t��
		if(args.length != 2) {
			System.out.println("�n�Q�ϥθӨt��,�����o�˿�J: java ArrayTest07 username password");
			return;
		}
		//�Ѽƴ��ѥ��T, �p�G�Τ�W�Oadmin, �K�X�O123�h�n�J���\
		String username = args[0];
		String password = args[1];
		
		//java������r�Ŧ�O�_�۵�, �����ϥ�equals��k.
		//String�����OSUN���Ѫ�, �w�gequals���g�F, ������O���e.
		if("admin".equals(username) && "123".equals(password)) { //�o�ؤ覡�i�H�קK�ū��w���`
		//if(username.equals("admin") && password.equals("123")) {
			System.out.println("�n�J���\, �w��["+username+"]�^��");
		}else {
			System.out.println("�n�J����, �Τ�W["+username+"]���s�b�αK�X���~");
		}
	
	
	
	}
}
