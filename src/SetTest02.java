import java.util.HashSet;
import java.util.Set;

/*
	����Set���X���s�x������, �Ӥ�����hashCode�Mequals��k.
	
	HashMap�����@��Put��k, Put(key,value) key�O�L�Ǥ��i���ƪ�
	
	����: �s�x�bHashSet���X�ε�HashMap���Xkey����������, �ݭn�P�ɭ��ghashCode+equals
 */
public class SetTest02 {

	public static void main(String[] args) {
		
		//�Ыض��X
		Set es = new HashSet();
		
		Employeee e1 = new Employeee("1000", "JACK");
		Employeee e2 = new Employeee("1000", "JACK");
		Employeee e3 = new Employeee("1000", "SCOTT");
		Employeee e4 = new Employeee("2001", "SUN");
		Employeee e5 = new Employeee("3000", "JIM");
		Employeee e6 = new Employeee("3001", "COOK");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//�K�[����
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		
		//�d�ݶ��X�����Ӽ�
		System.out.println(es.size()); // 5
		
	}
}

//�ھڲ{�ꪺ�~���޿�o��:	�Ӥ��q���u�s���O: 1000 - 9999
class Employeee{
	
	//�s��
	String no;
	
	//�m�W
	String name;
	
	//�c�y��k
	Employeee(String no,String name) {
		this.name = name;
		this.no = no;
	
	}
	//���gequals��k
	//�p�G���u�s���ۦP, �åB�W�r�ۦP,�h�O�P�@�ӹ�H
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Employeee) {
			Employeee e = (Employeee)o;
			if(e.no.equals(this.no)&& e.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	
	//���ghashCode��k.
	public int hashCode() {
		//�H���u�s������
		return no.hashCode();
	}



}