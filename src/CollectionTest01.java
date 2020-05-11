import java.util.ArrayList;
import java.util.Collection;

/*
	boolean add(Object element); �V���X���K�[����
	int size();	������X���������Ӽ� 
	void clear();	�M�Ŷ��X
	boolean isEmpty();	�P�_���X���O�_������
	Object[] toArrary();	�N���X�ഫ���Ʋ�
	
	
	
	Iterator<E> iterator();	������X�Ҩ̿઺���N����H
	
	boolean contains(Object o);	�P�_���X���O�_�]�t�Y�Ӥ���
	boolean remove(Object o);	�R�����X���Y�Ӥ���
	
 */
public class CollectionTest01 {

	public static void main(String[] args) {
		
		//1.�Ыض��X
		Collection c = new ArrayList(); //�h�A
		
		//2.�K�[����
		c.add(1); //JDK5.0��, �۰ʸ˽c
		c.add(new Integer(100));
		
		Object o = new Object();
		c.add(o); //Collection���X�u���Ӧs�x����, �åB�u��s�x�ޥ�����
	
		Custom cus = new Custom("JACK", 20);
		c.add(cus);
	
	
		//3.��������Ӽ�
		System.out.println(c.size()); //4
		System.out.println(c.isEmpty()); //false
		
		//4.�N���X�ഫ��Object�������Ʋ�
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		
		//5.�M��
		c.clear();
		System.out.println(c.size()); //0
		System.out.println(c.isEmpty()); //true
	}	
}

class Custom{
	String name;
	int age;
	
	public Custom(String name,int age) {
		this.name = name;
		this.age = age;

	}
	//���gObjeect����toString
	public String toString() {
	return "Custom[name="+name+",age="+age+"]";	
	}

}