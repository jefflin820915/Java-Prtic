/*
 �޿�B��� (���L�B���)
 	&	�޿�P	[�åB] 		(���䪺�⦡���Otrue, ���G�~�Otrue)
 	|	�޿��	[�Ϊ�]		(���䪺�⦡�u�n���@�ӬOtrue, ���G�N�Otrue)
 	!	�޿�D				(����, !false�N�Otrue, !true�N�Ofalse, ��عB���)
 	^	�޿貧��				(���䪺�⦡�u�n���@��, ���G�N�Otrue)
 	
 	&&	�u���P
 	||	�u����
 
  1. �޿�B��ŭn�D���䪺�⦡���O���L����, �åB�޿�B��ų̲ת��B�⵲�G�]�O�ӥ��L����.
  2. �u���P���޿�P�̲ת��B�⵲�G�O�ۦP, �u���L�u���P�s�b�u���{�H.
  3. �u���θ��޿�γ̲ת��B�⵲�G�O�ۦP, �u���L�u���Φs�b�u���{�H.
  4. �ƻ򱡪p�U�o�͵u��
  5. �ƻ�ɭԿ�ܨϥ��޿�B���, �ƻ�ɭԨϥεu���P�B���
 */
public class OperatorTest02 {
	public static void main(String[] args) {
		
		//�B����u���Ť��T�w, �[�p�A��
		System.out.println(5 > 3 & 5 > 2); //true
		System.out.println(5 > 3 & 5 > 6); 	//false
		System.out.println(5 > 3 | 5 > 6); //true
		
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		System.out.println(true | false); //true
		System.out.println(false | false); //false
		
		System.out.println(!false); //true
 		System.out.println(!true); //false
 		
 		System.out.println(true ^ false); //true
 		System.out.println(false ^ false); //false
 		System.out.println(true ^ true); //false
		
 		//�޿�P��u���P
 		int x = 10;
 		int y = 8;
 		
 		/*//�޿�P
 		System.out.println(x < y & ++x < y);
 		System.out.println(x); //11 */
 		
 		//�u���P
 		//x < y���G�Ofalse, ��Ӫ�F�����G�w�T�w�Ofalse
 		//�ҥH�᭱����F���S���A����, �o�ز{�H�Q�٬��u���{�H
 		//�u���P�~�|���u���{�H, �޿�P�O���|�s�b�u���{�H��
 		System.out.println(x < y && ++x < y); 
 		System.out.println(x); //10
 		
 		/*�q�Y���רӬݵu���P������. �ѩ�᭱����F���i�ण����.
 		     �ҥH����Ĳv�����o�ؤ覡�}�o���ϥθ��h,�u���P��`��
 		      ���O�S��~���޿��, �n�D����B�⦡�ݥ�������, 
 		      ���ɥ����ϥ��޿�P,����ϥεu���P, �ϥεu���P�i��ɭP�k���F�������� 
 		*/
 		
 		/*
 		  �ƻ򱡪p�o�͵u����
 		  		�Ĥ@�Ӫ�F�����浲�G�Otrue, �|�o�͵u����
 		 
 		  �ƻ򱡪p�o�͵u���P
 		  		�Ĥ@�Ӫ�F�����浲�G�Ofalse, �|�o�͵u���P
 		*/
	}

}
