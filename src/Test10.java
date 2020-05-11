
public class Test10 {
	
	public static void main(String[] args) {
		
		/*
		Singletom s1 = new Singletom();
		Singletom s2 = new Singletom();
		
		System.out.println(s1 == s2);
		*/
		
		Singletom s1 = Singletom.getSingletom();
		Singletom s2 = Singletom.getSingletom(); 
		Singletom s3 = Singletom.getSingletom(); 
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	
		
		
		Customer04 c1 = Customer04.geCustomer04();
		Customer04 c2 = Customer04.geCustomer04();
		System.out.println(c1==c2);
	}
}
