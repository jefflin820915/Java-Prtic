
public class ExtendsTest02 {

	public static void main(String[] args) {
		C c = new C();
		c.doSome();//調用的doSome方法是用B類中繼承過來的doSome方法
	}

}
class D{
	public void doSome() {
		System.out.println("do Some");
	}
}

class B extends D{
}

class C extends B{

}