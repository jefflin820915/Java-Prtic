import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//�ʪ���

public class ShopingCar {
	
	//�ϥ�Map�s�x�ӫ~����
	Map<ShopingCarProduct,Integer> productMap;
	
	//�`��
	double totalPrice;

	//�c�y��k
	public ShopingCar() {
		productMap = new HashMap<ShopingCarProduct, Integer>();
	}
	
	
	//��~���Ѥ�k
	//1.�K�[�@�Ӱӫ~���ʪ���
	
	public void add(ShopingCarProduct p) {
		add(p,1);
	}
	
	//2.�K�[N�Ӱӫ~���ʪ���
	
	public void add(ShopingCarProduct p,int n) {
		//�P�_���ʪ������O�_�t���Ӱӫ~
		if(!productMap.containsKey(p)) {	
			productMap.put(p, n);//�۰ʸ˽c
		}else {
			//�������Ӱӫ~
			int before = productMap.get(p).intValue(); //�K�[�ӫ~���e���Ӱӫ~�ƶq
			int after = before+n;
			productMap.put(p, after); //key����Value�л\
		}
	
		//�ק��`��
		totalPrice += p.getPrice()*n;
	}

	//3.�R��N�Ӱӫ~
	public void remove(ShopingCarProduct p,int n) {
		
		int before = productMap.get(p).intValue(); 
		
		//�p�G�ʪ����Y�ӫ~���ƶq�Mn�O�۵���, �����R����ӱ���
		if(before==n) {
			productMap.remove(p);
		}else {
			int after = before-n;
			productMap.put(p, after); 
		}

	
		//�ק��`��
		totalPrice -= p.getPrice()*n;
		
	}
	
	//4.�R���@�Ӱӫ~
	public void remove(ShopingCarProduct p) {
		remove(p, 1);
	}


	//5.�M���ʪ���
	public void clear() {
		productMap.clear();
		totalPrice = 0.0;
	}

	//6.��X�ʪ����Գ�
	/*
	 	�榡:
	 	�ʪ��Գ�:
	 		10	ī�G		10��
	 		3	���		30��
	 		................
	 				�`��:40...
	 */
	public void print() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("�ʪ��Գ�: \n");
		
		//�M��Map
		Set<ShopingCarProduct> keys = productMap.keySet();
		Iterator<ShopingCarProduct> it = keys.iterator();
		while(it.hasNext()) {
			ShopingCarProduct k = it.next();
			Integer v = productMap.get(k);
			sb.append("\t" + v.intValue() + "\t" + k + "\t" + v.intValue()*k.getPrice()+"\n");
		}
			sb.append("\t\t\t\t\t\t\t\t�`��: " + totalPrice+"��" );
	
			
			System.out.println(sb);
	}
	
	
	
}
