
/*
	�ϥ�java�y��������V���
	
 */
public class Linked {
	
	//�`�I
	class Node{
		private String name;
		private Node next;
		
		public Node(String name) {
			this.name = name;
			next = null;
		}
	}
	//Field
	Entry entry;
	
	//�c�y��k
	Linked() {
		//�u���@���Y�`�I
		entry = new Entry(null,null);
	}
	//add
	public void add(Node node) {
		if(this.next == null) {
			this.next = node;	
		}else {
			this.next.add(node);
		}
	}
	//remove
	
	//find
	
	//�R�A������
static class Entry{
	
	//Field
	Object data;
	Entry next;
	
	//��~���Ѻc�y��k
	Entry(){
		
	}
	
	Entry(Object data,Entry next) {
		this.data = data;
		this.next = next;
	}
}
}
