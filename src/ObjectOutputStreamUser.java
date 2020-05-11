import java.io.Serializable; //該接口是一個"可序列化的"
						     //該接口沒有任何方法, 是一個標誌接口
							//像這樣的接口還有: java.lang.Cloneable;可克隆的

/*
	標誌接口的作用: 起到標誌的作用.
	JVM如果看到該對象實現了某個標誌接口, 會對他特殊待遇
	
	疑問: User實現Serializable接口, JVM對他的特殊待遇是甚麼?
*/
public class ObjectOutputStreamUser implements Serializable{

	String name;
	
	public ObjectOutputStreamUser(String name) {
		
			this.name = name;
	}


	public String toString() {
		return "User[name="+name+"]";
	}


}
