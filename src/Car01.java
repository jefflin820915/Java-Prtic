
//生產汽車
public class Car01 {
	
	//屬性Field
	//引擎
	//面相接口編程
	Engine e; 
	
	//Constroutor
	Car01(Engine e){
		this.e = e;
	}
	
	//汽車能測試引擎
	public void testEngine() {
		e.start(); //面相接口相向
	}


}
