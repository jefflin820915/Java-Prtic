import java.io.Serializable;


//�]��ObjectIOUser��{�FSerializable���f, JVM�|�S��ݹJ, �|�������K�[�@���ݩ�, 
//static final long serialVersionUID = 8308883760975496240;
public class ObjetIOUser implements Serializable{

	//�����t�Φ۰ʥͦ�, �ۤv�g�@�ӧǦC�ƪ�����
	
	static final long serialVersionUID = 21312412312L;
	
	//�p�G���Q�����ݩʰѥ[�ǦC��, �ݭn�ϥ�transient����r�׹�
	
	transient String name;
	
	public ObjetIOUser(String name) {
		this.name = name;
	}

	public String toString() {
		return "User["+name+"]";
	}

}
