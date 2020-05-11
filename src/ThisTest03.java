
public class ThisTest03 {
	
	//實例
	String name;
	
	//實例
	public void doSome() {
		System.out.println("do Some");
	}
	
	//帶有static
	public static void main(String[] args) {
		
		//這裡沒有this
		
		/*System.out.println(name);
		doSome();
		
		System.out.println(this.name);
		this.doSome();*/
		
		ThisTest03 tt = new ThisTest03();
		System.out.println(tt.name);
		tt.doSome();
	}
}
