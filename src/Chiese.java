/*
 * "����H"��
 */
public class Chiese {
	
	//�����Ҹ�[�C�ӹ�H�������Ҹ����P]
	//����ܼ�
	 String id;
	
	//�m�W[�C�ӹ�H���m�W���P]
	//����ܼ�
	String name;
	
	//���y[�C�ӹ�H�ѩ󳣬O"chiese"����Ҥƪ�,�ҥH�C�Ӥ���H�����y���O"����"]
	//�L�׳q�Lchiese�o������ҤƦh�֭�java��H,�o��java��H�����y���O"����"
	//����ܼ�[����ܼƬO�@��java��H�N���@��,100��java��H,�N��100��country],���R�o�س]�p�覡���ƻ���I
	//����ܼƦs�xjava��H����,�b�鷺�s��,�b�c�y��k���檺�ɭԪ�l��
	//�Ҧ��H������H�����y���O"����",�o���n��������ܼ���M���X�A,�Ӯ��O�Ŷ�,�S���n���C�ӹ�H���O�d"���y"���s
	String country;
	
	//�c�y���
	public Chiese() {
		 
	}
	
	
	public Chiese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
}
