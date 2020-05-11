/*標識符:能夠有權自己修改命名的單詞就是標識符
 * 標識符的元素:
 	*類名
 	*變數名
 	*方法名
 	*常數名
 	*接口名
 	....
*標識符命名規則[語法]
	*只由字母,數字,下划號"_",美元符號"$"組成, 不能含有其他符號
	*不能數字開頭
	*區分大小寫
	*關鍵字不能做標識符  ex:public,class,static,void.....etc
 *標籤符命名規範[非語法]
 	*最好見名知意
 		ex:
 			public class UserSevicer{
 				public void login(String username,String password){
 				}
 			     }
 	*遵守駝峰命名方式
 		SystemService
 		UserService
 		CustomService
 	*類名,接口名:  首字母大寫, 後面每個單字首字母大寫
 	*變數名,方法名: 首字母小寫, 後面每個單字首字母大寫
 	*常數名: 全部大寫
 *合法與不合法的標籤符
 	合法			不合法
 	-----------------------
 	_123Test	123Test
			    HelloWorld!
 	A_B_C		HelloWorld#
 	$ABC		Hellow World
 	class1		class
 	public0		public
 */
public class IdentiferTest01 { //IdentiferTest01:類名
	public static void main(String[] args) { //args:變數名    main:方法名
		}
}