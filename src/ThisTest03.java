
public class ThisTest03 {
	
	//���
	String name;
	
	//���
	public void doSome() {
		System.out.println("do Some");
	}
	
	//�a��static
	public static void main(String[] args) {
		
		//�o�̨S��this
		
		/*System.out.println(name);
		doSome();
		
		System.out.println(this.name);
		this.doSome();*/
		
		ThisTest03 tt = new ThisTest03();
		System.out.println(tt.name);
		tt.doSome();
	}
}
