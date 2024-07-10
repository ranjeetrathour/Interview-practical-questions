package com.codedecode.practice;

public class StringComparision {

	public static void main(String[] args) {
		String s="mohit";
		String s1 = "mohit";
		if(isEqual(s, s1)) {
			System.out.println("equal string");
		}else {
			System.out.println("not equal");
		}
	}
	
	public static boolean isEqual(String a, String b) {
		
		if(a.length()!=b.length()) {
			return false;
		}
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i))
				return false;
		}
		
		return true;
	}
}
