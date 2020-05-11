/*
	�ӫ~
 */
public class ShopingCarProduct {
	
	//Field
	private int no;
	private String name;
	private double price;
	
	public ShopingCarProduct(int no,String name,double price) {
			
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	//hashCode+equals
	//�ݨD: �p�G�ӫ~�s���M�ӫ~�W�r���@�˪�ܦP�@�Ӱӫ~
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
			if(o instanceof ShopingCarProduct) {
				ShopingCarProduct scp = (ShopingCarProduct)o;
				if(scp.no==this.no && scp.name.equals(this.name)){
					return true;
				}
			}
				return false;
	}
	
	//hashCode
	//�ӫ~�s�����榡: [1000-9999]
	public int hashCode() {
		return no/1000;
	}

	//setter and getter
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	//toString

	public String toString() {
		return "Product[�s��: "+no+",�W��: "+name+","+price+"��/��]";
	}
}
