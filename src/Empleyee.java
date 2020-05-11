class Employee{
	
	//Field
	private String name;
	
	//Constructor
	public Employee() {
		System.out.println("Employee的無參數構造方法執行");
	}

	public Employee(String name) {
		
		this.name = name;
	}
	
	//方法
	public void work() {
		System.out.println(name+"在工作! ");
		
	}
}