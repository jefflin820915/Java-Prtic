
//��: ��i���X
public class Stack {
	
	//�ϥμƲզs�x�ƾ�
	//�̥i�H�s�x�h�Ӥޥ�����������
	Object[] elements;

	//���V�̳������W�誺�@�ӴV
	int index;
	
	//���q�{����l�Ʈe�q�O5
	//Constructor
	Stack() {
		this(5);
	}
	
	Stack(int max){
		elements = new Object[max];
	}

	//�����ӹ�~���Ѥ@�����̪���k
	
	public void push(Object elemant) throws StackOperationException{
		/*
		elements[index] = elemant;
		index++;
		*/
		
		if(index==elements.length) {
			//���`
			throw new StackOperationException("�̤w��");
		}
		
		elements[index++] = elemant;
	}
	

	//�����ӹ�~���Ѥ@�Ӽu�̪���k
	
	public Object pop() throws StackOperationException{ //�̳����������~�u
		/*
		index--;
		return elements[index];
		*/
		
		if(index==0) {
			throw new StackOperationException("�̤w��");
		}
		
		return elements[--index];
	
	
	}

}
