/*
 * 	1. ���`�O�ƻ�?
 * 		���`�������O�{��@�ɤ�"�����`"���ƥ�.
 * 		java���ĥ�"��"�h�������`.
 * 		���O�i�H�Ыع�H.
 * 		NullPointerException e = 0x1234;
 * 		e�O�ޥ�����, e���O�s�����s�a�}���V�襤��"��H"
 * 		�o�ӹ�H�@�w�ONullPointerException����.
 * 		�o�ӹ�H�N��ܯu��s�b�����`�ƥ�
 * 		NullPointerException�O�@�����`.
 * 		
 * 		���M��H������
 * 		
 * 	2. ���`����@��
 * 		java�y�����ڭ̴��Ѥ@�ا��������`�B�z����
 		�@�άO: �{�ǭ��o�Ͳ��`����,���ڭ̿�X�ԲӲ��`
 		�{�ǳq�L�o�ӰT��,�i�H��{�Ƕi��@�ǳB�z,�ϵ{�ǧ�[����
 * 		 
 */
public class ExcaptionTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int c = a/b; //ArithmeticException e = 0x2323;
		
		//�W�����N�X�X�{�F���`,�S���B�z,�U���N�X���|����,�����h�XJVM,
		System.out.println("HW");
		
/*
�H�W�sĶ�q�L�F, ���O�B��ɥX�{�F���`, ��ܵo�ͤF�Y�Ӳ��`�ƥ�
JVM�V����x��X�p�U���T��
����: �{�ǰ���L�{���o�ͤF��Ʋ��`�o�Өƥ�, JVM���ڭ̳ЫؤF�@��ArithmeticException��������H
�åB�o�ӹ�H���]�t�F�ԲӪ����`�T��,�åBJVM�N�o�ӹ�H�����T����X�챱��x
Exception in thread "main" java.lang.ArithmeticException: / by 
zeroat ExcaptionTest.main(ExcaptionTest.java:24)
*/
	}
}
