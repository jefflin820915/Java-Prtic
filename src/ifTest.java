/*
 ����java�y������if�y�y, ��ܵ��c, if�y�y�S�Q�٬�����y�y/���󱱨�y�y:
 	1. if�y�y���y�k���c: �|�ؽs�g�覡
 		�Ĥ@��:
 			if(���L��F��){
 				java�y�y;
 				java�y�y;
 				java�y�y;
 				.....
 			}
 		
 		�ĤG��:
 			if(���L��F��){
 				java�y�y;
 				java�y�y;
 				java�y�y;
 				....
 			}
 			else{
 				java�y�y;
 				java�y�y;
 				java�y�y;
 				...
 			}
 		
 		�ĤT��: 
 			if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}.....
 		
 		
 		�ĥ|��:
 			if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else if(���L��F��){
 				java�y�y;
 				java�y�y;
 				...
 			}else{
 				java�y�y;
 				java�y�y;
 				.....
 			}
 				
 		2. ���I: ���java��if�y�y�ӻ�, �u�n���@�Ӥ������, ���if�y�y��������.
 		
 		3. �`�N: �H�W���ĤG�ؽs�g�覡��ĥ|�ؽs�g�覡���a��else����, �o��ؤ覡�i�H100%�O�ҷ|���������.
 		
 		4. "�Ҧ�������y�y"�i�H���۴O�M�ϥΪ�, �u�n�X�z�O�M�N�i�H.
 			if(){
 				if(){
 					if(){
 					}
 				}
 			
 			}else{
 				if(){
 				}else{
 					if(){
 						if(){
 						
 						}
 					}
 				}
 			}
 			
 			�`�N: �O�M�ϥΪ��ɭԥN�X�榡�n�O�ҧ���.[���Y�i�ɥ����Y�i, �j�������p�U�ϥΤj�A���]��ݭn�Y�i]
 		{
 	{
 {
 			
 }
 	}
 	  	}
 	  
 	  5. if�y�y�����䤤�u���@��java�y�y����,�j�A���i�H�ٲ����g.
 	  	  if(true/false){
 	  	  	 �@��java�y�y;
 	  	  }
 	  	  
 	  	  if(true/false) �@��java�y�y;
 	  	  �o�ؤ覡�����˨ϥ�, �O�H�o�˼g������N��.
 		
 */
public class ifTest {
	public static void main(String[] args) {
		
		//�ݨD: �Ҧb��m���������d�򤧤����ּw�򪺸�, �hKFC�Y�ȶ�
		//������
		//double n = 6.0; //��� KM
		double n = 1.0;
		//�P�_�y�y
		if( n < 5 ) {
			System.out.println("�hKFC�Y���\!");
		}

		 /* ���]�t�ε��@�Ӧҥͦ��Z,���Z�i��a�p���I,���Z�n�D�d��O [0~100]
		          �ھھǥͪ����Z�P�_�Ӿǥͪ����Z����:
				[90-100] A
				[80-90]  B
				[70-80]  C
				[60-70]  D
				[0-60]   E
		  �H�W���޿�P�_��if�y�y����,
		 */	
		
		/*
		//double g = 90.0;
		//double g = 85.0;
		//double g = 75.0;
		//double g = 65.0;
		//double g = 55.0;
		double g = 120;
		if( g >= 90.0 ) {
			System.out.println('A');
		}else if( g >= 80.0){
			System.out.println('B');
		}else if( g >= 70.0){
			System.out.println('C');
		}else if( g >= 60.0){
			System.out.println('D');
		}else{
			System.out.println('E');
		} */
	
		double s = 59.5;
		
		//�ϥΥH�U�o�ؤ覡�i�H�����ݨD,���O�o�ؤ覡�Ĳv���C,�C��if���O��������,�W�ߪ�
		//�C��if���|�P�_�@��
		/*
		if() {
		
		}
		
		if() {
			
		}
		
		if() {
			
		} */
	
		//�ھڻݨD�M�w��ܥH�W���ĥ|�ص��c�ӧ����ݨD
		
		/*
		if( s < 0 || s > 100) {
			System.out.println("�藍�_, ���Z�d��W�X");
		}else if( s >= 90 && <= 100) { //�S���n�P�_�O�_<=100, ������o�̤@�w�O<=100
			
		} */
		
		s = 60.0;
		s = 110.0;
		s = -100;
		s = 90;
		s = 100;
		s = 0;
		
		if( s < 0 || s > 100) {
			System.out.println("�藍�_, ���Z�d��W�X");
		}else if( s >= 90 ) { //����P�_��o�̻������Z�@�w�O�b[0~100]
			System.out.println("�Ӿǥͦ��Z���ŬO: A");
		}else if( s >= 80 ) { //����P�_��o�̻������Z�@�w�p��90��
			System.out.println("�Ӿǥͦ��Z���ŬO: B");
		}else if( s >= 70 ) {
			System.out.println("�Ӿǥͦ��Z���ŬO: C");
		}else if( s >= 60)  {
			System.out.println("�Ӿǥͦ��Z���ŬO: D");
		}else {
			System.out.println("�Ӿǥͦ��Z���ŬO: E");
		}
		
		s = -100;
		s = 95.5;
		
		String gd = "�Ӿǥͦ��Z���ŬO: E";
		if( s < 0 || s > 100) {
			gd = "�藍�_, ���Z�d��W�X";
		}else if( s >= 90 ) {
			gd = "�Ӿǥͦ��Z���ŬO: A";
		}else if( s >= 80 ) {
			gd = "�Ӿǥͦ��Z���ŬO: B";
		}else if( s >= 70 ) {
			gd = "�Ӿǥͦ��Z���ŬO: C";
		}else if( s >= 60)  {
			gd = "�Ӿǥͦ��Z���ŬO: D";
		}
		System.out.println(gd);
	}
}