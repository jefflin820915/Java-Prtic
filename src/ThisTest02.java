/*
 * �b�a��static����k�����ઽ���եι���ܼƪ���k
 * �]������ܼƩM��Ҥ�k���ݭn��H���s�b
 * ��static��k���O�S��this��,�]�N�O����e��H�O���s�b��,
 * �۵M�]�L�k�X�ݷ�e��H������ܼƩM��Ҥ�k
 */
public class ThisTest02 {
	
	//�a��static
	//�D��k
	public static void main(String[] args) {

		//�ե�doSome��k
		ThisTest02.doSome();
		
		//�ե�doSome��k
		doSome();
		
		//�ե�doOther��k
		//[�sĶ���~]
		//��Ҥ�k�������Ыع�H,�q�L�ޥ�.���X��
		//ThisTest02.doOther();
		
		//doOther�O��Ҥ�k
		//��Ҥ�k�եΥ�������H���s�b
		//�H�U�N�X��ܪ��t�N:�եη�e��H��doOther��k
		//���Omain��k���S��this,�ҥH�H�U��k����ե�
		//doOther();
		//this.doOther();
		
		ThisTest02 tt = new ThisTest02();
		tt.doOther();
		
		tt.run();
	}
	
	//�a��static
	public static void doSome() {
		System.out.println("do Some");
	}

	//��Ҥ�k
	public void doOther() {
		//this��ܷ�e��H
		System.out.println("do Other");
	
	}
	
	
	//��Ҥ�k
	public void run() {
		//run�O��Ҥ�k,�ե�run��k���@�w�O����H�s�b��
		//�@�w�O���ЫؤF�@�ӹ�H�~��ե�run��k
		//�b�j�A�������N�X����L�{���@�w�O�s�b��e��H��
		//�]�N�O���o�̤@�w��"this"��
		System.out.println("run execute");
		
		//doOther��k�O�@�ӹ�Ҥ�k,��Ҥ�k�եΥ�������H���s�b
		//�H�U�N�X���t�N�N�O:�եη�e��H��doOther��k
		doOther();
		//this.doOther(); ������g�k
	}









}
