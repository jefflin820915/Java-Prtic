//�U�Ȭ������~��
public class Exception11_1 {
	
	//��~���Ѥ@�ӵ��U����k
	public void register(String name) throws Exception11{
		
		//�������U
		if(name.length()<6) {
			//���`
			//�Ыز��`��H
			Exception11 e = new Exception11("�Τ�W���פ���֩�6��");
		
			//��ʩߥX���`
			//throw e;
			
			throw new Exception11("�Τ�W���פ���֩�6��");
			}
		
		//�p�G�N�X�����즹�B,�ҩ��Τ�W�O�X�k��
		System.out.println("���U���\");
	}
}
