/*
 	�C�Ӥ@�������i�H�s�g�D��k, ���@�뱡�p�U�@�Өt�Υu���@��,�ҥH�D��k�@��g�@��
 */

public class ProductTest { //�ӫ~������
	
	//�{�ǤJ�f
	public static void main(String[] args) {
		
		//�Ыع�H, �ӫ~��H
		//iphone7�����ܼ�
		//iphone7�ޥ�
		//iphone7�ܼƤ��O�s���s�a�}���V�鷺�s�����ӫ~��H
		Product iphone7 = new Product();
		
		//�X�ݹ���ܼƪ��y�k: �ޥ�.�ܼƦW 
		//Ū��: �ޥ�.�ܼƦW
		System.out.println("�ӫ~���s��: " + iphone7.productNo);
		System.out.println("�ӫ~�����: " + iphone7.price);
		
		//�ק�: �ޥ�.�ܼƦW = ��;
		iphone7.price = 6899.0;
		iphone7.productNo = 111;
		System.out.println("�ӫ~���s��: " + iphone7.productNo);
		System.out.println("�ӫ~�����: " + iphone7.price);
		
		/* ����, ����ܼƥ������Ыع�H,�q�L�ޥ�.���覡�X��,���ઽ���ϥ����W.���覡�X��
		System.out.println(Product.productNo);
		System.out.println(Product.price);
		*/
	}
}
