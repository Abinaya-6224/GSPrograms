package com.test;

public class ShortestPalindrome {

	public String solve(String s) {
		
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			if(isPalindrome(s,0,i))
			{
				String suffix=s.substring(i+1);
				String rev=revString(suffix);
				
				return rev+s;
			}
		}
		return s;
    }
	
	String revString(String s1)
	{
		String rev="";
		for(int i=0;i<s1.length();i++)
		{
			rev=s1.charAt(i)+rev;
		}
		return rev;
	}
	
	boolean isPalindrome(String s1,int left,int right)
	{
		while(left<right)
		{
			if(s1.charAt(left)!=s1.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestPalindrome sp=new ShortestPalindrome();
		String s1="aacecaaa";
		System.out.println(sp.solve(s1));
		String s2="race";
		System.out.println(sp.solve(s2));

	}

}

