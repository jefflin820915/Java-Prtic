
public class Customer03Test {
	public static void main(String[] args) {
		
		//�Ы�Customer��H
		Customer03 c1 = new Customer03();
		c1.name = "TzuEn";
		
		//c1�ʪ�
		c1.shopping();
		
		//�A�Ы�Customer��H
		Customer03 c2 = new Customer03();
		c2.name = "list";
		
		//c2�ʪ�
		c2.shopping();
		
		//�ե�doSome(�׹��ŦC��W��static)
		//�ĥ�"���W."���覡�X��,��M�o�Ӥ�k�b���檺�ɭԤ��ݭn��H���ѥ[.
		Customer03.doSome();
		
		//�ե�doOther
		Customer03.doOther();
	}

}
