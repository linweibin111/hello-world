package com.dream.Test02;

public class Test01 {

	public static void main(String[] args) {

		//��̬��ʼ��
		String[][] name=new String[][]{{"aaa","ccc"},{"bbb","ddd","ggg"}};
		//����ָ���±��ϵ�Ԫ��
		name[0][1]="����";
		//���ָ��λ�õ�Ԫ��
		String str=name[0][1];
		System.out.println(str);
		//��ȡ���ȣ�
		System.out.println("��ȡ��ά������һά����ĳ��ȣ�"+name.length);
		System.out.println("��ȡ��ά�����е�һ��һά����ĳ��ȣ�"+name[0].length);
		System.out.println("��ȡ��ά�����еڶ���һά����ĳ���"+name[1].length);


		//���� -- forѭ��
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.println(name[i][j]);
			}
		}

		System.out.println("=======================================");

		//foreach ����
		for (String[] strings : name) {
			for (String string : strings) {
				System.out.println(string);
			}
		}




	}

}
