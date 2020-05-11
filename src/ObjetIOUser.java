import java.io.Serializable;


//因為ObjectIOUser實現了Serializable接口, JVM會特殊待遇, 會給該類添加一個屬性, 
//static final long serialVersionUID = 8308883760975496240;
public class ObjetIOUser implements Serializable{

	//不讓系統自動生成, 自己寫一個序列化版本號
	
	static final long serialVersionUID = 21312412312L;
	
	//如果不想讓該屬性參加序列化, 需要使用transient關鍵字修飾
	
	transient String name;
	
	public ObjetIOUser(String name) {
		this.name = name;
	}

	public String toString() {
		return "User["+name+"]";
	}

}
