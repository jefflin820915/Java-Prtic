
//棧: 後進先出
public class Stack {
	
	//使用數組存儲數據
	//棧可以存儲多個引用類型的元素
	Object[] elements;

	//指向棧頂元素上方的一個幀
	int index;
	
	//棧默認的初始化容量是5
	//Constructor
	Stack() {
		this(5);
	}
	
	Stack(int max){
		elements = new Object[max];
	}

	//棧應該對外提供一個壓棧的方法
	
	public void push(Object elemant) throws StackOperationException{
		/*
		elements[index] = elemant;
		index++;
		*/
		
		if(index==elements.length) {
			//異常
			throw new StackOperationException("棧已滿");
		}
		
		elements[index++] = elemant;
	}
	

	//棧應該對外提供一個彈棧的方法
	
	public Object pop() throws StackOperationException{ //棧頂的元素往外彈
		/*
		index--;
		return elements[index];
		*/
		
		if(index==0) {
			throw new StackOperationException("棧已空");
		}
		
		return elements[--index];
	
	
	}

}
