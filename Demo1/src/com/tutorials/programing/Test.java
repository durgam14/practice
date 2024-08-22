package com.tutorials.programing;

public class Test {

	public static void main(String[] args) {
		
		
		String name = "ilovejavtpoint";
		
		char ch[] = name.toCharArray();
		String rev = "";
		
		for(int i=ch.length-1;i>=0;i--) {
			rev += ch[i];
		}
		System.out.println(rev);
		
	}

}
