
public class ExtendsTest02 {

	public static void main(String[] args) {
		C c = new C();
		c.doSome();//�եΪ�doSome��k�O��B�����~�ӹL�Ӫ�doSome��k
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