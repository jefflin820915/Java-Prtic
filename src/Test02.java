
public class Test02 {
	
	//�a��static����k
	public static void method1() {
		//�ե�doSome
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		Test02.doSome();
		doSome();
		
		//�ե�doOther
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		Test02 t02 = new Test02();
		t02.doOther();
		
		//�X��i
		//����覡�X��
		//�ٲ��覡�X��
	System.out.println(t02.i);
	
	}
	
	//�S��static����k
	public void method2() {
		//�ե�doSome
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		Test02.doSome();
		doSome();
		
		//�ե�doOther
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		this.doOther();
		doOther();
		
		//�X��i
		//����覡�X��
		//�ٲ��覡�X��
		System.out.println(this.i);
		System.out.println(i);
	}
	
	//�D��k
	public static void main(String[] args) {
		//�n�D�b�o�̽s�g�{�ǽե�method1
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		Test02.method1();	
		method1();
		
		
		//�n�D�b�o�̽s�g�{�ǽե�method2
		//�ϥΧ���覡�ե�
		//�ϥάٲ��覡�ե�
		Test02 t03 = new Test02();
		t03.method2();
		
	}
	//�S��static�ܼ�
	int i = 10;
		
	//�a��static����k
	public static void doSome() {
		System.out.println("do Some");
	}

	//�S��static����k
	public void doOther() {
		System.out.println("do Other");
	}

}


