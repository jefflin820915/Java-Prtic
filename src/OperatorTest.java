/*
����java���B��Ť�: ��ƹB���
	+	�D�M
	-	�۴�
	*	���n
	/	��
	%	�D�l�� [����]
	
	++	�ۥ[1
	--	�۴�1
	
	�@�Ӫ�F�������h�ӹB���, �B��Ŧ��u����, ���T�w���[�p�A��, �u���űo�촣��
	�S�����n�h�M���O���u����.
 */
public class OperatorTest {
	public static void main (String[] args) {
		
		int i = 10;
		int j = 3;
		System.out.println(i + j); //13
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3
		System.out.println(i % j); //1
		
		
		//����++�B���[�ۥ[1]
		int k = 10;
		
		//++�B��ťi�H�X�{�b�ܼƫ᭱[��عB���]
		k ++;
		System.out.println(k); //11
		
		int y = 10;
		
		//++�B��ťi�H�X�{�b�ܼƫe��[��عB���]
		++ y;
		System.out.println(y); //11
		
		//++�B��ťi�H�X�{�b�ܼƫe��,�L�׬O�e��
		//�u�n++�B�⵲��,���ܼƤ����ȷ|�ۥ[1
		
		//++ �X�{�b�ܼƫ�
		//������ȹB��,�A���ܼƤ����O�s���ȥ[1
		int a = 100;
		int b = a ++;
		System.out.println(a); //101
		System.out.println(b); //100
		
		//++ �X�{�b�ܼƤ��e
		//���i��ۥ[1�B��, �A�i���Ⱦާ@
		int m = 20;
		int n = ++ m;
		System.out.println(m); //21
		System.out.println(n); //21
		
		
		int xx = 500;
		System.out.println(xx);
		
		int e = 100;
		System.out.println(e ++); //100
		System.out.println(e); //101
		
		int s = 100;
		System.out.println(++ s); //101
		System.out.println(s); //101
		
		System.out.println(--s); //100
		System.out.println(s++); //100
		System.out.println(s--); //101
		System.out.println(s--); //100
		System.out.println(s--); //99
		System.out.println(s); //98
}

}


/*
class A {

	public void m(int x){

}

	main{
		int i = 10;
		m(i);
	}
}
*/