package com.program.string;

public class duplicateChar {

	public static void main(String[] args) 
	{   
		String string="alkla";
		int length=string.length();
		
		try {
			for(int i=0;i<=length-1;i++) 
		{
			    if(string.charAt(i)==string.charAt(i+1)) 
			    {
				System.out.println("Duplicate char is " +string.charAt(i));
			    
			    }
		}
		   }
		catch(StringIndexOutOfBoundsException e) 
		 {
			
		 }
		


	}

}
