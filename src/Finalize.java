/*
 * 關於Object中的finalize方法
 * 		finalize方法甚麼時候調用
 			1. finalize方法每個java對象都有
 			2. finalize方法不需要程序員去調用,由系統去調用
 			3. java對象如果沒有更多的引用指向他,則java對象成為垃圾數據
 			等待垃圾回收器回收,垃圾回收器在回收這個java對象之前會自動調用該對象的finlize方法.
 		
 		finalize方法是該對象馬上就被回收了, 例如: 需要釋放資源, 則可以在該方法中釋放.
 */
public class Finalize {
	
	
	public static void main(String[] args) {
		
		//P erson p1 = new Person();
		
		 //p1 = null; //沒有引用在指向它, 等待回收
		
		//程序員只能"建議"垃圾回收器回收垃圾
		
		//System.gc();
		 
	}
}


//class Person{
	
	//重寫Object中finalize方法
	
	//public void finalize() throws Throwable{} 
		//System.out.println(this + "馬上就要被回收了");
		
		//讓引用再次重新指向該對象,該對象不是垃圾數據,不會被垃圾回收器回收
		//Person p = this;
//	}