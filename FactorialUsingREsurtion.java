package com.program.tillarray;

public class FactorialUsingREsurtion {
	
	static int facto=1 , a=4;

	public static void main(String[] args) 
	{
	int re = FactorialUsingREsurtion.fact(a)	;
	System.out.println(re);

	}

   public static int fact(int a) {
	   if(a>1) {
		   facto=facto*a;
		   
		   fact(a-1);
	   }
	   
		return facto;
				
    	
    }
}

