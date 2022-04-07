package com.program.string;

public class RevarseS {

	public static void main(String[] args) {
		String rvs="";
		String name="akal";
		int length=name.length();
		for(int i=length-1;i>=0;i--) {
			rvs=rvs+name.charAt(i);
			
			
			
		}
		System.out.println("The reverse string is "  +rvs);
		if(name.equals(rvs)) 
		{
			System.out.println(" palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}

}
