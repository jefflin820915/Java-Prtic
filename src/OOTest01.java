import java.awt.peer.SystemTrayPeer;

/*
 	對象的創建和使用
 */
public class OOTest01 {
	
	public static void main(String[] args) {
		
		//int是基本數據類型
		//i是一個變數名
		//10是一個int類型的字面值
		int i = 10;
		
		//通過一個類可以實例化N個對象
		//實例化對象的語法: new 類名();
		//new是java語言當中的運算符
		//new運算符的作用是創建對象, 在JVM堆內存當中開闢新的內存空間
		//方法區內存: 在類加載的時候, class代碼片段被加載到該內存空間當中
		//棧內存(局部變數): 方法代碼片段執行的時候, 會給該方法分配內存空間在棧內存中壓棧
		//堆內存: new 的對象都在堆內存中存儲
		//Student是一個引用數據類型
		//s是一個變數名
		//new Student()是一個學生對象
		//s是一個局部變數
		//甚麼是對象? new運算符在堆內存中開闢的內存空間稱為對象
		//甚麼是引用? 引用是一個變數, 這個變數中保存了另一個java對象的內存地址
		//java中, 不能直接操作堆內存, java中沒有指針, 不像C語言
		//java中只能透過引用來訪問堆內存當中對象內部的實例變數
		Student s = new Student();
		
		//訪問實例變數的語法格式是: 
		//	讀取數據: 引用.變數名
		//	修改數據: 引用.變數名 = 值;
		/*
		int stuNo = s.no;
		String stuName = s.name;
		boolean stuSex = s.sex;
		int stuAge = s.age;
		String stuAddr = s.address;
		
		System.out.println(stuNo); //0
		System.out.println(stuName); //null
		System.out.println(stuSex);// false
		System.out.println(stuAge); //0
		System.out.println(stuAddr); //null
		*/
	
		System.out.println(s.no); //0
		System.out.println(s.name); //null
		System.out.println(s.sex);// false
		System.out.println(s.age); //0
		System.out.println(s.address); //null
	
		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.address = "新北";
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.sex);
		System.out.println(s.age); 
		System.out.println(s.address);
		
		//再通過類實例化一個全新的對象
		//stu是一個引用
		//stu是一個局部變數
		//Student是變數的數據類型
		Student stu = new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.age);
		System.out.println(stu.address);
		
		
		//錯誤, no這個實例變數不能採用"類名"的方式訪問
		//因為no是實例變數, 對象級別的變數, 變數存儲在java的內部, 必須先有對象
		//通過對象才能訪問no這個實例變數, 不能直接通過"類名"訪問
		//System.out.println(Student.no);
		
	}
}

/*
 	局部變數在棧內存存儲
 	成員變數的實例變數在堆內存的java對象內部存儲
 	
 	實例變數是一個對象一份, 100個對象有100份
 */

