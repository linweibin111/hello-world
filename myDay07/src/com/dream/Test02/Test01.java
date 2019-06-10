package com.dream.Test02;

public class Test01 {

	public static void main(String[] args) {

		//静态初始化
		String[][] name=new String[][]{{"aaa","ccc"},{"bbb","ddd","ggg"}};
		//设置指定下标上的元素
		name[0][1]="胖娃";
		//输出指定位置的元素
		String str=name[0][1];
		System.out.println(str);
		//获取长度：
		System.out.println("获取二维数组中一维数组的长度："+name.length);
		System.out.println("获取二维数组中第一个一维数组的长度："+name[0].length);
		System.out.println("获取二维数组中第二个一维数组的长度"+name[1].length);


		//遍历 -- for循环
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.println(name[i][j]);
			}
		}

		System.out.println("=======================================");

		//foreach 遍历
		for (String[] strings : name) {
			for (String string : strings) {
				System.out.println(string);
			}
		}




	}

}
