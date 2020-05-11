/*
 * this甚麼時候不能省略
 *  	用來區分實例變數和局部變數的時候,"this."不能省略
 */
//用戶類
public class User05 {
	
	//屬性
	private int id; //實例變數
	private String name;
	
	//構造函數
	//public User() {
		
	//}
	
	public User05(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	public User(int a,String s) {
		id = a;
		name = s;
	}
	*/
	/*
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	*/
	//setter and getter
	//public void serId(int a){
		//id = a; 
//}
	
	
	//以下程序的id和實例變數的id無關,不能採用這個方式 
/*	public void serId(int id) {
	id = id; 
	}
	*/
	
	
	/*
	public void serId(int id) {
		
		//等號前面的id是實例變數id
		//等號後面的id是局部變數id
		this.id = id; 
		}
		*/
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
