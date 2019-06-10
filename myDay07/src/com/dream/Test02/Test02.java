package com.dream.Test02;

public class Test02 {

	public static void main(String[] args) {
		//二维数组动态初始化
		String[][] name;
		name=new String[2][3];
		name[0][0]="zzz";
		name[0][1]="xxx";
		name[0][2]="vvv";
		name[1][0]="qqq";
		name[1][1]="sss";
		name[1][2]="ggg";
		
		for (String[] strings : name) {
			for (String string : strings) {
				System.out.println(string);
			}
		}

	}

}
