package com.dream.Test03;


public class TestArgs {
	public static void main(String[] args) {
		int sum=add(1,2,3,4);
		System.out.println(sum);
	}
	public static int add(int ...is){
		int sum=0;
		for (int i = 0; i < is.length; i++) {
			sum+=is[i];
		}
		return sum;
	}
}
