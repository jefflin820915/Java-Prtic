
public class Test02 {
	
	//帶有static的方法
	public static void method1() {
		//調用doSome
		//使用完整方式調用
		//使用省略方式調用
		Test02.doSome();
		doSome();
		
		//調用doOther
		//使用完整方式調用
		//使用省略方式調用
		Test02 t02 = new Test02();
		t02.doOther();
		
		//訪問i
		//完整方式訪問
		//省略方式訪問
	System.out.println(t02.i);
	
	}
	
	//沒有static的方法
	public void method2() {
		//調用doSome
		//使用完整方式調用
		//使用省略方式調用
		Test02.doSome();
		doSome();
		
		//調用doOther
		//使用完整方式調用
		//使用省略方式調用
		this.doOther();
		doOther();
		
		//訪問i
		//完整方式訪問
		//省略方式訪問
		System.out.println(this.i);
		System.out.println(i);
	}
	
	//主方法
	public static void main(String[] args) {
		//要求在這裡編寫程序調用method1
		//使用完整方式調用
		//使用省略方式調用
		Test02.method1();	
		method1();
		
		
		//要求在這裡編寫程序調用method2
		//使用完整方式調用
		//使用省略方式調用
		Test02 t03 = new Test02();
		t03.method2();
		
	}
	//沒有static變數
	int i = 10;
		
	//帶有static的方法
	public static void doSome() {
		System.out.println("do Some");
	}

	//沒有static的方法
	public void doOther() {
		System.out.println("do Other");
	}

}


