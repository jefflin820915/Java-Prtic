import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.IIOException;

/*
 * �B�z���`����ؤ覡: 
 * 	1. �n���ߥX	thorws
 * 	2.����	try..catch
 * 
 * �H�U�{�Ǻt�ܲĤ@�ؤ覡: �n���ߥX, �b��k�n������m�W�ϥ�thorws����r�ߥX���`
 */

public class Exception03 {
	//public static void main(String[] args) throws FileNotFoundException{
	//public static void main(String[] args) throws IOException{
	public static void main(String[] args) throws Exception{
		//�Ыؤ���J�y,Ū�����
		//java�sĶ���p�󪾹D�H�U�N�X����L�{���X�{���`,java�sĶ���O�p�󪾹D�o�Ӳ��`�o�;��v������O
		//java�K�q�𤣬O���򴼯�.�]��:FIleImputStearm�o�ӫ��
		FileInputStream fis = new FileInputStream("C:/abc.txt");
}
}
//�H�W�{�ǽsĶ���q�L
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type FileNotFoundException

	at Exception03.main(Exception03.java:15)

*/