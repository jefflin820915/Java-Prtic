/*
 * 關於Object中的toString方法:
 * 		SUN在Object類中設計toString方法的目的: 返回java對象的字符串表示形式.
 * 
 * 		//在現實的開發過程中,Object裡面的toString方法已經不夠用了
 * 		因為Object的toString方法實現的結果不滿意
 * 
 * 		Object中的toString方法就是要被重寫的
 * 
 * 		SUN是這樣實現toString方法的:
 * 		public String toString(){
 * 
 * 			return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 		}
 * 
 * 		Object中的toSrring方法返回:	類名@java對象的內存地址經過哈希算法得出的int類型值再轉換成十六進制.
 * 		這個輸出結果可以等同於看做java對象在堆中的內存地址
 */
public class ToString {
	public static void main(String[] args) {
	
		//創建一個Object類型的對象
		Object o1 = new Object();
	
		//調用toString方法
		String oStr = o1.toString();
		
		System.out.println(oStr);//java.lang.Object@15db9742
	
		
		//創建一個Person類型的對象
		
		Person p1 = new Person("123", 45);
		
		//調用toString方法
		
		String pStr = p1.toString();
		System.out.println(pStr); //Person[name="+name+", age="+age+"]
		
		Person p2 = new Person("鞏俐", 50);
		
		System.out.println(p2.toString()); //Person[name=鞏俐, age=50]
		
		
		//print方法中後面括號中如果是一個引用類型,會默認調用引用類型的toString方法
		System.out.println(p2); //Person[name=鞏俐, age=50]
	
	
	}
}

class Person{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
}
	
	//重寫toString方法
	//根據項目的需求而定
	//需求規定,顯示格式:Person[name=劉德華, age=50]
	public String toString() {
		return "Person[name="+name+", age="+age+"]";
		
	}


}
