// �ڭ̩w�q����MethodTest2_01, �r���C��¦�, �O�мm��.
//���JAVESE���w���۱a����, �Ҧp: String.class, system.class, �o���������W�]�O�мm��
//�u�n�O���W�N�@�w�O�мm��

//��k�եΪ��ɭ�, �b�Ѽƶǻ����ɭ�, ��ڤW�ǻ����O�ܼƤ��O�s�����ӭ�
public class MethodTest2_01 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int retValue = sumInt(a,b);
		System.out.println(retValue);
	}

		public static int sumInt(int i, int j) {
			int result = i + j;
			int num = 3;
			int reValue = divide(result,num);
			return reValue;
		}

		
		public static int divide(int x, int y) {
			int z = x / y;
			return z;
}
}
/*
	���Ϩ̾�
	1. �u�n�O�A�Ψ�Ѽƶǻ������D, �ǻ����O�ܼƤ��O�s����
	2. �e�Ϫ��ɭ�, ������`��k�ۤW�ӤU�����Ǩ̦�����o�ӭ�h 
*/