
//�ϥ�BufferedReader��FileReader����close��k�i���X�i

//1.�˹��̼Ҧ����n�D: �Q�˹��̤��t���˹��̪��ޥ�
//2.�˹��̼Ҧ����n�D: �˹��̩M�Q�˹������ӹ�{�P�@�ӱ��f/���� 

public class BufferedReader extends Reader{ //BufferedReader �˹���

	//���p���Y
	Reader reader; //FileReader �N�O�Q�˹���
	
	
	//Constructor
	public BufferedReader(Reader reader) {
			this.reader = reader;
	 }

		//��FileReader����close��k�i���X�i
	public void close() {
		
		//�X�i
		System.out.println("�X�i�N�X1");
		reader.close();
		System.out.println("�X�i�N�X2");
	}

}
