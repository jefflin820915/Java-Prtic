 /*
 * 1.�p��w�q��H��?
 * 		class����r�e�[abstract
 * 
 * 2. ��H���L�k�Q��Ҥ�
 * 
 * 3. ���M��H���S����k��Ҥ�, ���O��H���]���c�y��k
 * 
 * 4. ��H�����i�H�w�q��H��k.
 * 		��H��k���y�k: �b��k���׹��ŦC���K�[abstract����r,�åB��H��k���ӥH";"����,����a��"{}"
 * 		�Ҧp: public abstract void m1();
 * 
 * 5. ��H�������@�w����H��k,����H��k�����X�{�b��H����
 * 
 * 6. �@�ӫD��H�����~�ө�H��,�����N��H��������H��k��{/�л\/���g
 */
public abstract class Abstract {
	
	//Construotor
	Abstract() {
		System.out.println("123");
	}
	
	//��H��k
	public abstract void m1();
	
	//�J�f
	public static void main(String[] args) {
		
		//��H���L�k�Ыع�H
		//Abstract a = new Abstract();
		
		//�h�A
		Abstract a = new K();
		
	}
}

class K extends Abstract{
	
	public void m1() {
		
	} 
	
	K(){
		super();//�������c�y��k���M�եΤF,���O�èS���Ыؤ�����H
		System.out.println("321");
	}
}