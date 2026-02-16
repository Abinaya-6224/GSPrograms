package com.test;

import java.util.Arrays;

public class RearrangeWords {
	
	public String rearrangeWords(String s) {
		
		String a[]=s.toLowerCase().split(" ");
		System.out.println("Origial sentences:"+
		String.join(" ", a));
		Arrays.sort(a,(x,y)->x.length()-y.length());
		
		a[0]=Character.toUpperCase(a[0].charAt(0))+a[0].substring(1);
		
		return String.join(" ", a);
		

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeWords r=new RearrangeWords();
		System.out.println("Rearrange sentences:"+r.rearrangeWords("Leetcode makes me happy"));
		System.out.println();
		System.out.println("Rearrange sentences:"+r.rearrangeWords("Keep calm and carry on"));
	}

}
