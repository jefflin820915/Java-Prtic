/*
 * ����Object�̭�equals��k
 * Object����equals��k:
 * 	public boolean equals (Object obj){
 * 		return (this == obj);
 * 		}
 * 
 * 	o1.equals(o2); o1�Othis, o2�Oobj
 * 	== ����p�G�O�ޥ�����,�h������s�a�}, �a�}�ۦP�h�Otrue, �Ϥ��hfalse
 * 
 * Object����equals��k������O��ӤޥΪ����s�a�}
 * 
 * java��H����equals��k���]�p�ت�:	�P�_��ӹ�H�O�_�@��
 */
public class equals {
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		boolean b1 = o1.equals(o2);
		
		System.out.println(b1); //false
		
		Start s1 = new Start(100, "�����");
		Start s2 = new Start(100, "�����");
		Start s3 = new Start(110, "�����");
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //false
	
	}
}

class Start{
	
	//�����Ҹ�
	int id;
	String name;
	
	//Construotor
	public Start(int id,String name) {
		this.id = id;
		this.name = name;
	}

	//Object����equals��k������O���s�a�}
	//�{�ꤤ���~���޿�������Ӥ�����s�a�} ,���Ӥ�����e
	//�ҥHObject����equals��k�]�n���g
	//�ھڻݨD�W�w���gequals��k , �ݨD�W�w : �p�G�����Ҹ��@�P,�åB�W�r�]�@�P,�h�N��O�P�@�ӤH
	//s1.equals(s2)
	public boolean equals(Object obj) {
		 
		if(this==obj) return true;
		
		if(obj instanceof Start) {
		Start s = (Start)obj;
			if(s.id == this.id && s.name.equals(name)) {
			return true;	
			}
			}
		
		return false;
	}
	
}
