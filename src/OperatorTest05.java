/*
 	�T���B���/�T�عB���/����B���
 		1. �y�k�W�h:
 			���L��F�� ? ��F��1 : ��F��2
 		
 		2. �T���B��Ū������z
 			���L��F�������G�Otrue���ɭ�, ��ܪ�F��1�@����Ӫ�F�������浲�G
 			���L��F�������G�Ofalse���ɭ�, ��ܪ�F��2�@����Ӫ�F�������浲�G
 */
public class OperatorTest05 {
	public static void main(String[] args) {
		
		//���~, ���O�@�ӧ��㪺�y�y
		//10;
		
		//���~, ���O�@�ӧ��㪺�y�y
		//'�k';
		
		//���L�������ܼ�
		boolean sex = false;
		
		//���~, ���O�@�ӧ��㪺�y�y
		//sex ? '�k' : '�k';
		
		char c = sex ? '�k' : '�k';
		System.out.println(c);
		
		sex = true;
		c = sex ? '�k' : '�k';
		System.out.println(c);
		
		//�y�k���~, ���~, ���G�i��OString, �]�i��Ochar, ���O�e�䤣���char�ӱ����ƾ�.
		//char c1 = sex ? "�k" : '�k;
		
		//�y�k���~, ���~, �������ݮe
		//sex = false;
		//char c1 = sex ? "�k" : '�k;
		
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');
		
		System.out.println(sex ? '�k' : "�k");
		
		String s = sex ? "�k��" : "�k��";
		System.out.println(s);
	}

}
