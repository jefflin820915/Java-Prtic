
/*
 * ��{��ҼҦ�
 * 
 * ��ҼҦ��n��
 * 	1. �c�y��k�p����
 *  2. ��~���Ѥ@�Ӥ��}���R�A�������e������H����k
 *  3. ���Ѥ@�ӷ�e�@���R�A�ܼ�
 *  
 *  ��ҼҦ��������:
 *  	�j�~����� : �b���[�����q�N�ЫؤF��H
 *  	�i�~����� : �Ψ��H���ɭԤ~�|�Ыع�H
 */
public class Singletom {	//�i�~�����

	private static Singletom s;
	
	
	//�N�c�y��k�p����
	private Singletom() {
		
	}
	
	//��~���Ѥ@�Ӥ��}����Singletom��H����k
	public static Singletom getSingletom() {
		
		if(s==null) {
			s = new Singletom();
		}
		
		return s;
		
	}

}
