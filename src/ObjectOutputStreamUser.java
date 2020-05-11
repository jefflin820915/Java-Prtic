import java.io.Serializable; //�ӱ��f�O�@��"�i�ǦC�ƪ�"
						     //�ӱ��f�S�������k, �O�@�Ӽлx���f
							//���o�˪����f�٦�: java.lang.Cloneable;�i�J����

/*
	�лx���f���@��: �_��лx���@��.
	JVM�p�G�ݨ�ӹ�H��{�F�Y�Ӽлx���f, �|��L�S��ݹJ
	
	�ð�: User��{Serializable���f, JVM��L���S��ݹJ�O�ƻ�?
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
