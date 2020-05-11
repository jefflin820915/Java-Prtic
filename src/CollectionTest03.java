import java.util.ArrayList;
import java.util.Collection;

/*
	boolean contains(Object o);	�P�_���X���O�_�]�t����
	boolean remove(Object o);	�R�����X���Y�Ӥ���
	
	�s�x�b���X�����������ӥh���gequals��k

 */
public class CollectionTest03 {
	
	public static void main(String[] args) {
		
		//�Ыض��X
		Collection c = new ArrayList();
		
		//�Ыب��Integer������H
		Integer i1 = new Integer(10);
		
		
		//�K�[����
		c.add(i1);
		
		//�P�_���X���O�_�]�ti1
		System.out.println(c.contains(i1)); //true
		
		//�Ы�Integer��������H
		Integer i2 = new Integer(10);
		
		//contains��k���h�ե�equals��k, �p�Gequals��^true,�N�O�]�t
		System.out.println(c.contains(i2)); //true
		
		Manager m1 = new Manager(100, "JACK");
		c.add(m1);
		
		System.out.println(c.contains(m1)); //true
		
		Manager m2 = new Manager(100, "JACK");
		
		//���gequals��k���e
		//System.out.println(c.contains(m2)); //false
		
		//���gequals��k����, ������e
		System.out.println(c.contains(m2)); //true
	
	}
}

class Manager{
	
	int no;
	String name;
	
	public Manager(int no,String name) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
	
	
	}

	//���gManger,equals��k
	//�ݨD�W�w: �p�G�s���M�m�W���ۦP�h��ܦP�@��Manager
	public boolean equals(Object o) {
		
		if(this==o) return true;
			if(o instanceof Manager) {
				Manager m = (Manager) o;
				if(m.no==this.no && m.name.equals(this.name)) {
					return true;
				}
			} 
				return false;
		}
	}