/*
 	�����k�����k�ե�
 		1. �ƻ�O���k
 			��k�ۨ��եΦۨ�
 			a(){
 				a():
 			}
 		2. ���k�O�ܯӶO���s, ���k��k�i�H���δN����
 		
 		3. �H�U�{�ǹB�榳��[���O���`, �O���~Error]
 			java.lang.StackOverfolwError
 			�̤��s���X���~
 			���~�o�͵L�k���^, �u���@�ӵ��G, �u����JVM����
 		
 		4. ���k��������������, �S����������@�w�|�o�ʹ̤��s���X���~
 		
 		5. ���k�Y�Ϧ��F��������, �Y�ϵ�������O���T��, �]���i��o�ʹ̤��s���X���~.
 		�]�����k���Ӳ`�F
 		
 		�`�N:
 			���k�i�H���ϥκɶq�O��
 			���O���Ǳ��p�U�ӥ\�઺��{�����a���k�覡.
 */
public class RecursionTest01 {
	
	//�D��k
	public static void main(String[] args) {
		
		System.out.println("main begin");
		//�ե�doSome��k
		doSome();
		System.out.println("main over");
	}
	
	//�H�U�N�X���q���M�u���@��
	//���O�i�H�Q���ƽե�, �åB�u�n�ե�doSome��k�N�|�b�̤��s���s���t�@�����ݤ��s�Ŷ�
	public static void doSome() {
		System.out.println("doSome begin");
	
		doSome();//�o��N�X������, �U�@�椣�����
		
		System.out.println("doSome over");
	}
	
	

}
