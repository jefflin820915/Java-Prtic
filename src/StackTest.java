
public class StackTest {

	public static void main(String[] args) {
		
		
		Stack s = new Stack();
		
		StackUser su1 = new StackUser("Jack", 20);
		StackUser su2 = new StackUser("SMITH", 21);
		StackUser su3 = new StackUser("FORD", 22);
		StackUser su4 = new StackUser("KING", 23);
		StackUser su5 = new StackUser("COOK", 24);
		
		try {
			s.push(su1);
			s.push(su2);
			s.push(su3);
			s.push(su4);
			s.push(su5);
			
			s.push(su5);
		} catch (StackOperationException e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			//¼u
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
			System.out.println(s.pop());
			
		} catch (StackOperationException e) {
			e.printStackTrace();
		}

	}

}


class StackUser{
	 
	String name;
	int age;
	
	StackUser(String name,int age) {
		this.name = name;
		this.age = age;
	}
		
	public String toString() {
		return "User[name="+name+",age="+age+"]";
	}
}