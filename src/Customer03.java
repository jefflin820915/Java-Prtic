import java.util.jar.Attributes.Name;

/*
 * ����Java�y������this����r
 		1.this�O�@������r,½Ķ��:�o��
 		2.this�O�@�Ӥޥ�,this�O�@���ܼ�,this�ܼƤ��O�s�F���s�a�}���V�F�ۨ�.this�s�x�bJVM�鷺�sjava��H����
 		3.�Ы�100��java��H,�C�ӹ�H����this,�]�N�O����100�Ӥ��P��this.
 		4.this�i�H�X�{�b"��Ҥ�k"��,�N���e���b����o�Ӱʧ@����H,(this�N���e��H)
 		5.�h�Ʊ��p�U"this"�O�i�H�ٲ���
 		6.this����ϥαa��static����k��
 */
public class Customer03 {

	//�m�W[�鷺�s����H�������s�x,�ҥH�X�ݸӼƾڪ��ɭ�,�������Ыع�H,�q�L�ޥΪ��覡]
	String name; //����ܼ�:�����ĥ�"�ޥ�."���覡�X�� 
	
	//�c�y��k
	public Customer03() {
		}


	//���a��Static����r���@�Ӥ�k
	//�U���ʪ����欰
	//�C���U���ʪ��̲ת����G���O���P��
	//�ʪ��o�Ӧ欰�O�ݩ��H�ŧO���欰
	//�ѩ�C�ӹ�H�b�����ʪ��o�Ӱʧ@���ɭԳ̲׵��G���P,�ҥH�ʪ��o�Ӱʧ@��������H���ѻP
	//���I: �S��static����r����k�Q�٬�"��Ҥ�k"
	//���I: �S��static����r���ܼƳQ�٬�"����ܼ�"
	//�`�N: ��@�Ӧ欰/�ʧ@���檺�L�{���O�ݭn��H�ѻP��,����o�Ӥ�k�@�w�n�w�q��"��Ҥ�k",���n�astatic����r
	
	//�H�U��k�w�q��"��Ҥ�k",�]���C���U�Ȧb�u���ʪ����ɭ�,�̲׵��G�����P��,�ҥH�o�Ӱʧ@�b�����ɥ�������H�ѻP
	
	public void shopping() {
		//��i�T�b�ʪ����ɭ�,��X:�i�T�b�ʪ�
		//����|�b�ʪ����ɭ�,��X:���|�b�ʪ�
		//System.out.println("XXXX�b�ʪ�!");
		
		//�ѩ�name�O�@��"����ܼ�",�ҥH�o��name�X�ݪ��ɭԤ@�w�X�ݷ�e��H��name
		//�h�Ʊ��p�U"this"�O�i�H�ٲ���
		System.out.println(name + "�b�ʪ�!");
	
		//����g�k:
		//System.out.println( this.name + "�b�ʪ�!");
	}


		//�a��static
	public static void doSome() {
		//�o�Ӱ���L�{���S��"��e��H",�]���a��static��k�O�q�L���W���覡�X�ݪ�
		//�εۻ�"�W�U��"���S����e��H,�۵M�]���s�bthis(this�N���e���b����o�Ӱʧ@����H)
		
		//�H�U����
		//doSome��k�եΤ��O��H�h�ե�,�O�@�����W�h�ե�,����L�{���S��"��e��H"
		//name�O�@�ӹ���ܼ�,�H�U�N�X���[�q�O:�X�ݷ�e��H��name,�S����e��H,�۵M�]����X�ݷ�e��H��name
		//System.out.println(name);
	
		//static����k�եΤ��ݭn��H,�����ϥ����W,�ҥH����L�{���S����e��H,�ҥH����ϥ�this
		//System.out.println(this);
	}

	public static void doOther() {
		//���]�Q�X��name�o�ӹ���ܼƪ������ӫ��
		//�i�H�ĥΥH�U���,���O�H�U��׵��藍�O�X�ݷ�e��H�����ename
		
		//System.out.println(name);
		//�Ыع�H
		Customer03 c = new Customer03();
		System.out.println(c.name); //�o�̳X�ݪ�name�Oc�ޥΫ��V��H��name
		
	}



}
