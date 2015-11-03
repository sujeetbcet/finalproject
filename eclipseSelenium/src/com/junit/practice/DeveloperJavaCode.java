package com.junit.practice;

public class DeveloperJavaCode {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public String concate(String str1, String str2)
	{
		
		return str1+str2;
	}
	public String reverse(String str)
	{
		String rstr="";
		for (int i = str.length()-1; i >=0 ; i--) {
			rstr+=str.charAt(i);						
		}		
		return rstr;				
	}	
	

}
