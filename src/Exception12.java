import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ���g����k�����Q���g����k�ߥX��e�x�����`
 */

/*
class Exception12 {
	
	public void m1() {}

}

class B extends Exception12{
	
	//�l���û��L�k�ߥX�������h�����`
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
