/*
	�bjava�y������{�h�u�{�Ĥ@�Ӥ覡,
		
		�Ĥ@�B: �~��java.lang.Thread;
		�ĤG�B: ���grun��k
 	
 	�T�Ӫ����I
 		�p��w�q�u�{
 		�p��Ыؽu�{
 		�p��Ұʽu�{
 */
public class ThreadTest02 {

	public static void main(String[] args) {
		
		//�Ыؽu�{
		
		Thread t = new Processor();
		
		//�Ұ�
		t.start(); //�o�q�N�X������������, �i�DJVM�A���t�@�Ӵ̵�t�u�{
				  //run��k���ݭn��ʽե�, �t�νu�{�Ұʤ���۰ʽե�run��k
		
		//t.run(); �o�O���q��k�ե�, �o�˰��{�ǥu���@�ӽu�{, run��k��������, �U�����{�Ǥ~���~�����
		
		
		//�o�q�N�X�b�D�u�{���B��
		for (int i = 0; i < 10; i++) {
			System.out.println("main->" + i );
		}
		
		//���F�h�u�{����, main��k�����u�O�D�u�{�̤��S����k�̴V�F
		//���O��L�u�{�Ψ�L�̤��٦��̴V.
		//main��k�����{�ǥi���٦b�B��
	}
}

//�w�q�@�ӽu�{
class Processor extends Thread{
	
	//���grun��k
	@Override
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			System.out.println("run->" + i);
		}
	}
	
}