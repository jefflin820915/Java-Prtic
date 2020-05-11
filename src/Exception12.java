import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 重寫的方法不能比被重寫的方法拋出更寬泛的異常
 */

/*
class Exception12 {
	
	public void m1() {}

}

class B extends Exception12{
	
	//子類永遠無法拋出比父類更多的異常
	public void m1() throws Exception{}
} */


class AA {
	//public void m1() throws FileNotFoundException{
	public void m1() throws IOException{	
	}
}

class BB extends AA{
	//public void m1() throws IOException{
	public void m1() throws FileNotFoundException{
		}


}
