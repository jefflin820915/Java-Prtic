/*
	java.lang.StringBuffer;
	java.lang.StringStringBuilder;
	
		1.StringBuffer�MStringBuilder�O�ƻ�?
			�O�@�Ӧr�Ŧ�w�İ�
			
		2.�u�@���
			�w���b���s���ӽФ@���Ŷ�,�H�e�Ǧr�Ũt�C
			�p�G�w�d���Ŷ�������,�h�i��۰��X�e,�H�e�ǧ�h���r�Ũt�C
			
		3.StringBuffer,StingBuilder�MString�̤j���ϧO�O�ƻ�
			String�O���i�ܪ��r�Ũt�C, �s�x�b�r�Ŧ�`�Ʀ���
			StringBuffer���h�O�@��char�Ʋ�, ���Ochar�ƲլO�i�ܪ�,�åB�i�H�۰��X�e
			
		4.StringBuffer�MStringBuilder���q�{��l�Ʈe�q�O16
		
		5.�p���u��StingBuffer�MStringBuilder
			�̦n�b�Ы�StringBuffer���e, �w��StringBuffer���s�x�ƶq,
			�M��A�Ы�StringBuffer���ɭԱĥΫ��w��l�Ʈe�q���覡�Ы�StringBuffer
			���F��֩��h�Ʋժ�����, �����Ĳv
		
		6.StringBuffer�MStringBuilder���ϧO
			
			StringBuffer�O�u�{�w���� (�i�H�b�h�u�{�����ҤU�ϥΤ��|�X�{���D)
			StringBuilder�O�D�u�{�w���� (�b�h�u�{���ҤU�ϥΥi��X�{���D)
 */
public class String_Buf_Bui {

	public static void main(String[] args) {
		
		//�Ыئr�Ŧ�w�İϹ�H
		StringBuffer sb = new StringBuffer();  //16
	
		//�i�H�VStringBuffer���l�[�r�Ŧ�
		String[] ins = {"��|","����","��ı","����"};
		
		//���˦r�Ŧ��W�c�����ϥ�StringBuffer�Ϊ�StringBuilder
		for (int i = 0; i < ins.length; i++) {
			
			if(i==ins.length-1) {
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
	
		System.out.println(sb);
	
	}
	
}
