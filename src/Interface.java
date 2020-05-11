
	/*
 *  接口也是一個引用類型, 可以等同看做類
 *  	1. 如何定義接口
 *  		[修飾符] interface 接口名 {}
 *  
 *  	2. 接口中之能出現常數,抽象方法 
 *  
 *  	3. 接口其實是一個特殊的抽象類,特殊在接口是純抽象的.
 *  
 *  	4. 接口中沒有構造方法,接口也無法被實例化
 *  	
 *  	5. 接口和接口之間可以多繼承
 *  	
 *  	6. 1個類可以實現多個接口.(這裡的實現可以等同看做繼承)
 *  
 *  	7. 一個非抽象的類實現接口,需要將接口中所有的方法"實現/重寫/覆蓋"
 */
public interface Interface {
	
	//常量(必須使用public static final修飾)
	public static final String SUCCESE = "succese";
	public static final double PI = 3.14;
	
	//public static final可以省略
	byte MAN_VALUE = 127;//常數
	
	//抽象方法(接口中所有的抽象方法都是public abstract)
	public abstract void m1();
	
	//public abstract是可以省略的
	void m2();
	
}

interface F{
	void m1();
}

interface G{
	void m2();
}

interface H{
	void m3();
}

interface E extends F,G,H{
	void m4();	
}

//implements是實現的意思,是一個關鍵字
//implements和extends意義相同
class MyClass implements F,G{

	public void m2() {
		
		
	}

	public void m1() {
		
	}
	
}

class J implements E{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
}