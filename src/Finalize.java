/*
 * ����Object����finalize��k
 * 		finalize��k�ƻ�ɭԽե�
 			1. finalize��k�C��java��H����
 			2. finalize��k���ݭn�{�ǭ��h�ե�,�Ѩt�Υh�ե�
 			3. java��H�p�G�S����h���ޥΫ��V�L,�hjava��H�����U���ƾ�
 			���ݩU���^�����^��,�U���^�����b�^���o��java��H���e�|�۰ʽեθӹ�H��finlize��k.
 		
 		finalize��k�O�ӹ�H���W�N�Q�^���F, �Ҧp: �ݭn����귽, �h�i�H�b�Ӥ�k������.
 */
public class Finalize {
	
	
	public static void main(String[] args) {
		
		//P erson p1 = new Person();
		
		 //p1 = null; //�S���ޥΦb���V��, ���ݦ^��
		
		//�{�ǭ��u��"��ĳ"�U���^�����^���U��
		
		//System.gc();
		 
	}
}


//class Person{
	
	//���gObject��finalize��k
	
	//public void finalize() throws Throwable{} 
		//System.out.println(this + "���W�N�n�Q�^���F");
		
		//���ޥΦA�����s���V�ӹ�H,�ӹ�H���O�U���ƾ�,���|�Q�U���^�����^��
		//Person p = this;
//	}