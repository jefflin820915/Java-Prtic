
/*
 	����java�������c�y��k:
 		1. �c�y��k�S�Q�٬��c�y���/�c�y��/Constructor
 		2. �c�y��k���y�k���c:
 			[�׹��ŦC��] �c�y��k�W(�Φ��ѼƦC��){
 				�c�y��k��;
 			}
 		
 		3. ���q��k���y�k���c:
 			[�׹��ŦC��] ��^������ ��k�W(�Φ��ѼƦC��){
 				��k��;
 			}
 		
 		4. ���c�y��k�ӻ�, "��^������"���ݭn���w,�åB�]����gvoid
 		�u�n�g�Wvoid,�o�Ӥ�k�N�������q��k
 		
 		5. ���c�y��k�ӻ�,�c�y��k����k�W�����M���W�O���@�P
 		
 		6. �c�y��k���@��?
 			�c�y��k�s�b���N��,�q�L�c�y��k���ե�,�i�H�Ыع�H.
 		
 		7. �c�y��k���ӫ��ե�?
 			���q��k�O�o�˽ե�: ��k�׹��Ť���static���ɭ�: ����.��k�W(��ѦC��) �Ϊ� 
 							       ��k�׹��Ť��S��static���ɭ�: �ޥ�.��k�W(��ѦC��)
 			new �c�y��k�W(��ѦC��)
 			
 		8. �c�y��k�եέȦ椧��, ����^�ȶ�?\
 			�C�@�Ӻc�y��k���浲���᳣����^��,���O�o��"return"���ݭn�g,�c�y��k������java�{�Ǧ۰ʪ�^��
 			�åB��^�������O�c�y��k�Ҧb��������,�ѩ�c�y��k��^�������N�O������,�ҥH��^���������ݭn�s�g.
 			
 		9. ��@�������S���w�q����c�y��k,�t���q�{���������@�@�ӵL�Ѽƪ��c�y��k,�o�Ӻc�y��k�Q�٬��ʬٺc�y��
 		
 		10.��@������ܦa�N�c�y��k�w�q�X�ӤF,����t�Τ��b�q�{�{���o�������ѯʬٺc�y��,��ĳ�}�o����ʪ�����e�����ѵL�Ѽƺc�y��k
 			�]���L�Ѽƺc�y��k�ӱ`�ΤF
 			
 		11.�c�y��k�����������,�b�@�������s�g�h�Ӻc�y��k, �o�Ӧh�Ӻc�y��k�w�g�c����k��������
 */
public class ConstructorTest01 {
	public static void main(String[] args) {
		
		
		//�Ы�User��H
		//�ե�User�����c�y��k�ӧ�����H���Ы�
		//�H�U�{�ǳЫ�4�ӹ�H, �u�n�c�y��ƽեδN�|�Ыع�H, �åB�@�w�O�b"�鷺�s"���}�P���s�Ŷ�
		User04 u1 = new User04();
		User04 u2 = new User04(10);
		User04 u3 = new User04("1234");
		User04 u4 = new User04(10,"1234");
	
		//�a��static����k: ���W.
		ConstructorTest01.doSome();
		doSome();

		//�եΨS��static����k: �ޥ�.
		//doOther��k�bConstructorTest01����, �ҥH�ݭn�Ы�ConstructorTest01��H
		//�Ы�ConstructorTest01��H, �եεL�Ѽƺc�y��k
		ConstructorTest01 c = new ConstructorTest01(); // �@�������S������c�y��k����,�t���q�{�@�ӵL�Ѽƺc�y��
		c.doOther();
	
	}

	public static void doSome() {
		System.out.println("do Some");
	}

	public void doOther() {
		System.out.println("do Other");
	}




}
