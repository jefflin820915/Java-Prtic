/*
 	�ʸ˪��B�J:
 	1.�Ҧ��ݩʨp����,�ϥ�private����r�׹�,private��ܨp����,�׹��Ҧ��ƾڥu��b�������X��
 	2.��~����²�檺�ާ@�J�f,�]�N�O�H��~���{�ǷQ�X��age�ݩʥ����q�L�o��²�檺�J�f�i��X��
 		��~���Ѩ�Ӥ��}����k,���O�Oset��k��get��k
 		�Q�ק�age�ݩ�,�ե�set��k
 		�QŪ��age�ݩ�,�ե�get��k
 	
 	3.set��k���R�W�W�d:
 		public void set+�ݩʦW���r���j�g(�ΰ�){
 		}
 		
 		public void setAge(int a){
 			age = a;
 		}
 	4.get��k���R�W�W�d:
 		public int getAge(){
 			return age;
 		} 
 		
 	�@���ݩʳq�`�X�ݪ��ɭԥ]�A�X�اΦ�?
 		�Ĥ@�ؤ覡:�QŪ���o���ݩʪ���, get
 		�ĤG�ؤ覡:�Q�ק�o���ݩʪ���, set
 		
 	setter and getter��k�S��static����r
 	��static����r�׹�����k:���W.��k�W(���);
 	�S��static����r�׹�����k:�ޥ�.��k�W(���);
 */
public class User03 {
	
	
	//�ݩʨp����
	private int age;
	
	//set��k�S����^��, �]��set�u�t�d�ק�ƾ�
	/*
	 	public void setAge(int age){
	 		age = age; //java���N�i��h,�b�o�̨��S����age���,�o�̪�age���O�����ܼ�
	 	}
	 */

	//setter
	public void setAge(int a) {
		//�s�g�P�_
		//age = a;
		if(a<0 || a>150) {
			System.out.println("�W�X�d��");
			return;
		}
		//�p�G�{�ǥi�H�����o�̪���, ����a�O�b�d��,�h�i���ȹB��
		age = a;
	}

	//getter
	public int getAge() {
		return age;
	}
}
