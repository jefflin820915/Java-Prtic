/*
 * �ƻ�ɭԦb�B�檺�ɭԥX�{�ū��w���`�O
 * 		�ŤޥγX�ݹ�Ҭ������ƾ�,�]����Ҭ������ƾڴN�O��H�������ƾ�,
 * 		�X�ݳo�ǹ�Ҽƾڤ@�w�|�X�{�ū��w���`
 *
 * ��Ҭ������ƾڥ]�A:
 * 		��Ҽƶq[��H�ݭn�s�b]
 * 		��Ҥ�k[��H�ݭn�s�b]
 */
public class Test03 {
	public static void main(String[] args) {
		Test03.doSome();
		doSome();
		
		Test03 t = new Test03();
		t.doSome();
		
		//�ޥά���
		t = null;
		
		//�a��static����k,���J�i�H�ĥ����W���覡�X��,�]�i�H�ĥΤޥΪ��覡�X��
		//���O�Y�ϱĥΤޥΪ��覡�h�X��,��ڤW���檺�ɭԩM�ޥΫ��V����H�L��.
		//�beclipese���}�o���ɭ�,�ϥΤޥΪ��覡�X�ݱa��static����k,�{�Ƿ|�X�{ĵ�i
		//�ҥH�a��static����k�٬O��ĳ�ϥ�"���W."���覡�X��
		t.doSome();//�o�̤��|�X�{�ū��w���`
	}
	
	//�a��static����k,�ݭn�ϥ�"���W."���覡�ӳX��
	public static void doSome() {
		System.out.println("do Some");
	}
}
