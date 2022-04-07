package com.program.tillarray;
//use of continues statement
public class PrimeNumber 
{
    static int no=86687;
	public static void main(String[] args) 
	{
	  for(int i=2;i<no;i++) 
	  {
		 if(no%i==0) 
		      {
			 System.out.println("not prime number");
			 break;
			
			}
		 else {
			 System.out.println("prime number");
			 break;
		 }
	  }
		
	}

}
