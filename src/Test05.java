/*
 * ����java�y�������h�A�y�k����:
 * 		1. Animal,Cat,Bird�T�������������Y
 * 			Cat�~��Animal
 * 			Bird�~��Animal
 * 			Cat�MBird�����S���~�����Y
 * 
 * 		2. ���V��H�T�j�S�x: �ʸ�,�~��,�h�A
 * 
 * 		3. ����h�A���A�Ψ�X�ӷ���:
 * 			�V�W�૬(upcasting)
 * 				�l����-->������
 * 				�S�Q�٬�:�۰������ഫ
 * 
 * 			�V�U�૬(downcating)
 * 				������-->�l����
 * 				�S�Q�٬�:�j�������ഫ[�ݭn�[�j�������ഫ��]
 * 
 * 			�L�׬O�V�W�૬�٬O�V�U�૬,����������������n���~�����Y
 * 			�S���~�����Y�{�ǬO�L�k�sĶ�q�L
 */
public class Test05 {
	
	public static void main(String[] args) {
		
		//�H�e�s�g���{��
		Animal02 a = new Animal02();
		a.move();
		
		Cat02 c = new Cat02();
		c.move();
		c.catchMouse();
		
		Bird02 b = new Bird02();
		b.move();
	
	
		//�ϥΦh�A�y�k����
		
		/* 1. Animal�MCat�����s�b�~�����Y,Animal�O����,Cat�O�l��
		 *
		 * 2. Cat is a Animal[�X�z]
		 * 
		 * 3. new Cat()�Ыت���H�����OCat,a2�o�ӤޥΪ��ƾ������OAnimal,�i���L�̶i��F�����ഫ
		 * �l�����ഫ��������,�٬��V�W�૬/upcasting,�Ϊ̺٬��۰������ഫ
		 * 
		 * 4. java�����\�o�ػy�k:�������ޥΫ��V�l������H 
		 */
		Animal02 a2 = new Cat02();
		//Bird b2 = new Cat02(); �sĶ����,�]����������������s�b�����~�����Y,�L�k�V�W�εۦV�U�૬
		/*
		 * 1. java�{�ǥû��������sĶ���q�M�B�涥�q
		 * 2. �����R�sĶ���q,�A���R�B�涥�q,�sĶ�L�k�q�L,�ڥ��O�L�k�B��
		 * 3. �sĶ���q�sĶ���ˬda2�o�ӤޥΪ��ƾ�������Animal,�ѩ�Animal.class
		 * �r�`�X����move()��k,�ҥH�sĶ�q�L.�o�ӹL�{�ڭ̺٬��R�A�j�w,�sĶ���q�j�w.
		 * �u���R�A�j�w���\����~�����򪺹B��
		 * 
		 * 4. �b�{�ǹB�涥�q, JVM�鷺�s���u��Ыت���H�OCat��H,����H�U�{�Ǧb�B�涥�q
		 * �@�w�|�ե�Cat��H��move()��k,���ɵo�͵{�Ǫ��ʺA�j�w,�B�涥�q�j�w
		 * 
		 * 5. �L�׬OCat�����S�����gmove()��k,�B�涥�q�@�w�O�ե�Cat��H��move()��k,�]�����h
		 * �u���H�N�OCat��H
		 * 
		 * 6. �������ޥΫ��V�l������H�o�ؾ���ɭP�{�Ǧb�sĶ���q�j�w�M�B�涥�q�j�w��ؤ��P���A/���A
		 * �o�ؾ���i�H�٬��h�A�y�k����
		 */
		a2.move();
		
		/*���R�H�U�{�Ǭ����򤣯�ե�?
		 * 		�]���sĶ���q�sĶ���ˬd��a2�������OAnimal����,
		 * 		�qAnimal.class�r�`�X��󤤬d��catchMouse()��k
		 * 		�̲רS�����Ӥ�k,�ɭP�R�A�j�w����,�S���j�w���\
		 * 		�]�N�O�sĶ����.
		 * 
		 */
		//a2.catchMouse();
		
		/*
		 * �ݨD: 
		 * 	���]�Q���H�W����H����catchMouse()��k,����
		 * 			a2�O�L�k�����եΪ�,�]��a2������Animal,Animal���S��catchMouse()�o�Ӥ�k
		 * 			�ڭ̥i�H�Na2�j�������ഫ��Cat����
		 * 			a2�������OAnimal(����),�ഫ��Cat����(�l��),�Q�٬��V�U�૬/downcasting/�j�������ഫ
		 * 	
		 * �����V�U�૬�]�ݭn������������������~�����Y,���M�sĶ����,�j�������ഫ�ݭn�[�j�������ഫ��
		 * 
		 *  �ƻ�ɭԻݭn�ϥΦV�U�૬?
		 *  	��եΪ���k�ε۳X�ݪ��ݩʬO�l�������S����,�b�����������s�b,�����i��V�U�૬
		 */
		Cat02 c2 = (Cat02)a2;
		c2.catchMouse();
		
		
		//�������ޥΫ��V�l������H[�h�A]
		
		Animal02 a3 = new Bird02();
		
		/*
		 * 1. �H�U�{�ǽsĶ�S�����D,�]���sĶ���ˬd��a3�ޥΪ��ƾ������OAnimal
		 * Animal�MCat�����s�b�~�����Y,�ӥBAnimal�O������,Cat�O�l����
		 * �������ഫ���l�����s���V�U�૬,�y�k�X��
		 * 
		 * 2. �{�����M�q�L,���b�B�涥�q�|��ܲ��`,�]��JVA�鷺�s
		 * ���u��s�b����H�OBird����,Bird��H�L�k�ഫ��Cat��H,�]��
		 * ��������������s�b�����~�����Y,���ɥX�{�ۦW�����`: 
		 * 					java.lang.ClassCastException
		 * 					�����ഫ���`,�o�ز��`�`�O�b"�V�U�૬���ɭ�"�o��
		 */
		
		//Cat02 c3 = (Cat02)a3;
		
		/*
		 * 1. �H�W���`�u���b�j�������ഫ���ɭԷ|�o��,�]�N�O��"�V�U�૬"�s�b���w(�sĶ�L�F,�B����F)
		 * 2. �V�W�૬�u�n�sĶ�q�L,�B��@�w���|�X���D. Animal a = new Cat()
		 * 3. �V�U�૬�sĶ�q�L,�B��i����~: Animal02 a3 = new Bird02();  Cat02 c3 = (Cat02)a3;
		 * 4. ����קK�V�U�૬�X�{��ClassCaseException
		 * 		�ϥ�instanceof�B��ťi�H�קK�X�{�H�W�����`
		 * 5. instanceof�B��ū���?
		 * 		5-1. �y�k�榡:
		 * 				(�ޥ� instanceof �ƾ�����)
		 * 		5-2. �H�W�B��Ū����浲�G�����O: boolean����,���G�i��Otrue/false
		 * 		
		 * 		5-3. ����B�⵲�Gtrue/fasle:
		 * 			���]:(a instanceof Animal)
		 * 			true���:
		 * 				a�o�ӤޥΫ��V����H�O�@��Animal����
		 * 			false���:
		 * 				a�o�ӤޥΫ��V����H���O�@��Animal����
		 * 
		 * 6. java�W�d���n�D: �b�i��j�������ഫ���e,��ĳ�ĥ�intanceof�B��i��P�_,�קKClassCastException���`���o��
		 */
		if(a3 instanceof Cat02) { //a3�O�@��Cat02��������H
			
			Cat02 c3 = (Cat02)a3;
			//�եΤl����H���S������k
			c3.catchMouse();
		}else if (a3 instanceof Bird02) { //a3�O�@��Bird02��������H
			Bird02 b2 = (Bird02)a3;
			//�եΤl����H���S������k
			b2.fly();
		}
	}
}



/*
 * class �H{
 * 	public void �]�B(){
 * 		system.out.println("���娭��");
 * 		}
 * }
 * 
 * class �B�ʭ� extends �H{
 * 	public void �]�B(){
 * 		system.out.println("����");
 * 		}
 * }
 * 
 * main{
 * 
 * 		�H ���| = new �H(); //���s�b�����ഫ
 * 		���|.�]�B();
 * 
 * 
 * 		�H �i�T = new �B�ʭ�();
 * 		�i�T.�]�B();
 * }
 * 
 * 
 * 
 */






