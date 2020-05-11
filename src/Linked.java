
/*
	使用java語言模擬單向鏈表
	
 */
public class Linked {
	
	//節點
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
	
	//構造方法
	Linked() {
		//只有一個頭節點
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
	
	//靜態內部類
static class Entry{
	
	//Field
	Object data;
	Entry next;
	
	//對外提供構造方法
	Entry(){
		
	}
	
	Entry(Object data,Entry next) {
		this.data = data;
		this.next = next;
	}
}
}
