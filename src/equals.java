/*
 * 關於Object裡面equals方法
 * Object中的equals方法:
 * 	public boolean equals (Object obj){
 * 		return (this == obj);
 * 		}
 * 
 * 	o1.equals(o2); o1是this, o2是obj
 * 	== 兩邊如果是引用類型,則比較內存地址, 地址相同則是true, 反之則false
 * 
 * Object中的equals方法比較的是兩個引用的內存地址
 * 
 * java對象中的equals方法的設計目的:	判斷兩個對象是否一樣
 */
public class equals {
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		boolean b1 = o1.equals(o2);
		
		System.out.println(b1); //false
		
		Start s1 = new Start(100, "黃曉明");
		Start s2 = new Start(100, "黃曉明");
		Start s3 = new Start(110, "黃曉明");
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //false
	
	}
}

class Start{
	
	//身分證號
	int id;
	String name;
	
	//Construotor
	public Start(int id,String name) {
		this.id = id;
		this.name = name;
	}

	//Object中的equals方法比較的是內存地址
	//現實中的業務邏輯當中不應該比較內存地址 ,應該比較內容
	//所以Object中的equals方法也要重寫
	//根據需求規定重寫equals方法 , 需求規定 : 如果身分證號一致,並且名字也一致,則代表是同一個人
	//s1.equals(s2)
	public boolean equals(Object obj) {
		 
		if(this==obj) return true;
		
		if(obj instanceof Start) {
		Start s = (Start)obj;
			if(s.id == this.id && s.name.equals(name)) {
			return true;	
			}
			}
		
		return false;
	}
	
}
