import javax.management.BadAttributeValueExpException;

/*
 ����java����������B���:
 	������B��ť]�A���:
 		�򥻪���ȹB���
 		=
 		
 		�X�i����ȹB���
 		+=
 		-=
 		*=
 		/=
 		%=
 	��������B����u����: �����浥���k�䪺��F��,�N���浲�G��ȵ����䪺�ܼ�
 	
 	�`�N�H�U�N�X:
 		byte i = 10;
 		i += 5; ���P��: i = (byte)(i + 5);
 		
 		int k = 10;
 		k += 5; ���P��: k = (int)(k + 5);
 		
 		long x = 10L;
 		int y = 20;
 		y += x; ���P��: y = (int)(y + x);
 
 		����: �X�i������ȹB��Ť����ܹB�⵲�G����,���]�̪�o���ܼƪ������Obyte����,
 			�L�׫��i��l�[�ΰl��,�̲׸��ܼƪ��ƾ������٬Obyte����
 */
public class OperatorTest03 {
	public static void main(String[] args) {
		
		//�򥻪���ȹB���
		int i = 10;
		
		System.out.println(i); //10
		
		i = i + 5;
		
		System.out.println(i); //15
		
		//�X�i����ȹB��� [+= �B��ťi�H½Ķ��"�l�[/�֥["]
		i += 5; //���P��: i = i + 5; 
		
		System.out.println(i); //20
		
		i -= 5; //���P��: i = i - 5;
		
		System.out.println(i); //15
		
		i *= 2; //���P��: i = i * 2;
		
		System.out.println(i); //30
		
		i /= 4; //���P��: i = i / 4;
		
		System.out.println(i); //7
		
		i %= 2; //���P��: i = i % 2;
		
		System.out.println(i); //1
		
		//---------------------------------------
		//10�S���W�Xbyte���Ƚd��i�H�������
		byte b = 10;
		
		//b = 15; �i�H,15�S���W�Xbyte���Ƚd��
		
		//�sĶ���u�ˬd�y�k,���B��{��,�sĶ���o�{b+5�������Oint����,��b�ܼƪ��ƾ������Obyte
		//�j�e�q�V�p�e�q�ഫ�ݭn�[�j�������ഫ��,�ҥH�H�U���~
		//b = b + 5;
		
		b = (byte)(b + 5);
		
		System.out.println(b);
		
		byte x = 10;
		x += 5; //���P��: x = (byte)(x + 5); ���ä����P��: x = x + 5;
		System.out.println(x);
		
		byte z = 0;
		x += 128; // z = (byte)(z + 128);
		System.out.println(z); //-128 [�l�����]
		
		z += 10000; // ���P��: z = (byte)(z + 10000);
		System.out.println(z); //-112
		

}
}
