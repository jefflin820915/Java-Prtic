class Employee{
	
	//Field
	private String name;
	
	//Constructor
	public Employee() {
		System.out.println("Employee���L�Ѽƺc�y��k����");
	}

	public Employee(String name) {
		
		this.name = name;
	}
	
	//��k
	public void work() {
		System.out.println(name+"�b�u�@! ");
		
	}
}