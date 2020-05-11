import java.util.HashSet;
import java.util.Set;

/*
	關於往Set集合中存儲的元素, 該元素的hashCode和equals方法.
	
	HashMap中有一個Put方法, Put(key,value) key是無序不可重複的
	
	結論: 存儲在HashSet集合或著HashMap集合key部分的元素, 需要同時重寫hashCode+equals
 */
public class SetTest02 {

	public static void main(String[] args) {
		
		//創建集合
		Set es = new HashSet();
		
		Employeee e1 = new Employeee("1000", "JACK");
		Employeee e2 = new Employeee("1000", "JACK");
		Employeee e3 = new Employeee("1000", "SCOTT");
		Employeee e4 = new Employeee("2001", "SUN");
		Employeee e5 = new Employeee("3000", "JIM");
		Employeee e6 = new Employeee("3001", "COOK");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//添加元素
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		
		//查看集合元素個數
		System.out.println(es.size()); // 5
		
	}
}

//根據現實的業務邏輯得知:	該公司員工編號是: 1000 - 9999
class Employeee{
	
	//編號
	String no;
	
	//姓名
	String name;
	
	//構造方法
	Employeee(String no,String name) {
		this.name = name;
		this.no = no;
	
	}
	//重寫equals方法
	//如果員工編號相同, 並且名字相同,則是同一個對象
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Employeee) {
			Employeee e = (Employeee)o;
			if(e.no.equals(this.no)&& e.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	
	//重寫hashCode方法.
	public int hashCode() {
		//以員工編號分組
		return no.hashCode();
	}



}